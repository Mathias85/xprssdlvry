package mathias.vanhack.skip.auth;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

public class TokenAuthenticationService {


    static final long EXPIRATIONTIME = 864_000_000; // 10 days
    static final String SECRET = "nAnDapArbAT";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

    public static void addAuthentication(HttpServletResponse res, String username) {

        final String jwt = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();

        res.addHeader(HEADER_STRING, TOKEN_PREFIX + jwt);

    }

    public static Authentication getAuthentication(HttpServletRequest request) {

        final Optional<String> token = Optional.ofNullable(request.getHeader(HEADER_STRING));

        if (!token.isPresent()) {
            return null;
        }

        return getAuthentication(token.get());

    }

    public static Authentication getAuthentication(String authToken) {

        if (authToken == null) {
            throw new NullPointerException("AuthToken cannot be null!");
        }

        final Optional<String> user = Optional.ofNullable(
                Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(authToken.replace(TOKEN_PREFIX, ""))
                        .getBody()
                        .getSubject()
        );

        if (!user.isPresent()) {
            return null;
        }

        return new UsernamePasswordAuthenticationToken(user.get(), null, Collections.emptyList());

    }

}
