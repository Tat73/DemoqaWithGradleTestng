package org.example.ui.pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonPage {

    public SelenideElement getYesRadioButton() {
        return $x("//input[@id='yesRadio']/parent::div");
    }

    public SelenideElement getImpressiveRadioButton() {
        return $x("//input[@id='impressiveRadio']/parent::div");
    }

    public SelenideElement getMessage() {
        return $x("//p[@class='mt-3']");
    }
}
