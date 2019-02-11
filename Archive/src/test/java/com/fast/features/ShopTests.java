package com.fast.features;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class ShopTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    RegisterSteps registerSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ShopSteps shopSteps;

    @Test
    public void ShopTest(){
        registerSteps.MyAccountPage();
        loginSteps.Login();
        shopSteps.addToCart();
    }


}
