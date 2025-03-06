package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public SelenideElement getLoginForm() {
        return $x("//form[@id='userForm']");
    }

    public SelenideElement getUserName() {
        return $x("//input[@id='userName']");
    }

    public SelenideElement getUserPassword() {
        return $x("//input[@id='password']");
    }

    public SelenideElement getLoginButton() {
        return $x("//button[@id='login']");
    }

    public SelenideElement getNewUserButton() {
        return $x("//button[@id='newUser']");
    }
}
