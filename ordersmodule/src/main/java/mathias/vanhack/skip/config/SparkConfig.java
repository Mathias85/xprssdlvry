package mathias.vanhack.skip.config;

import mathias.vanhack.skip.auth.TokenAuthenticationService;
import mathias.vanhack.skip.auth.dto.ResponseMessage;
import mathias.vanhack.skip.auth.util.JsonUtil;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import spark.Filter;
import spark.Spark;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:application.properties")
public class SparkConfig {

    @Value("${server.port}")
    private String serverPort;

    @Value("${server.endpoint.restricted}")
    private String endpointRestricted;

    @PostConstruct
    public void init() {

        Spark.port(Integer.parseInt(serverPort));

        Spark.before(endpointRestricted, checkAuthentication);

        Spark.afterAfter((request, response) -> response.type("application/json"));


        Spark.exception(UsernameNotFoundException.class, (e, request, response) -> {
            e.printStackTrace();

            response.status(HttpStatus.SC_UNAUTHORIZED);
            response.body(JsonUtil.toJson(new ResponseMessage(HttpStatus.SC_UNAUTHORIZED, e.getMessage())));

        });

        Spark.exception(RuntimeException.class, (e, request, response) -> {
            e.printStackTrace();
            response.status(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            response.status(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            response.body(JsonUtil.toJson(new ResponseMessage(HttpStatus.SC_INTERNAL_SERVER_ERROR, "Internal server error!")));
        });

    }

    public static Filter checkAuthentication = (request, response) -> {

        request.session().removeAttribute(TokenAuthenticationService.HEADER_STRING);

        final String header = request.raw().getHeader(TokenAuthenticationService.HEADER_STRING);

        if (header == null || !header.startsWith(TokenAuthenticationService.TOKEN_PREFIX)) {

            Spark.halt(HttpStatus.SC_FORBIDDEN);
            return;
        }

        final Authentication authentication = TokenAuthenticationService.getAuthentication(request.raw());

        request.session().attribute(TokenAuthenticationService.HEADER_STRING, authentication);

        SecurityContextHolder.getContext().setAuthentication(authentication);

    };


}
