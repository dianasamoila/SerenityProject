package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {
    HomePage homePage;
    MyAccountPage accountPage;

    @Step
    public void navigateToHomepage(){

        homePage.open();
    }

    @Step
    public void goToAccountButton(){

        homePage.clickAccountButton();
    }

    @Step
    public void setEmailAddress(){

        accountPage.setEmailAddressField();
    }

    @Step
    public void setPasswordField(){

        accountPage.setPasswordField();
    }

    @Step
    public void clickOnRegisterButton(){

        accountPage.clickRegisterButton();
    }

    @StepGroup
    public void Register(){
        setEmailAddress();
        setPasswordField();
        clickOnRegisterButton();
    }

    @StepGroup
    public void MyAccountPage(){
        navigateToHomepage();
        goToAccountButton();
    }
}
