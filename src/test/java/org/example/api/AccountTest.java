package org.example.api;

import io.restassured.http.Method;
import io.restassured.response.Response;
import org.example.api.enums.Path;
import org.example.api.enums.StatusCode;
import org.example.api.models.LoginViewModel;
import org.example.api.services.ResponseService;
import org.example.ui.utils.ReadProperties;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    @Test
    public void getToken() {
        LoginViewModel loginViewModel = LoginViewModel
                .generateModel(ReadProperties.USERNAME, ReadProperties.USER_PASSWORD);
        Response response = ResponseService.sendModel(Method.POST, Path.AUTHORIZED, loginViewModel);
        assertThat("Status code is not 200 OK", response.getStatusCode(), Matchers.equalTo(StatusCode.OK.getCode()));
    }

}
