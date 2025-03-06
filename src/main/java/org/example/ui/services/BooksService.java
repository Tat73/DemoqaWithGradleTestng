package org.example.ui.services;

import org.example.ui.common.CommonActions;
import org.example.ui.pages.BooksPage;

public class BooksService extends BooksPage {

    public LoginService openLoginForm() {
        CommonActions.clickOnButton(getLoginButton());
        return new LoginService();
    }
}
