package com.sysco.tests.account;

import com.sysco.functions.account.Myaccount;
import com.sysco.functions.home.Home;
import com.sysco.utils.TestBase;
import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyaccountTest extends TestBase {

    SoftAssert sAssert = new SoftAssert();
    @BeforeClass
    public void setUp(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Naduni - abc");

        Home.loadHomePage();
        Home.ageCheck("5","January","1990");
        Home.clickSubmit();
        Home.checkLoadpage();
    }

    @Test (priority = 0)
    public void testAccount() {
        Myaccount.clickAccount();
        sAssert.assertEquals(Myaccount.verifyLgnbtn(), true, "Failed");
    }

    @Test (priority = 1)
    public void testEmail(){
        Myaccount.enterEmail("emailemaildys..com");
        sAssert.assertEquals(Myaccount.displayEmailerror(), true, "Failed");
      //  Myaccount.displayEmailerror();
    }

    @Test (priority = 2)
    public void testinvalidLogin(){
        Myaccount.enterEmail("nads@gmail.com");
        Myaccount.enterPassword("1231233");
        sAssert.assertEquals(Myaccount.displayCredentialserror(), true, "Failed");
        //Myaccount.displayCredentialserror();
    }

    @Test (priority = 3)
    public void testvalidLogin(){
        Myaccount.enterEmail("williamjacob802@gmail.com");
        Myaccount.enterPassword("12345678");
        Assert.fail();
//        Myaccount.displayUsername();
        sAssert.assertEquals(Myaccount.displayUsername().contains("William Jacob"),true,"Failed");



//        Home.quiteDriver();

    }

}
