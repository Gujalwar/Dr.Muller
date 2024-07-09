package com.drmuller.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@class = 'btn btn-primary col-12']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id = 'Email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@id = 'Password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//h6[text() = 'Your Personal Details']")
    public WebElement loginPageSuccess;

    @FindBy(xpath = "//div[@class='alert alert-primary validation-summary-errors']")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//li[normalize-space()='The credentials provided are incorrect']")
    public WebElement invalidPasswordMessage;


}
