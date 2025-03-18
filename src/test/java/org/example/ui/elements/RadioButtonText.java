package org.example.ui.elements;

import org.example.ui.BaseTest;
import org.example.ui.services.CommonService;
import org.example.ui.services.elementService.RadioButtonService;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class RadioButtonText extends BaseTest {

    private final CommonService commonService = new CommonService();
    private final RadioButtonService radioButtonService = new RadioButtonService();


    @Test
    public void radioButtonText(){
        commonService.clickOnCardByText("Elements");
        commonService.clickOnMenuListElementByText("Radio Button");
        radioButtonService.clickYesButton();
        assertThat("You haven`t selected Yes ", radioButtonService.getMessageText(), Matchers.equalTo("You have selected Yes"));
        radioButtonService.clickImpressiveButton();
        assertThat("You haven`t selected Impressive ", radioButtonService.getMessageText(), Matchers.equalTo("You have selected Impressive"));

    }
}
