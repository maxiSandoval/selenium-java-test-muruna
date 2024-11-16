package com.muruna.tests.mercadolibre;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.muruna.pages.mercadolibre.HomePage;
import com.muruna.pages.mercadolibre.ProductPage;
import com.muruna.pages.mercadolibre.SearchResultPage;
import com.muruna.tests.BaseTest;
import com.muruna.utils.Constants;

public class MercadolibreTest extends BaseTest {

    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private ProductPage productPage;

    @BeforeClass
    public void setupTest() {
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
    }

    @DataProvider(name = "searchData")
    public Object[][] searchData() {
        return new Object[][] { { "zapatilla", 1 }, { "camiseta", 2 }, { "gorra", 3 } };
    }

    @Test(dataProvider = "searchData")
    public void searchProductTest(String productName , int itemPosition) {
        homePage.goTo(Constants.MERCADOLIBRE_URL);
        Assert.assertTrue(homePage.isAt(), "Home page is not loaded correctly.");
        homePage.searchProduct(productName);

        Assert.assertTrue(searchResultPage.isAt(), "Result page is not loaded correctly.");
        searchResultPage.clickItem(itemPosition);

        Assert.assertTrue(productPage.isAt(), "Product page not loaded correctly.");
        String productDescription = productPage.getProductDescription();
        Assert.assertNotNull(productDescription, "Product description should not be null");
        Assert.assertFalse(productDescription.isEmpty(), "Product description should not be empty");

        System.out.println("---------------- " + productName + " description ----------------");
        System.out.println(productDescription);
    }

}
