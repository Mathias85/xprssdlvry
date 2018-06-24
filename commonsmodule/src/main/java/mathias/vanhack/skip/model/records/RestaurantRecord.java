/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.records;


import mathias.vanhack.skip.model.tables.RestaurantTable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class RestaurantRecord extends UpdatableRecordImpl<RestaurantRecord> implements Record10<Integer, String, String, LocalDateTime, String, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1275179453;

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.rest_id</code>.
     */
    public void setRestId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.rest_id</code>.
     */
    public Integer getRestId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.date_created</code>.
     */
    public void setDateCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.date_created</code>.
     */
    public LocalDateTime getDateCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.street</code>.
     */
    public void setStreet(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.street</code>.
     */
    public String getStreet() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.city</code>.
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.state</code>.
     */
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.state</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.country</code>.
     */
    public void setCountry(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.country</code>.
     */
    public String getCountry() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.latitude</code>.
     */
    public void setLatitude(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.latitude</code>.
     */
    public Integer getLatitude() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_restaurant.longitude</code>.
     */
    public void setLongitude(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_restaurant.longitude</code>.
     */
    public Integer getLongitude() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, LocalDateTime, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, LocalDateTime, String, String, String, String, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RestaurantTable.XD_RESTAURANT.REST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RestaurantTable.XD_RESTAURANT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RestaurantTable.XD_RESTAURANT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return RestaurantTable.XD_RESTAURANT.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RestaurantTable.XD_RESTAURANT.STREET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RestaurantTable.XD_RESTAURANT.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RestaurantTable.XD_RESTAURANT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return RestaurantTable.XD_RESTAURANT.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return RestaurantTable.XD_RESTAURANT.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return RestaurantTable.XD_RESTAURANT.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStreet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStreet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value1(Integer value) {
        setRestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value4(LocalDateTime value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value5(String value) {
        setStreet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value6(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value8(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value9(Integer value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord value10(Integer value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestaurantRecord values(Integer value1, String value2, String value3, LocalDateTime value4, String value5, String value6, String value7, String value8, Integer value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RestaurantRecord
     */
    public RestaurantRecord() {
        super(RestaurantTable.XD_RESTAURANT);
    }

    /**
     * Create a detached, initialised RestaurantRecord
     */
    public RestaurantRecord(Integer restId, String name, String description, LocalDateTime dateCreated, String street, String city, String state, String country, Integer latitude, Integer longitude) {
        super(RestaurantTable.XD_RESTAURANT);

        set(0, restId);
        set(1, name);
        set(2, description);
        set(3, dateCreated);
        set(4, street);
        set(5, city);
        set(6, state);
        set(7, country);
        set(8, latitude);
        set(9, longitude);
    }
}