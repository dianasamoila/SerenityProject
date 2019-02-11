package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/customer-logout/?_wpnonce=3a5c82a422")

    public class CustomerPage extends PageObject {

    @FindBy(css = "div p:first-child")
    private WebElementFacade helloMessage;

    @FindBy(css = "#menu-item-60 a")
    private WebElementFacade shopLink;

    public boolean checkLoggedIn(){
        waitFor(helloMessage);
        return helloMessage.containsText("Hello samoilardiana (not samoilardiana? Log out)");
    }


    public void clickShopLink(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(shopLink);
        clickOn(shopLink);
    }

}
