package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseAPI {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }
}
