package ch.zkb;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculateResourceTest {

    @Test
    public void testAssEndpoint() {
        given()
          .when().get("/add/100/200")
          .then()
             .statusCode(200)
             .body(is("300"));
    }

}