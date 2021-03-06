/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.tables;


import mathias.vanhack.skip.model.definitions.Indexes;
import mathias.vanhack.skip.model.definitions.Keys;
import mathias.vanhack.skip.model.definitions.Xprssdlvrydb;
import mathias.vanhack.skip.model.records.FoodRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
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
public class FoodTable extends TableImpl<FoodRecord> {

    private static final long serialVersionUID = 1075472758;

    /**
     * The reference instance of <code>xprssdlvrydb.xd_food</code>
     */
    public static final FoodTable XD_FOOD = new FoodTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FoodRecord> getRecordType() {
        return FoodRecord.class;
    }

    /**
     * The column <code>xprssdlvrydb.xd_food.food_id</code>.
     */
    public final TableField<FoodRecord, Integer> FOOD_ID = createField("food_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>xprssdlvrydb.xd_food.name</code>.
     */
    public final TableField<FoodRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>xprssdlvrydb.xd_food.description</code>.
     */
    public final TableField<FoodRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>xprssdlvrydb.xd_food.price</code>.
     */
    public final TableField<FoodRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>xprssdlvrydb.xd_food.rest_id</code>.
     */
    public final TableField<FoodRecord, Integer> REST_ID = createField("rest_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>xprssdlvrydb.xd_food</code> table reference
     */
    public FoodTable() {
        this(DSL.name("xd_food"), null);
    }

    /**
     * Create an aliased <code>xprssdlvrydb.xd_food</code> table reference
     */
    public FoodTable(String alias) {
        this(DSL.name(alias), XD_FOOD);
    }

    /**
     * Create an aliased <code>xprssdlvrydb.xd_food</code> table reference
     */
    public FoodTable(Name alias) {
        this(alias, XD_FOOD);
    }

    private FoodTable(Name alias, Table<FoodRecord> aliased) {
        this(alias, aliased, null);
    }

    private FoodTable(Name alias, Table<FoodRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FoodTable(Table<O> child, ForeignKey<O, FoodRecord> key) {
        super(child, key, XD_FOOD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Xprssdlvrydb.XPRSSDLVRYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.XD_FOOD_FD_FOOD_FD_RESTAURANT_REST_ID_FK, Indexes.XD_FOOD_FD_FOOD_FOOD_ID_UINDEX, Indexes.XD_FOOD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FoodRecord, Integer> getIdentity() {
        return Keys.IDENTITY_XD_FOOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FoodRecord> getPrimaryKey() {
        return Keys.KEY_XD_FOOD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FoodRecord>> getKeys() {
        return Arrays.<UniqueKey<FoodRecord>>asList(Keys.KEY_XD_FOOD_PRIMARY, Keys.KEY_XD_FOOD_FD_FOOD_FOOD_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FoodRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FoodRecord, ?>>asList(Keys.FD_FOOD_FD_RESTAURANT_REST_ID_FK);
    }

    public RestaurantTable xdRestaurant() {
        return new RestaurantTable(this, Keys.FD_FOOD_FD_RESTAURANT_REST_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodTable as(String alias) {
        return new FoodTable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodTable as(Name alias) {
        return new FoodTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FoodTable rename(String name) {
        return new FoodTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FoodTable rename(Name name) {
        return new FoodTable(name, null);
    }
}
