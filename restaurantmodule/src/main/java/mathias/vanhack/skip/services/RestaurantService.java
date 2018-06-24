package mathias.vanhack.skip.services;

import mathias.vanhack.skip.model.pojos.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    List<Restaurant> listRestaurants();

    Optional<Restaurant> findRestaurant(Integer restId);

}
