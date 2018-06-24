package mathias.vanhack.skip.services.impl;

import mathias.vanhack.skip.model.daos.FoodDao;
import mathias.vanhack.skip.model.daos.RestaurantDao;
import mathias.vanhack.skip.model.definitions.Tables;
import mathias.vanhack.skip.model.pojos.Restaurant;
import mathias.vanhack.skip.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    @Autowired
    private FoodDao foodDao;

    @Override
    public List<Restaurant> listRestaurants() {
        return restaurantDao.findAll();
    }

    @Override
    public Optional<Restaurant> findRestaurant(Integer restId) {

        final Optional<Restaurant> restaurant = restaurantDao.fetchOptional(Tables.FD_RESTAURANT.REST_ID, restId);

        restaurant.ifPresent(_rest -> {
            _rest.setFoods(foodDao.fetchByRestIdTable(_rest.getRestId()));
        });

        return restaurant;
    }
}
