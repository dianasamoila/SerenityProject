package com.fast.steps.serenity;
import com.fast.pages.CustomerPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps{

    MyAccountPage accountPage;
    CustomerPage customerPage;


    @Step
    public void setLoginEmailField(){
        accountPage.setLoginEmailField();
    }

    @Step
    public void setLoginPasswordField() {
        accountPage.setLoginPasswordField();
    }

    @Step
    public void clickOnLoginButton() {
        accountPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn() {
        Assert.assertTrue(customerPage.checkLoggedIn());
    }

    @StepGroup
    public void Login(){
        setLoginEmailField();
        setLoginPasswordField();
        clickOnLoginButton();
        checkLoggedIn();
    }
}
