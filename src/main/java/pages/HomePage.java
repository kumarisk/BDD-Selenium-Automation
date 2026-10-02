package pages;
import driver.DriverFactory;
import org.openqa.selenium.By;

public class HomePage {


    private final By dashboard =
            By.id("dashboard");


    public boolean isDashboardDisplayed() {

        return DriverFactory.getDriver()
                .findElement(dashboard)
                .isDisplayed();
    }
}
