package mathias.vanhack.skip.services;

import mathias.vanhack.skip.model.pojos.Order;

import java.util.Optional;

public interface OrderService {

    Optional<Order> findOrder(Integer orderId);

    Order placeOrder(Order order);

    Order cancelOrder(Integer orderId);
}
