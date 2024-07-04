package com.drmuller.stepDef;

import com.drmuller.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationB12PRStepDef {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("The user is on home page")
    public void the_user_is_on_home_page() {
        registrationPage.englishLanguage.click();


    }
    @When("The user clicks on account")
    public void the_user_clicks_on_account() {
    registrationPage.account.click();


    }
    @Then("The user is able to see registration page")
    public void the_user_is_able_to_see_registration_page() {
        String expectedTitle= "Register";
        String actualTitle = registrationPage.registerBtn.getText();


    }
}
