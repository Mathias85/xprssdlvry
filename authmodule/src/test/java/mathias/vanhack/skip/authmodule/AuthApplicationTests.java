package mathias.vanhack.skip.authmodule;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import mathias.vanhack.skip.auth.TokenAuthenticationService;
import mathias.vanhack.skip.auth.util.JsonUtil;
import mathias.vanhack.skip.authmodule.model.AuthUser;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthApplicationTests {

    private static final String BASE_URL = "http://localhost:6000";
    private static final String AUTH_ENDPOINT = "/auth";

    @BeforeClass
    public static void contextLoads() {

        AuthApplication.main();
    }

    @Test
    public void testAuth() throws UnirestException {

        final AuthUser user = AuthUser.with("admin", "1234");

        final HttpResponse<JsonNode> response = Unirest.post(BASE_URL.concat(AUTH_ENDPOINT))
                .header("accept", "application/json")
                .body(JsonUtil.toJson(user))
                .asJson();

        Assert.assertEquals("Status code should be 200 - OK.", HttpStatus.SC_OK, response.getStatus());

        final String authHeader = response.getHeaders().getFirst(TokenAuthenticationService.HEADER_STRING);

        Assert.assertNotNull("Authorization header should be present.", authHeader);
        Assert.assertTrue("Authorization header should start with \"Bearer\".",
                authHeader.contains(TokenAuthenticationService.TOKEN_PREFIX));

    }

    @Test
    public void testAuthWrongPass() throws UnirestException {

        final AuthUser user = AuthUser.with("admin", "wrongpass");

        final HttpResponse<JsonNode> response = Unirest.post(BASE_URL.concat(AUTH_ENDPOINT))
                .header("accept", "application/json")
                .body(JsonUtil.toJson(user))
                .asJson();

        Assert.assertEquals("Status code should be 403 - FORBIDDEN.", HttpStatus.SC_FORBIDDEN, response.getStatus());

        final String authHeader = response.getHeaders().getFirst(TokenAuthenticationService.HEADER_STRING);

        Assert.assertNull("Authorization header should be present.", authHeader);

    }

    @Test
    public void testAuthNonExistentUser() throws UnirestException {

        final AuthUser user = AuthUser.with("nonexistent", "1234");

        final HttpResponse<JsonNode> response = Unirest.post(BASE_URL.concat(AUTH_ENDPOINT))
                .header("accept", "application/json")
                .body(JsonUtil.toJson(user))
                .asJson();

        Assert.assertEquals("Status code should be 403 - FORBIDDEN.", HttpStatus.SC_FORBIDDEN, response.getStatus());

        final String authHeader = response.getHeaders().getFirst(TokenAuthenticationService.HEADER_STRING);

        Assert.assertNull("Authorization header should be present.", authHeader);

    }

}
