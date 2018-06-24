package mathias.vanhack.skip;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RestauranteAppliationTests {

    private static final String BASE_URL = "http://localhost:7000";
    private static final String RESTAURANT_ENDPOINT = "/restaurants";

    @BeforeClass
    public static void contextLoads() {

        RestaurantApplication.main();
    }

    @Test
    public void testListRestaurant() throws UnirestException {

        final HttpResponse<JsonNode> response = Unirest.get(BASE_URL.concat(RESTAURANT_ENDPOINT))
                .header("accept", "application/json")
                .asJson();

        Assert.assertEquals("Status code should be 200 - OK.", HttpStatus.SC_OK, response.getStatus());

        final JsonNode json = response.getBody();

        Assert.assertTrue("Reponse body should be a json array.", json.isArray());

    }

    @Test
    public void testGetRestaurant() throws UnirestException {

        final HttpResponse<JsonNode> response = Unirest.get(BASE_URL.concat(RESTAURANT_ENDPOINT).concat("/2"))
                .header("accept", "application/json")
                .asJson();

        Assert.assertEquals("Status code should be 200 - OK.", HttpStatus.SC_OK, response.getStatus());

        final JsonNode json = response.getBody();

        Assert.assertFalse("Reponse body should NOT be a json array.", json.isArray());
        Assert.assertNotNull("Restaurant should have foods list.", json.getObject().getJSONArray("foods"));
        Assert.assertEquals("Food list should have 2 items", 2, json.getObject().getJSONArray("foods").length());

    }

}
