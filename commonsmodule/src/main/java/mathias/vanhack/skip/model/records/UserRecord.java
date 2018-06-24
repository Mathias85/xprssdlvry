/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.records;


import mathias.vanhack.skip.model.tables.UserTable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record5<Integer, String, String, LocalDateTime, String> {

    private static final long serialVersionUID = 395426838;

    /**
     * Setter for <code>xprssdlvrydb.xd_user.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_user.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_user.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_user.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_user.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_user.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_user.user_since</code>.
     */
    public void setUserSince(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_user.user_since</code>.
     */
    public LocalDateTime getUserSince() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>xprssdlvrydb.xd_user.auth_provider</code>.
     */
    public void setAuthProvider(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xprssdlvrydb.xd_user.auth_provider</code>.
     */
    public String getAuthProvider() {
        return (String) get(4);
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
    public Row5<Integer, String, String, LocalDateTime, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, LocalDateTime, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserTable.XD_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserTable.XD_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserTable.XD_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return UserTable.XD_USER.USER_SINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UserTable.XD_USER.AUTH_PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getUserSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAuthProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getUserSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAuthProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(LocalDateTime value) {
        setUserSince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setAuthProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, LocalDateTime value4, String value5) {
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
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(UserTable.XD_USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer userId, String username, String email, LocalDateTime userSince, String authProvider) {
        super(UserTable.XD_USER);

        set(0, userId);
        set(1, username);
        set(2, email);
        set(3, userSince);
        set(4, authProvider);
    }
}
