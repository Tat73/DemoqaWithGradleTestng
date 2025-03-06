package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BooksPage {

    public SelenideElement getLoginButton() {
        return $x("//button[@id='login']");
    }
}
