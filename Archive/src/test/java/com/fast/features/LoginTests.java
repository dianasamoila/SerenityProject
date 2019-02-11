package com.fast.features;

import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class LoginTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    RegisterSteps registerSteps;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void LoginTest(){
        registerSteps.MyAccountPage();
        loginSteps.Login();


    }



}
