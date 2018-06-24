package mathias.vanhack.skip.authmodule.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "xd_auth_user")
public class AuthUser implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "auus_uuid", columnDefinition = "BINARY(16)")
    private String userUuid;

    @Column(name = "auus_username", nullable = false)
    private String username;

    @Column(name = "auus_password", nullable = false)
    private String password;

    public static AuthUser with(final String username, final String password) {
        final AuthUser authUser = new AuthUser();
        authUser.setUsername(username);
        authUser.setPassword(password);

        return authUser;
    }

    public AuthUser() {
    }

    public AuthUser(String userUuid, String username, String password) {
        this.userUuid = userUuid;
        this.username = username;
        this.password = password;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthUser authUser = (AuthUser) o;
        return Objects.equals(userUuid, authUser.userUuid) &&
                Objects.equals(username, authUser.username) &&
                Objects.equals(password, authUser.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userUuid, username, password);
    }

    @Override
    public String toString() {
        return "AuthUser{" +
                "userUuid='" + userUuid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
