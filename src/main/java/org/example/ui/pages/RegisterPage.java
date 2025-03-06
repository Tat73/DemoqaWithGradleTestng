package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterPage {

    public SelenideElement getFirstName() {
        return $x("//input[@id='firstname']");
    }

    public SelenideElement getLastName() {
        return $x("//input[@id='lastname']");
    }

    public SelenideElement getUserName() {
        return $x("//input[@id='userName']");
    }

    public SelenideElement getUserPassword() {
        return $x("//input[@id='password']");
    }

    public SelenideElement getCaptcha() {
        return $x("//div[@class='recaptcha-checkbox-border']");
    }

    public SelenideElement getRegisterButton() {
        return $x("//button[@id='register']");
    }

    public SelenideElement getLoginButton() {
        return $x("//button[@id='gotologin']");
    }

    public SelenideElement getIframe() {
        return $x("//iframe[@title='reCAPTCHA']");
    }
}
