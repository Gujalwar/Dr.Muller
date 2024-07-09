package com.drmuller.stepDef;

import com.drmuller.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("The user clicks on registration page")
    public void the_user_clicks_on_registration_page() {
       registrationPage.registerBtn.click();
    }
    @Then("The user selects gender")
    public void the_user_selects_gender() {
        registrationPage.genderMale.click();

    }
    @Then("Then user keeps first name field empty")
    public void then_user_keeps_first_name_field_empty() {

    }
    @Then("The user enters {string} as a last name")
    public void the_user_enters_as_a_last_name(String lastname) {
        registrationPage.lastNameInput.sendKeys(lastname);

    }
    @Then("The user selects date of birth")
    public void the_user_selects_date_of_birth() {

    }
    @Then("The user enters {string} as a email")
    public void the_user_enters_as_a_email(String email) {
        registrationPage.emilInput.sendKeys(email);

    }
    @Then("The user enters {string} as a company")
    public void the_user_enters_as_a_company(String company) {
        registrationPage.companyInput.sendKeys(company);

    }
    @Then("The user enters {string} as a password")
    public void the_user_enters_as_a_password(String password) {
        registrationPage.password.sendKeys(password);


    }
    @Then("The user enters {string} as a confirm password")
    public void the_user_enters_as_a_confirm_password(String confirmPassword) {
        registrationPage.confirmPassword.sendKeys(confirmPassword);


    }
    @Then("The user clicks on register button")
    public void the_user_clicks_on_register_button() {
        registrationPage.registrationBtn.click();

    }


    @Then("The user gets an error message")
    public void theUserGetsAnErrorMessage() {
        String actualMessage = registrationPage.nameErrorMsg.getText();
        String expectedMessage = "First name is required.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @Then("Then user enters {string} as a first name")
    public void thenUserEntersAsAFirstName(String firstName) {
        registrationPage.firstNameInput.sendKeys(firstName);

    }
    @Then("The user is able to register successfully")
    public void theUserIsAbleToRegisterSuccessfully() {
        String actualMessage = registrationPage.registrationSuccess.getText();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals(expectedMessage,actualMessage);
        
    }


    @Then("The user gets an password error message")
    public void theUserGetsAnPasswordErrorMessage() {
        String expectedPwdErrorMessage = "must have at least 6 characters";
        String actualPwdExpectedMessage = registrationPage.pwdRegistrationErrorMsg.getText();
        Assert.assertEquals(expectedPwdErrorMessage,actualPwdExpectedMessage);
    }
}
