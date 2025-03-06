package org.example.ui.services;

import com.codeborne.selenide.Condition;
import org.example.ui.common.CommonActions;
import org.example.ui.pages.RegisterPage;
import org.example.ui.utils.ReadProperties;

import static com.codeborne.selenide.Selenide.switchTo;

public class RegisterService extends RegisterPage {

    public void createUserRegistration() {
        getFirstName().clear();
        getFirstName().setValue(ReadProperties.USER_FIRSTNAME);
        getLastName().clear();
        getLastName().setValue(ReadProperties.USER_LASTNAME);
        getUserName().clear();
        getUserName().setValue(ReadProperties.USERNAME);
        getUserPassword().clear();
        getUserPassword().setValue(ReadProperties.USER_PASSWORD);

        getIframe().shouldBe(Condition.visible);
        switchTo().frame(getIframe());
        CommonActions.clickOnButton(getCaptcha());
        switchTo().defaultContent();
        CommonActions.scrollToElement(getRegisterButton());
        CommonActions.clickOnButton(getRegisterButton());
    }
}
