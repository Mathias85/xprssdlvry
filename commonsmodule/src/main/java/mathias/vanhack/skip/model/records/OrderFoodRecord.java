/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.records;


import mathias.vanhack.skip.model.tables.OrderFoodTable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class OrderFoodRecord extends UpdatableRecordImpl<OrderFoodRecord> implements Record5<Integer, Integer, Integer, Integer, Double> {

    private static final long serialVersionUID = -1159134560;

    /**
     * Setter for <code>xprssdlvrydb.xd_order_food.order_food_id</code>.
     */
    public void setOrderFoodId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_order_food.order_food_id</code>.
     */
    public Integer getOrderFoodId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_order_food.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_order_food.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_order_food.food_id</code>.
     */
    public void setFoodId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_order_food.food_id</code>.
     */
    public Integer getFoodId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_order_food.amount</code>.
     */
    public void setAmount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_order_food.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_order_food.price</code>.
     */
    public void setPrice(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_order_food.price</code>.
     */
    public Double getPrice() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrderFoodTable.XD_ORDER_FOOD.ORDER_FOOD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrderFoodTable.XD_ORDER_FOOD.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrderFoodTable.XD_ORDER_FOOD.FOOD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return OrderFoodTable.XD_ORDER_FOOD.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return OrderFoodTable.XD_ORDER_FOOD.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getOrderFoodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFoodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrderFoodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFoodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord value1(Integer value) {
        setOrderFoodId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord value2(Integer value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord value3(Integer value) {
        setFoodId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord value4(Integer value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord value5(Double value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderFoodRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Double value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderFoodRecord
     */
    public OrderFoodRecord() {
        super(OrderFoodTable.XD_ORDER_FOOD);
    }

    /**
     * Create a detached, initialised OrderFoodRecord
     */
    public OrderFoodRecord(Integer orderFoodId, Integer orderId, Integer foodId, Integer amount, Double price) {
        super(OrderFoodTable.XD_ORDER_FOOD);

        set(0, orderFoodId);
        set(1, orderId);
        set(2, foodId);
        set(3, amount);
        set(4, price);
    }
}
