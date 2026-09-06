package config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public static RequestSpecification getRequestSpec() {

        return new RequestSpecBuilder()
                .setBaseUri(ConfigReader.get("baseUrl"))
                .setContentType("application/json")
                .build();
    }
}