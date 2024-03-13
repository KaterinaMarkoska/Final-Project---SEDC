package tests;

import driver.DriverInitiate;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.AddProductsInCartPage;
import pageObjects.EndToEndPage;
import pageObjects.RegisterAnAccountPage;

import java.time.Duration;

public class BaseTests {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public RegisterAnAccountPage registerAnAccountPage;
    public AddProductsInCartPage addProductsInCartPage;
    public EndToEndPage endToEndPage;

    String browserName = "Chrome";

    @BeforeMethod
    public void initiate() {
        DriverInitiate driverInitiate = new DriverInitiate();
        driver = driverInitiate.initiateDriver(browserName);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        registerAnAccountPage = new RegisterAnAccountPage(driver, wait);
        addProductsInCartPage = new AddProductsInCartPage(driver, wait);
        endToEndPage = new EndToEndPage(driver, wait);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
