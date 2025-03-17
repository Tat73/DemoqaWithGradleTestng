package org.example.ui.services;

import org.example.ui.common.CommonActions;
import org.example.ui.pages.CommonPage;

public class CommonService extends CommonPage {

    public void clickOnCardByText(String cardName) {
        CommonActions.scrollToElement(getCardByText(cardName));
        CommonActions.clickOnButton(getCardByText(cardName));
    }

    public void clickOnMenuListElementByText(String cardName) {
        CommonActions.clickOnButton(getMenuListElementByText(cardName));
    }
}
