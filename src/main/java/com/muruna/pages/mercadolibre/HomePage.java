package com.muruna.pages.mercadolibre;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.muruna.pages.BasePage;

public class HomePage extends BasePage{

    @FindBy(id = "cb1-edit")
    private WebElement inputSearchProduct; 

    @FindBy(className = "nav-search-btn")
    private WebElement btnSearchProduct; 


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(inputSearchProduct));
        return inputSearchProduct.isDisplayed();
    }
    
    public void searchProduct(String productName){
        inputSearchProduct.sendKeys(productName);
        btnSearchProduct.click();
    }




}
