package org.example.api.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.enums.Path;
import org.example.ui.utils.ReadProperties;

import static io.restassured.RestAssured.given;
import static org.example.api.enums.Path.SITE_URL;


public class ResponseService {

    public static final Gson GSON = new GsonBuilder().create();

    public static Response getResponse(Method method, RequestSpecification requestSpecification) {
        requestSpecification
                .baseUri(SITE_URL.getPath())
                .auth().basic(ReadProperties.USERNAME, ReadProperties.USER_PASSWORD)
                .headers(
                "Content-Type",
                ContentType.JSON,
                "accept",
                ContentType.JSON)
                .log().uri()
                .when()
                .get()
                .then()
                .extract()
                .response()
                .prettyPrint();
        return requestSpecification.request(method);
    }

    public static Response sendModel(Method method, Path path, Object model) {
        RequestSpecification requestSpecification = given()
                .basePath(path.getPath())
                .body(GSON.toJson(model));
        return getResponse(method, requestSpecification);
    }

    public static Response sendModel(Method method, Path path) {
        RequestSpecification requestSpecification = given()
                .basePath(path.getPath());
        return getResponse(method, requestSpecification);
    }
}
