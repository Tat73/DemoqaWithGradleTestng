package org.example.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.example.ui.utils.ReadProperties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public static void setUp() {
        open(ReadProperties.UI_BASE_URL);
        Configuration.browser = "chrome";
        WebDriverRunner.getWebDriver().manage().window().maximize();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @BeforeClass
    public static void init() {
        setUp();
    }

    @AfterClass
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
