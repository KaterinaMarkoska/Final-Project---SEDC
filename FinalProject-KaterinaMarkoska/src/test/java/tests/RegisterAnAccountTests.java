package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAnAccountTests extends BaseTests{

    @Test
    public void registerTests() throws InterruptedException {
        registerAnAccountPage.navigateToAutomationPractisePage();
        Thread.sleep(2000);
        registerAnAccountPage.enterSignInButton();
        Thread.sleep(2000);
        registerAnAccountPage.enterEmailAddress("KristinaM99@gmail.com");
        Thread.sleep(2000);
        registerAnAccountPage.clickCreateAnAccountButton();
        Thread.sleep(2000);
        registerAnAccountPage.clickMrsButton();
        Thread.sleep(2000);
        registerAnAccountPage.enterFirstName("Kristina");
        Thread.sleep(2000);
        registerAnAccountPage.enterLastName("Kristovska");
        Thread.sleep(2000);
        registerAnAccountPage.enterPassword("dobroutro");
        Thread.sleep(2000);
        registerAnAccountPage.selectDays("10");
        Thread.sleep(2000);
        registerAnAccountPage.selectMonths("May");
        registerAnAccountPage.selectYear("2018");
        registerAnAccountPage.clickRegisterButton();
        Thread.sleep(2000);
        Assert.assertEquals(registerAnAccountPage.verifyTextForAccount(), "Your account has been created.");
        Assert.assertEquals(registerAnAccountPage.verifyTextWelcomeToYourAccount(),"Welcome to your account. Here you can manage all of your personal information and orders.");
        registerAnAccountPage.clickAddMyFirstAddressBtn();
        Assert.assertEquals(registerAnAccountPage.validateYourAddressList(0),"To add a new address, please fill out the form below.");
        Assert.assertEquals(registerAnAccountPage.validateYourAddressList(1),"*Required field");
        registerAnAccountPage.enterCompanyName("Kika Company");
        registerAnAccountPage.enterAddress1("Adresa na Kristina 1");
        registerAnAccountPage.enterAddress2("Adresa na Kristina 2");
        registerAnAccountPage.enterCity("Kumanovo");
        registerAnAccountPage.selectStateName("Arizona");
        registerAnAccountPage.enterZipCode("10000");
        registerAnAccountPage.selectCountryName("United States");
        registerAnAccountPage.enterPhoneNumber1("088888888");
        registerAnAccountPage.enterPhoneNumber2("099999999");
        Thread.sleep(2000);
        registerAnAccountPage.clickSaveButton();

    }
}


