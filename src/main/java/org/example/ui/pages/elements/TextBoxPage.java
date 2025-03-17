package org.example.ui.pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    public SelenideElement getUserForm() {
        return $x("//form[@id='userForm']");
    }

    public SelenideElement getUserName() {
        return $x("//input[@id='userName']");
    }

    public SelenideElement getUserEmail() {
        return $x("//input[@id='userEmail']");
    }

    public SelenideElement getCurrentAddress() {
        return $x("//textarea[@id='currentAddress']");
    }

    public SelenideElement getPermanentAddress() {
        return $x("//textarea[@id='permanentAddress']");
    }

    public SelenideElement getSubmitButton() {
        return $x("//button[@id='submit']");
    }
}
