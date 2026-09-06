package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.restassured.response.Response;
import utils.ApiClient;

public class ProductTest {

    @Test
    public void testGetProducts() {

    	ApiClient api = new ApiClient();

    	Response response = api.get("/products/1");
    	assertEquals(200, response.statusCode());
//    	assertEquals(201, response.statusCode());
    
    }
    
    @Test
    public void testPostProducts() {

    	ApiClient api = new ApiClient();

    	Response response = api.post("/products/add" , "{\"title\":\"BMW Pencil\"}");
    	assertEquals(201, response.statusCode());
    }
    
    
    
}