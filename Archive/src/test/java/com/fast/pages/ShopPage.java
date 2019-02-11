package com.fast.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

import java.util.List;



@DefaultUrl("http://qa1.fasttrackit.org:8008/shop/")
public class ShopPage extends PageObject {


    @FindBy(id = "main")
    List<WebElementFacade> listOfProducts;

    @FindBy(css = "#menu-item-59 a")
    private WebElementFacade cartLink;


//    public boolean selectCapProduct() {
//        for (WebElementFacade product : listOfProducts) {
//            if (product.getText().contains("Cap")) {
//                clickOn(product);
//                return true;
//            }
//        }
//        return false;
//    }


    public boolean selectHoodieProduct() {
        for (WebElementFacade product : listOfProducts) {
            if (product.getText().contains("hoodie-with=zipper")) {
                clickOn(product);
                return true;
            }
        }
        return false;
    }


    public void clickOnCartLink(){
        clickOn(cartLink);
    }

}


