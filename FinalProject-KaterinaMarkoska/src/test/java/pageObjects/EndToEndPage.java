package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndPage {

    private WebDriver driver;
    private WebDriverWait wait;
    By verifyTextAboutMyAdresses1LocatorList = By.xpath("//*[@class='addresses']/p");
    By verifyTextAboutMyAdressesLocator = By.xpath("//*[@id='center_column']/p");
    By verifyMyAddressLocatorList = By.xpath("//*[contains(@class, 'last_item item box')]/li");
    By clickHomeButtonLocator = By.xpath("//*[@class='footer_links clearfix']/li[2]/a/span");
    By clickProceedToCheckoutContinueShoppingButtonLocator = By.xpath("//*[@class='cart_navigation clearfix']/a/span");
    By clickProceedToCheckoutAdressButtonLocator = By.xpath("//*[@name='processAddress']/span");
    By clickTermsOfServiceCheckBtnLocator = By.xpath("//*[@class='checkbox']/div/span");
    By verifyTextChooseAShippingOptionLocator = By.xpath("//*[@class='delivery_options_address']/p");
    By clickProceedToCheckoutShippingLocator = By.xpath("//*[@name='processCarrier']");
    By clickPayByBankWireBtnLocator = By.xpath("//*[@class='payment_module']/a");
    By verifyBankWirePaymentBoldTextLocator = By.xpath("//*[@class='cheque-indent']");
    By clickConfirmMyOrderBtnLocator = By.xpath("//*[@class='button btn btn-default button-medium']/span");
    By  verifyOrderCompletTextLocator = By.xpath("//*[@class='alert alert-success']");
    By verifyDeliveryAddressListLocator = By.xpath("//*[@id = 'address_delivery']/li");




    public EndToEndPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToAutomationPractisePage() {
        driver.navigate().to("http://www.automationpractice.pl/index.php");
    }
    public String validateYourAddressPageList(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(verifyTextAboutMyAdresses1LocatorList)).get(index).getText();
    }
    public String verifyTextInMyAddreses(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyTextAboutMyAdressesLocator)).getText();
    }
    public void clickHomeButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickHomeButtonLocator)).click();
    }
    public void clickProceedToCheckoutAdressButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProceedToCheckoutAdressButtonLocator)).click();
    }
    public void clickProceedToCheckoutContinueShoppingButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProceedToCheckoutContinueShoppingButtonLocator)).click();
    }
    public void clickTermsOfServiceCheckBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickTermsOfServiceCheckBtnLocator)).click();
    }
    public String verifyTextChooseAShippingOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyTextChooseAShippingOptionLocator)).getText();
    }
    public void clickProceedToCheckoutShipping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProceedToCheckoutShippingLocator)).click();
    }
    public void clickPayByBankWireBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickPayByBankWireBtnLocator)).click();
    }
    public String verifyBankWirePaymentBoldText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyBankWirePaymentBoldTextLocator)).getText();
    }
    public void clickConfirmMyOrderBtn () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickConfirmMyOrderBtnLocator )).click();
    }
    public String verifyOrderCompleteText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyOrderCompletTextLocator)).getText();
    }
    public String  verifyDeliveryAddressList (int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( verifyDeliveryAddressListLocator)).get(index).getText();
    }

    public String  verifyMyAddressList (int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( verifyMyAddressLocatorList)).get(index).getText();
    }






}
