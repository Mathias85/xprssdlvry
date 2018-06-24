package mathias.vanhack.skip.controller;

import mathias.vanhack.skip.auth.util.JsonUtil;
import mathias.vanhack.skip.model.pojos.Order;
import mathias.vanhack.skip.services.OrderService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import spark.Route;
import spark.Spark;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
public class OrdersController {

    @Value("${server.endpoint.order}")
    private String endpointOrder;

    @Autowired
    private OrderService orderService;


    @PostConstruct
    public void init() {

        Spark.get(endpointOrder.concat("/:ORDER_ID"), getorder, JsonUtil::toJson);
        Spark.delete(endpointOrder.concat("/:ORDER_ID"), cancelOrder, JsonUtil::toJson);
        Spark.post(endpointOrder, placeOrder, JsonUtil::toJson);
    }

    private final Route getorder = (request, response) -> {

        final Integer orderId = Optional.of(request.params("ORDER_ID"))
                .map(Integer::valueOf)
                .orElseThrow(() -> new IllegalArgumentException("Order ID is not a number."));

        final Optional<Order> order = orderService.findOrder(orderId);

        if (order.isPresent()) {
            return order.get();
        }

        Spark.halt(HttpStatus.SC_NOT_FOUND);
        return null;
    };

    private final Route placeOrder = (request, response) -> {

        Order order = JsonUtil.fromJson(request.body(), Order.class);

        order = orderService.placeOrder(order);

        response.status(HttpStatus.SC_CREATED);

        return order;
    };

    private final Route cancelOrder = (request, response) -> {

        final Integer orderId = Optional.of(request.params("ORDER_ID"))
                .map(Integer::valueOf)
                .orElseThrow(() -> new IllegalArgumentException("Order ID is not a number."));

        final Optional<Order> order = orderService.findOrder(orderId);

        if (order.isPresent()) {
            response.status(HttpStatus.SC_OK);
            return order.get();
        }

        Spark.halt(HttpStatus.SC_NOT_FOUND);
        return null;

    };

}
