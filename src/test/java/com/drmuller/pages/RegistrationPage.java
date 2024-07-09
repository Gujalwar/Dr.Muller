package com.drmuller.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//i[@class='navbar-tool-icon czi-user']")
    public WebElement account;

    @FindBy(xpath = "//img[@title='EN']")
    public WebElement englishLanguage;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    public WebElement registerBtn;

    @FindBy(xpath ="//h1[text() =\"Register\" ]")
    public WebElement registrationPage;

    @FindBy(xpath = "//label[@for='gender-female']")
    public WebElement genderFemale;

    @FindBy(xpath = "//label[@for='gender-male']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@class = 'form-control']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id = 'LastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id = 'Email']")
    public WebElement emilInput;

    @FindBy(xpath = "//input[@id='Company']")
    public WebElement companyInput;

    @FindBy(id = "Newsletter")
    public WebElement newsLetter;

    @FindBy(xpath = "//input[@type = \"password\"][1]")
    public WebElement password;

    @FindBy(xpath = "//input[@name = \"ConfirmPassword\"]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@id= \"register-button\"]")
    public WebElement registrationBtn;

    @FindBy(xpath = "//span[text()= 'First name is required.']")
    public WebElement nameErrorMsg;

    @FindBy(xpath = "//div[@class='result alert alert-success']")
    public WebElement registrationSuccess;

    @FindBy(xpath = "//li[normalize-space()='must have at least 6 characters']")
    public WebElement pwdRegistrationErrorMsg;

}
