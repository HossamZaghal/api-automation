package Test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.List;

import config.RequestSpec;
import io.restassured.response.Response;
import models.Product;
import utils.ApiClient;

public class ProductTest {

    @Test
    public void testGetProducts() {

    	ApiClient api = new ApiClient();

    	Response response = api.get("/products/1");
    	assertEquals(200, response.statusCode());
    }
    
    @Test
    public void testPostProducts() {

    	ApiClient api = new ApiClient();

    	Response response = api.post("/products/add" , "{\"title\":\"BMW Pencil\"}");
    	assertEquals(201, response.statusCode());
    }
    
    
    
}