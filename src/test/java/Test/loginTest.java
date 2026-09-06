package Test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import config.RequestSpec;
import io.restassured.response.Response;
import models.looginRequests;

public class loginTest {
	looginRequests credential = new looginRequests( "emilys","emilyspass");
	
	

    @Test
    public void testlogin() {
	Response response =
            given()
                    .spec(RequestSpec.getRequestSpec())
                    .body(credential)

            .when()
                    .post("/auth/login")

            .then()
                    .extract()
                    .response();

    System.out.println("Status: " + response.statusCode());
    System.out.println("Response: " + response.asPrettyString());
}
	    	
}	    
	    


