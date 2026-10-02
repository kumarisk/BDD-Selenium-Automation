package stepdefinitions;


import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    private final TestContext context;

    public LoginSteps(TestContext context) {
        this.context = context;
    }

    @Given("user is on the login page")
    public void userIsOnLoginPage() {
        context.getLoginPage().open();
    }

    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        context.getLoginPage()
                .enterUsername(username);
    }

    @When("user enters password {string}")
    public void userEntersPassword(String password) {
       System.out.println("enter yor password");
    }

    @When("user clicks on login button")
    public void userClicksLoginButton() {
        context.getLoginPage()
                .clickLogin();
    }

    @Then("home page should be displayed")
    public void homePageShouldBeDisplayed() {
//        assertTrue(
//                context.getHomePage()
//                        .isDashboardDisplayed()
//        );
    }
}
