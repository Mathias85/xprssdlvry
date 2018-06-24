/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.daos;


import mathias.vanhack.skip.model.pojos.User;
import mathias.vanhack.skip.model.records.UserRecord;
import mathias.vanhack.skip.model.tables.UserTable;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.time.LocalDateTime;
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
public class UserDao extends DAOImpl<UserRecord, User, Integer> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(UserTable.XD_USER, User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(UserTable.XD_USER, User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(User object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<User> fetchByIdTable(Integer... values) {
        return fetch(UserTable.XD_USER.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public User fetchOneByIdTable(Integer value) {
        return fetchOne(UserTable.XD_USER.USER_ID, value);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<User> fetchByUsernameTable(String... values) {
        return fetch(UserTable.XD_USER.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>username = value</code>
     */
    public User fetchOneByUsernameTable(String value) {
        return fetchOne(UserTable.XD_USER.USERNAME, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<User> fetchByEmailTable(String... values) {
        return fetch(UserTable.XD_USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>user_since IN (values)</code>
     */
    public List<User> fetchBySinceTable(LocalDateTime... values) {
        return fetch(UserTable.XD_USER.USER_SINCE, values);
    }

    /**
     * Fetch records that have <code>auth_provider IN (values)</code>
     */
    public List<User> fetchByProviderTable(String... values) {
        return fetch(UserTable.XD_USER.AUTH_PROVIDER, values);
    }
}
