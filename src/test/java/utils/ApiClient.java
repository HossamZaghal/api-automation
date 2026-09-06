package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import config.RequestSpec;

public class ApiClient {
	
	public Response get(String endpoint) {
		return given()
		        .spec(RequestSpec.getRequestSpec())
		    .when()
		        .get(endpoint)
		    .then()
		        .extract()
		        .response();		
}
		
	public Response post(String endpoint, String requestBody)
		{
			return given()
			        .spec(RequestSpec.getRequestSpec())
			        .body(requestBody)
			    .when()
			        .post(endpoint)
			    .then()
			        .extract()
			        .response();		
	}

	
}
