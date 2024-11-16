package com.muruna.pages.mercadolibre;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.muruna.pages.BasePage;

public class SearchResultPage extends BasePage {

    @FindBy(css = "li.ui-search-layout__item")
    private List<WebElement> resultItemsListElements; 

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        WebElement item = resultItemsListElements.get(0);
        wait.until(ExpectedConditions.visibilityOf(item));
        return item.isDisplayed();
    }

    public void clickItem(int itemPosition){
        resultItemsListElements.get(itemPosition - 1).click();
    }




    


}
