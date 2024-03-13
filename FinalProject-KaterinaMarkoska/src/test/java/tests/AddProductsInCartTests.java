package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductsInCartTests extends BaseTests {


    @Test
    public void addProductsTest() throws InterruptedException {
        addProductsInCartPage.navigateToProductsPage();
        Thread.sleep(2000);
        addProductsInCartPage.clickDressButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,300)", "");
        addProductsInCartPage.clickprintedDreess();
        addProductsInCartPage.switchToWindow();
       Thread.sleep(2000);
       addProductsInCartPage.clickPinkColor();
        addProductsInCartPage.clickAddToCartButton();
        addProductsInCartPage.switchToMainPage();
        Assert.assertEquals(addProductsInCartPage.validateTextProductInShoppingCart(), "Product successfully added to your shopping cart");
        //Assert.assertEquals(addProductsInCartPage.validateProductName(), "Printed evening dress with straight sleeves with black thin waist belt and ruffled linings.");
        //Assert.assertEquals(addProductsInCartPage.validateSizeAndColor(),"M, Pink");
        addProductsInCartPage.clickContinueShoppingButton();
        addProductsInCartPage.clickDressButton();
        addProductsInCartPage.clickSummerDresses();
        js.executeScript("window.scrollBy(0,300)", "");
        addProductsInCartPage.clickPrintedSummerDressButton();
        Thread.sleep(2000);
        addProductsInCartPage.switchToWindow();
        addProductsInCartPage.clickBlueColor();
        Assert.assertEquals(addProductsInCartPage.validateShortDressDescription(),"Long printed dress with thin adjustable straps. V-neckline and wiring under the bust with ruffles at the bottom of the dress.");
        Assert.assertEquals(addProductsInCartPage.validateDressCondition(), "Condition: New product");
        //addProductsInCartPage.clickQuantityButton();
        addProductsInCartPage.clickAddToCartButton();
        addProductsInCartPage.switchToMainPage();
        Assert.assertEquals(addProductsInCartPage.validateTextProductInShoppingCart(), "Product successfully added to your shopping cart");
        //Assert.assertEquals(addProductsInCartPage.validateProductName(), "Long printed dress with thin adjustable straps. V-neckline and wiring under the bust with ruffles at the bottom of the dress.");
        Assert.assertEquals(addProductsInCartPage.validateSizeAndColor(),"S, Blue");
        Thread.sleep(2000);
        addProductsInCartPage.clickProceedToCheckoutButton();





    }
}
