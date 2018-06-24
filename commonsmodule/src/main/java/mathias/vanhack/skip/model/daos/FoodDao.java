/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.daos;


import mathias.vanhack.skip.model.pojos.Food;
import mathias.vanhack.skip.model.records.FoodRecord;
import mathias.vanhack.skip.model.tables.FoodTable;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.11.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@Repository
public class FoodDao extends DAOImpl<FoodRecord, Food, Integer> {

    /**
     * Create a new FoodDao without any configuration
     */
    public FoodDao() {
        super(FoodTable.XD_FOOD, Food.class);
    }

    /**
     * Create a new FoodDao with an attached configuration
     */
    @Autowired
    public FoodDao(Configuration configuration) {
        super(FoodTable.XD_FOOD, Food.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(Food object) {
        return object.getFoodId();
    }

    /**
     * Fetch records that have <code>food_id IN (values)</code>
     */
    public List<Food> fetchByFoodIdTable(Integer... values) {
        return fetch(FoodTable.XD_FOOD.FOOD_ID, values);
    }

    /**
     * Fetch a unique record that has <code>food_id = value</code>
     */
    public Food fetchOneByIdTable(Integer value) {
        return fetchOne(FoodTable.XD_FOOD.FOOD_ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<Food> fetchByNameTable(String... values) {
        return fetch(FoodTable.XD_FOOD.NAME, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<Food> fetchByDescriptionTable(String... values) {
        return fetch(FoodTable.XD_FOOD.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>price IN (values)</code>
     */
    public List<Food> fetchByPriceTable(Double... values) {
        return fetch(FoodTable.XD_FOOD.PRICE, values);
    }

    /**
     * Fetch records that have <code>rest_id IN (values)</code>
     */
    public List<Food> fetchByIdTable(Integer... values) {
        return fetch(FoodTable.XD_FOOD.REST_ID, values);
    }
}
