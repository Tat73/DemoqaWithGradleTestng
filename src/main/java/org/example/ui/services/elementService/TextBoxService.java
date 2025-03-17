package org.example.ui.services.elementService;

import org.example.ui.common.CommonActions;
import org.example.ui.models.TextBoxModel;
import org.example.ui.pages.elements.TextBoxPage;
import org.example.ui.utils.ReadJsonFile;

public class TextBoxService extends TextBoxPage {

    public void fillUserForm() {
        String path = "src/main/resources/textBox.json";
        TextBoxModel model = ReadJsonFile.readJsonFromFile(path, TextBoxModel.class);
        getUserName().clear();
        getUserName().setValue(model.getName());
        getUserEmail().clear();
        getUserEmail().setValue(model.getEmail());
        getCurrentAddress().clear();
        getCurrentAddress().setValue(model.getCurrentAddress());
        getPermanentAddress().clear();
        getPermanentAddress().setValue(model.getPermanentAddress());
        CommonActions.clickOnButton(getSubmitButton());
    }

    public boolean isTextBoxFormDisplayed() {
        return CommonActions.isElementDisplayed(getUserForm());
    }
}
