package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class AddProductsInCartPage {
    private WebDriver driver;
    private WebDriverWait wait;


    private AddProductsInCartPage addProductsInCart;
    //private By tshirtButtonLocator = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    private By dressButtonLocator = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
    private By printedDreessLocator = By.xpath("//*[@class='product_list grid row']/li[2]/div/div/div/a/img");
    //private By fadedShortSleeveButtonLocator = By.xpath("//*[@class='product_list grid row']/li/div/div/div/a/img");
    //private By sizeFadedShortSleeveLocator = By.xpath("//*[@class='form-control attribute_select no-print']");
    //private By colorPrintedDressLocator = By.xpath("color_24");
    private By pinkColorButton = By.xpath("//*[@id='color_24']");
    private By blueColorLocator = By.xpath("//*[@id='color_14']");
    private By addToCartLocator = By.xpath("//*[@id='add_to_cart']/button/span");
    private By switchToIFrameWindow = By.xpath("//iframe[contains(@class,'fancybox-iframe')]");
    private By continueShoppingLocator = By.xpath("//*[@title='Continue shopping']/span");
    private By validateProductAddedToCartLocator = By.xpath("//*[@class='icon-check']\t/..");
    private By validateSizeAndColorLocator = By.xpath("//*[@id='layer_cart_product_attributes']");
    private By validateProductNameLocator = By.xpath("//*[@id='short_description_content']/p");
    private By summerDressesLocator = By.xpath("//*[@class='tree dynamized']/li[3]");
    private By printedSummerDressLocator = By.xpath("//*[@class=\"product_list grid row\"]/li/div/div/div/a");
    private By validateShortDressDescriptionLocator = By.xpath("//*[@class='buttons_bottom_block']/../div");
    private By validateDressConditionLocator = By.xpath("//*[@id='product_condition']");
    private By quantityButtonLocator = By.xpath("//*[@class='icon-plus']");
    private By proceedToCheckoutLocator = By.xpath("//*[@class='button-container']/a/span");
    public AddProductsInCartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToProductsPage() {
        driver.navigate().to("http://www.automationpractice.pl/index.php");
    }

    //public void clicktshirtButton() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(tshirtButtonLocator)).click();
    //}
    public void clickDressButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dressButtonLocator)).click();
    }

    //public void clickfadedShortSleeveButton() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(fadedShortSleeveButtonLocator)).click();
    //}
    public void clickprintedDreess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(printedDreessLocator)).click();
    }

    public void clickPinkColor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinkColorButton)).click();
    }
    public void clickBlueColor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(blueColorLocator)).click();
    }
    public void switchToWindow() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(switchToIFrameWindow));
    }

    //public void selectFadedShortSleeveSize(String text) {
       // wait.until(ExpectedConditions.visibilityOfElementLocated(sizeFadedShortSleeveLocator)).sendKeys(text);
   // }

    public void clickAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartLocator)).click();
    }
    public void switchToMainPage() {
        driver.switchTo().defaultContent();
    }
    public void clickContinueShoppingButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingLocator)).click();
    }
    public String validateTextProductInShoppingCart (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validateProductAddedToCartLocator)).getText();
    }
    public String validateProductName (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validateProductNameLocator)).getText();
    }
    public String validateSizeAndColor (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validateSizeAndColorLocator)).getText();
    }
    public void clickSummerDresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(summerDressesLocator)).click();
    }
    public void clickPrintedSummerDressButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(printedSummerDressLocator)).click();
    }
    public String validateShortDressDescription (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validateShortDressDescriptionLocator)).getText();
    }
    public String validateDressCondition (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validateDressConditionLocator)).getText();
    }
    public void clickQuantityButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(quantityButtonLocator)).click();
    }
    public void clickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutLocator)).click();
    }
    //public void click() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(clickColorPrintedDress();)).click();
   // }

}
