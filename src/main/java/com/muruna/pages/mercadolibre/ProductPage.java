package com.muruna.pages.mercadolibre;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.muruna.pages.BasePage;

public class ProductPage extends BasePage {

    @FindBy(className = "ui-pdp-description__content")
    private WebElement textProductDescription;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(textProductDescription));
        return textProductDescription.isDisplayed();
    }

    public String getProductDescription(){
        return textProductDescription.getText();
    }

}
