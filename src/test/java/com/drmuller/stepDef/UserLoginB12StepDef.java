package com.drmuller.stepDef;

import com.drmuller.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginB12StepDef {
LoginPage loginPage = new LoginPage();
    @Then("The user is able to login")
    public void the_user_is_able_to_login() {
        String actualResult = loginPage.loginPageSuccess.getText();
        String expectedResult = "Your Personal Details";


    }

    @Then("The user enters {string} as a email for login")
    public void theUserEntersAsAEmailForLogin(String email) {
        loginPage.loginEmail.sendKeys(email);

    }

    @Then("The user enters {string} as a password for login")
    public void theUserEntersAsAPasswordForLogin(String password) {
        loginPage.loginPassword.sendKeys(password);
    }

    @When("The user clicks on login button")
    public void theUserClicksOnLoginButton() {
        loginPage.loginBtn.click();
    }

    @Then("The user gets an invalid credentials error message")
    public void theUserGetsAnInvalidCredentialsErrorMessage() {
        String actualMessage = loginPage.invalidEmailMessage.getText();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
    }

    @Then("The user gets an invalid credentials error message for password")
    public void theUserGetsAnInvalidCredentialsErrorMessageForPassword() {
        String actualMessage = loginPage.invalidPasswordMessage.getText();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
    }
}
