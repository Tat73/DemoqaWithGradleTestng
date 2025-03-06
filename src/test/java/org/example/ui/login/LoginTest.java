package org.example.ui.login;

import org.example.ui.BaseTest;
import org.example.ui.services.BooksService;
import org.example.ui.services.LoginService;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest extends BaseTest {

    private final BooksService booksService = new BooksService();
    private final LoginService loginService = new LoginService();

    @Test
    public void createUser() {
        boolean isDisplayed = booksService.openLoginForm()
                .isLoginFormDisplayed();
        assertThat("Form is displayed", isDisplayed);

        loginService.clickOnRegisterButton()
                .createUserRegistration();
    }
}
