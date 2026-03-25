package tests;

import base.BaseAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UserAPITest extends BaseAPI {

    @Test
    public void getUserTest() {
        Response response = given().get("/users/2");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void createUserTest() {
        String body = "{ \"name\": \"QA\", \"job\": \"Engineer\" }";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(body)
                .post("/users");

        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
