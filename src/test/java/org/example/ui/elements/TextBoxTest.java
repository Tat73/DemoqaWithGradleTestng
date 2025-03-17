package org.example.ui.elements;

import org.example.ui.BaseTest;
import org.example.ui.services.CommonService;
import org.example.ui.services.elementService.TextBoxService;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TextBoxTest extends BaseTest {

    private final TextBoxService textBoxService = new TextBoxService();
    private final CommonService commonService = new CommonService();


    @Test
    public void textBoxFormTest() {
        commonService.clickOnCardByText("Elements");
        commonService.clickOnMenuListElementByText("Text Box");
        assertThat("TextBox form isn`t present ", textBoxService.isTextBoxFormDisplayed());
        textBoxService.fillUserForm();

    }
}
