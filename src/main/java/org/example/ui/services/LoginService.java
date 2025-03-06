package org.example.ui.services;

import org.example.ui.common.CommonActions;
import org.example.ui.pages.LoginPage;
import org.example.ui.utils.ReadProperties;

public class LoginService extends LoginPage {

    public boolean isLoginFormDisplayed() {
        return CommonActions.isElementDisplayed(getLoginForm());
    }

    public RegisterService clickOnRegisterButton() {
        CommonActions.scrollToElement(getNewUserButton());
        CommonActions.clickOnButton(getNewUserButton());
        return new RegisterService();
    }

    public void setLoginData() {
        getUserName().clear();
        getUserName().setValue(ReadProperties.USERNAME);
        getUserPassword().clear();
        getUserPassword().setValue(ReadProperties.USER_PASSWORD);
    }
}
