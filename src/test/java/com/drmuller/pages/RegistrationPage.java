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
}
