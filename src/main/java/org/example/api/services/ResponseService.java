package org.example.api.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.enums.Path;

import static io.restassured.RestAssured.given;


public class ResponseService {

    public static final Gson GSON = new GsonBuilder().create();

    public static Response getResponse(Method method, RequestSpecification requestSpecification) {
        requestSpecification
                .baseUri(Path.SITE_URL.getPath())
                .contentType(ContentType.JSON)
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
}
