package com.fast.steps.serenity;
import com.fast.pages.CustomerPage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;


public class ShopSteps extends ScenarioSteps {

    CustomerPage customerPage;
    ShopPage shopPage;

    @Step
    public void clickOnShopLink() {
        customerPage.clickShopLink();
    }


//    @Step
//    public void addCapProductToCart(){
//        shopPage.selectCapProduct();
//    }

    @Step
    public void addHoodieProductToCart(){
        shopPage.selectHoodieProduct();
    }

    @Step
    public void clickOnCartLik(){
        shopPage.clickOnCartLink();
    }


    @StepGroup
    public void addToCart(){
        clickOnShopLink();
//        addCapProductToCart();
        addHoodieProductToCart();
        clickOnCartLik();
    }
}
