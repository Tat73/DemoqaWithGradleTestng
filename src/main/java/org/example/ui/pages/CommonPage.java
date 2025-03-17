package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CommonPage {

    public SelenideElement getCardByText(String cardName) {
        String text = "//div[@class='card-body']//*[contains(text(),'%s')]/ancestor::div[@class='card mt-4 top-card']";
        return $x(String.format(text, cardName));
    }

    public SelenideElement getMenuListElementByText(String cardName) {
        String text = "//span[text()='%s']/parent::li";
        return $x(String.format(text, cardName));
    }
}
