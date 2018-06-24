package mathias.vanhack.skip.services.impl;

import mathias.vanhack.skip.enums.OrderStatus;
import mathias.vanhack.skip.model.daos.FoodDao;
import mathias.vanhack.skip.model.daos.OrderDao;
import mathias.vanhack.skip.model.daos.OrderFoodDao;
import mathias.vanhack.skip.model.definitions.Tables;
import mathias.vanhack.skip.model.pojos.Order;
import mathias.vanhack.skip.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderFoodDao orderFoodDao;

    @Autowired
    private FoodDao foodDao;

    public Optional<Order> findOrder(final Integer orderId) {

        final Optional<Order> order = orderDao.fetchOptional(Tables.XD_ORDER.ORDER_ID, orderId);

        order.ifPresent(_order -> {

            _order.setOrderFoods(orderFoodDao.fetchByOrderIdTable(_order.getOrderId()));
            // TODO: Fetch all related Food at once, then set on proper OrderFood.
            _order.getOrderFoods().forEach(_of -> _of.setFood(foodDao.fetchOneByIdTable(_of.getFoodId())));
        });

        return order;
    }

    @Transactional
    public Order placeOrder(Order order) {

        // TODO: Validation

        order.setDateCreated(LocalDateTime.now());
        order.setOrderStatus(OrderStatus.PROCESSING);
        order.setTotalPrice(
                order.getOrderFoods().stream()
                        .mapToDouble(_of -> _of.getAmount() * _of.getPrice())
                        .sum()
        );

        orderDao.insert(order);

        order.getOrderFoods().forEach(_of -> _of.setOrderId(order.getOrderId()));
        orderFoodDao.insert(order.getOrderFoods());

        return order;
    }

    @Override
    public Order cancelOrder(Integer orderId) {

        final Optional<Order> order = orderDao.fetchOptional(Tables.XD_ORDER.ORDER_ID, orderId);

        // TODO: Validate if order can be canceled.

        order.ifPresent(_order -> {
            _order.setOrderStatus(OrderStatus.CANCELED);
            orderDao.update(_order);
        });

        return order.orElse(null);
    }
}
