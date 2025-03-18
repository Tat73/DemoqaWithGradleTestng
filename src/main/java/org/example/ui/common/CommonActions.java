package org.example.ui.common;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CommonActions {

    public static void clickOnButton(SelenideElement element) {
        element.click();
    }

    public static boolean isElementDisplayed(SelenideElement element) {
        return element.isDisplayed();
    }

    public static void scrollToElement(SelenideElement element) {
        $(element).scrollIntoView(true);
    }

    public static String getText(SelenideElement element) {
        return $(element).getText();
    }
}
