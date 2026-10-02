package pages;


import config.ConfigReader;
import driver.DriverFactory;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class LoginPage {

    private final By username = By.name("userLoginId");

    private final By password = By.name("pass");

    private final By getstarted = By.xpath("//button[text()='Continue']");

    private final By errorMessage = By.cssSelector(".error");


    public LoginPage open() {
        DriverFactory.getDriver()
                .get(ConfigReader.get("baseUrl") + "/login");
        return this;
    }

    public LoginPage enterUsername(String value) {
        WaitUtils.waitForVisible(username)
                .sendKeys(value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        WaitUtils.waitForVisible(password)
                .sendKeys(value);
        return this;
    }

    public void clickLogin() {
        WaitUtils.waitForClickable(getstarted)
                .click();
    }

    public String getErrorMessage() {
        return WaitUtils
                .waitForVisible(errorMessage)
                .getText();
    }
}
