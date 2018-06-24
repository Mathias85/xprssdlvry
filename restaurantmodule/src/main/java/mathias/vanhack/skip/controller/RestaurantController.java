package mathias.vanhack.skip.controller;

import mathias.vanhack.skip.auth.util.JsonUtil;
import mathias.vanhack.skip.model.pojos.Restaurant;
import mathias.vanhack.skip.services.RestaurantService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import spark.Route;
import spark.Spark;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
public class RestaurantController {

    @Value("${server.endpoint.restaurant}")
    private String endpointRestaurant;

    @Autowired
    private RestaurantService restaurantService;

    @PostConstruct
    public void init() {

        Spark.get(endpointRestaurant, listRestaurants, JsonUtil::toJson);
        Spark.get(endpointRestaurant.concat("/:REST_ID"), getRestaurant, JsonUtil::toJson);

    }

    private final Route listRestaurants = (request, response) -> {

        return restaurantService.listRestaurants();
    };

    private final Route getRestaurant = (request, response) -> {

        final Integer restid = Optional.of(request.params("REST_ID"))
                .map(Integer::valueOf)
                .orElseThrow(() -> new IllegalArgumentException("Restaurant ID is not a number."));

        final Optional<Restaurant> restaurant = restaurantService.findRestaurant(restid);

        if (restaurant.isPresent()) {
            return restaurant.get();
        }

        Spark.halt(HttpStatus.SC_NOT_FOUND);
        return null;
    };


}
