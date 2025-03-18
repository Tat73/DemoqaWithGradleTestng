package org.example.ui.services.elementService;

import org.example.ui.common.CommonActions;
import org.example.ui.pages.elements.RadioButtonPage;

public class RadioButtonService extends RadioButtonPage {

    public void clickYesButton() {
        CommonActions.clickOnButton(getYesRadioButton());
    }

    public void clickImpressiveButton() {
        CommonActions.clickOnButton(getImpressiveRadioButton());
    }

    public String getMessageText(){
        return CommonActions.getText(getMessage());
    }
}
