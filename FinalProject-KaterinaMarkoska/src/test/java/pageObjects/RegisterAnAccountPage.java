package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAnAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;
    By signInButtonLocator = By.xpath("//*[@class=\"header_user_info\"]/a");
    By enterEmailAddressLocator = By.xpath("//*[@id='email_create']");
    By clickCreateAnAccountButtonLocator = By.xpath("//*[@id='SubmitCreate']/span");
    By mrsButtonLocator = By.cssSelector("#uniform-id_gender2");
    By firstNameLocator = By.xpath("//*[@id='customer_firstname']");
    By lastNameLocator = By.xpath("//*[@id='customer_lastname']");
    By passwordLocator = By.xpath("//*[@id='passwd']");
    By selectDaysLocator = By.cssSelector("select#days");
    By selectMonthLocator = By.cssSelector("select#months");
    By selectYearLocator = By.cssSelector("select#years");
    By registerButtonLocator = By.xpath("//*[@id='submitAccount']/span");
    By textYourAccountHasBeenCreatedLocator = By.xpath("//*[@id='center_column']/p");
    By addMyFirstAddressBtnLocator = By.xpath("//*[@title='Add my first address']");
    By textWelcomeToyourAccountLocator = By.xpath("//*[@id='center_column']/p[2]");
    By yourAddressValidationListLocator = By.xpath("//*[@id='center_column']/div/p");
    By companyNameLocator = By.xpath("//*[@id='company']");
    By adress1locator = By.xpath("//*[@id='address1']");
    By adress2locator = By.xpath("//*[@id='address2']");
    By cityLocator = By.xpath("//*[@id='city']");
    By stateLocator = By.id("id_state");
    By zipCodeLocator = By.xpath("//*[@id='postcode']");
    By countryLocator = By.cssSelector("select#id_country");
    By phone1Locator = By.xpath("//*[@id='phone']");
    By phone2Locator = By.xpath("//*[@id='phone_mobile']");
    By addressTitleLocator = By.xpath("//*[@id='alias']");
    By saveButtonLocator = By.xpath("//*[@id='submitAddress']/span");




    public RegisterAnAccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToAutomationPractisePage() {
        driver.navigate().to("http://www.automationpractice.pl/index.php");
    }

    public void enterSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInButtonLocator)).click();
    }

    public void enterEmailAddress(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterEmailAddressLocator)).sendKeys(emailAddress);
    }

    public void clickCreateAnAccountButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreateAnAccountButtonLocator)).click();
    }

    public void clickMrsButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mrsButtonLocator)).click();
    }

    public void enterFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLocator)).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameLocator)).sendKeys(lastName);
    }
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator)).sendKeys(password);
    }
    public void selectDays(String selectDays) {
        WebElement stateElement = driver.findElement(selectDaysLocator);
        stateElement.sendKeys(selectDays);
    }
    public void selectMonths(String selectMonths) {
        WebElement stateElement = driver.findElement(selectMonthLocator);
        stateElement.sendKeys(selectMonths);
    }
    public void selectYear(String selectYear) {
        WebElement stateElement = driver.findElement(selectYearLocator);
        stateElement.sendKeys(selectYear);
    }

    public void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButtonLocator)).click();
    }
    public String verifyTextForAccount(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(textYourAccountHasBeenCreatedLocator)).getText();
    }
    public String verifyTextWelcomeToYourAccount(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(textWelcomeToyourAccountLocator)).getText();
    }
    public void clickAddMyFirstAddressBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addMyFirstAddressBtnLocator)).click();
    }
    public String validateYourAddressList(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(yourAddressValidationListLocator)).get(index).getText();
    }
    public void enterCompanyName(String companyName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyNameLocator)).sendKeys(companyName);
    }
    public void enterAddress1(String adress1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(adress1locator)).sendKeys(adress1);
    }
    public void enterAddress2(String adress2) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(adress2locator)).sendKeys(adress2);
    }
    public void enterCity(String city) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityLocator)).sendKeys(city);
    }
    public void selectStateName(String stateName) {
        WebElement stateElement = driver.findElement(stateLocator);
        stateElement.sendKeys(stateName);
    }
    public void enterZipCode(String zipCode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeLocator)).sendKeys(zipCode);
    }
    public void selectCountryName(String countryName) {
        WebElement countryElement = driver.findElement(countryLocator);
        countryElement.sendKeys(countryName);
    }

    public void enterPhoneNumber1(String phone1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone1Locator)).sendKeys(phone1);
    }
    public void enterPhoneNumber2(String phone2) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone2Locator)).sendKeys(phone2);
    }
    public void enterAddressTitle(String addressTitle) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressTitleLocator)).sendKeys(addressTitle);
    }
    public void clickSaveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButtonLocator)).click();
    }
}