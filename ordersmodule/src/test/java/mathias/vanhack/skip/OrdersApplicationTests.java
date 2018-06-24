package mathias.vanhack.skip;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import mathias.vanhack.skip.auth.TokenAuthenticationService;
import mathias.vanhack.skip.auth.util.JsonUtil;
import mathias.vanhack.skip.enums.PaymentType;
import mathias.vanhack.skip.model.pojos.Order;
import mathias.vanhack.skip.model.pojos.OrderFood;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class OrdersApplicationTests {

    private static final String BASE_URL = "http://localhost:8000";
    private static final String ORDERS_ENDPOINT = "/api/orders";


    private static final String AUTH_BASE_URL = "http://localhost:6000";
    private static final String AUTH_ENDPOINT = "/auth";

    private static String authToken;

    @BeforeClass
    public static void contextLoads() throws UnirestException {

        OrdersApplication.main();

        authenticate();
    }

    private static void authenticate() throws UnirestException {

        final String jsonBody = "{ \"username\": \"admin\", \"password\": \"1234\" }";

        final HttpResponse<JsonNode> response = Unirest.post(AUTH_BASE_URL.concat(AUTH_ENDPOINT))
                .header("accept", "application/json")
                .body(jsonBody)
                .asJson();

        authToken = response.getHeaders().getFirst(TokenAuthenticationService.HEADER_STRING);

    }

    @Test
    public void testGetOrder() throws UnirestException {

        final HttpResponse<JsonNode> response = Unirest.get(BASE_URL.concat(ORDERS_ENDPOINT).concat("/3"))
                .header("accept", "application/json")
                .header(TokenAuthenticationService.HEADER_STRING, authToken)
                .asJson();

        Assert.assertEquals("Status code should be 200 - OK.", HttpStatus.SC_OK, response.getStatus());

        System.out.println(response.getBody());

        final JsonNode json = response.getBody();

    }

    @Test
    public void testPlaceOrder() throws UnirestException {

        final Order order = new Order();
        order.setPaymentType(PaymentType.CASH);
        order.setDeliveryFee(4.76);
        order.setUserId(1);
        order.setRestId(2);
        order.setOrderFoods(new ArrayList<>());

        OrderFood food = new OrderFood();
        food.setAmount(2);
        food.setFoodId(3);
        food.setPrice(25.8);
        order.getOrderFoods().add(food);

        food = new OrderFood();
        food.setAmount(1);
        food.setFoodId(4);
        food.setPrice(15.9);
        order.getOrderFoods().add(food);

        final HttpResponse<JsonNode> response = Unirest.post(BASE_URL.concat(ORDERS_ENDPOINT))
                .header("accept", "application/json")
                .header(TokenAuthenticationService.HEADER_STRING, authToken)
                .body(JsonUtil.toJson(order))
                .asJson();

        Assert.assertEquals("Status code should be 201 - CREATED", HttpStatus.SC_CREATED, response.getStatus());

    }

}
