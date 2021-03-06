/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.pojos;


import mathias.vanhack.skip.enums.AuthProvider;

import javax.annotation.Generated;
import java.io.Serializable;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1523699253;

    private Integer userId;
    private String username;
    private String email;
    private LocalDateTime userSince;
    private AuthProvider authProvider;

    public User() {
    }

    public User(User value) {
        this.userId = value.userId;
        this.username = value.username;
        this.email = value.email;
        this.userSince = value.userSince;
        this.authProvider = value.authProvider;
    }

    public User(
            Integer userId,
            String username,
            String email,
            LocalDateTime userSince,
            AuthProvider authProvider
    ) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.userSince = userSince;
        this.authProvider = authProvider;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getUserSince() {
        return this.userSince;
    }

    public void setUserSince(LocalDateTime userSince) {
        this.userSince = userSince;
    }

    public AuthProvider getAuthProvider() {
        return this.authProvider;
    }

    public void setAuthProvider(AuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(userId);
        sb.append(", ").append(username);
        sb.append(", ").append(email);
        sb.append(", ").append(userSince);
        sb.append(", ").append(authProvider);

        sb.append(")");
        return sb.toString();
    }
}
