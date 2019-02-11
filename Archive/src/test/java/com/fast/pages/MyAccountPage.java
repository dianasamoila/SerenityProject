package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class MyAccountPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade registerEmailField;

    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;

    @FindBy(css = "[name=register]")
    private WebElementFacade registerButton;

    @FindBy(id = "username")
    private WebElementFacade loginEmailField;

    @FindBy(id = "password")
    private WebElementFacade loginPasswordField;

    @FindBy(css = "[name=login]")
    private WebElementFacade loginButton;

    public void setEmailAddressField(){
        waitFor(registerEmailField);
        typeInto(registerEmailField,"samoilardiana@gmail.com");
    }

    public void setPasswordField(){
        typeInto(registerPasswordField,"Registerpassword123!");
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void setLoginEmailField(){
        waitFor(loginEmailField);
        typeInto(loginEmailField,"samoilardiana@gmail.com");
    }

    public void setLoginPasswordField(){
        typeInto(loginPasswordField,"Registerpassword123!");
    }

    public void clickLoginButton()
    {
        clickOn(loginButton);
    }
}
