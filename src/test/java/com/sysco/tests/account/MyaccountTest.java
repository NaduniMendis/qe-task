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
        iTestContext.setAttribute("feature", "Bundabergrum_V1 - Checkout_V1");

        Home.loadHomePage();
        Home.ageCheck("5","January","1990");
        Home.clickSubmit();
        Home.checkLoadpage();
    }

    @Test (description = "test4",alwaysRun = true,priority = 1)
    public void testAccount() {
        Myaccount.clickAccount();
        sAssert.assertEquals(Myaccount.verifyLgnbtn(), true, "Failed");
    }

    @Test (description = "test5", alwaysRun = true,priority = 2)
    public void testEmail(){
        Myaccount.enterEmail("emailemaildys..com");
        sAssert.assertEquals(Myaccount.displayEmailerror(), true, "Failed");
    }

    @Test (description = "test6", alwaysRun = true,priority = 3)
    public void testinvalidLogin(){
        Myaccount.enterEmail("nads@gmail.com");
        Myaccount.enterPassword("1231233");
        sAssert.assertEquals(Myaccount.displayCredentialserror(), true, "Failed");
    }

    @Test (description = "test6", alwaysRun = true,priority = 3)
    public void testemptyCredentials(){
        Myaccount.enterEmail("");
        Myaccount.enterPassword("");
        sAssert.assertEquals(Myaccount.displayCredentialserror(), true, "Failed");
    }

    @Test (description = "test7", alwaysRun = true, priority = 4)
    public void testvalidLogin(){
        Myaccount.enterEmail("williamjacob802@gmail.com");
        Myaccount.enterPassword("12345678");
        sAssert.assertEquals(Myaccount.displayUsername().contains("William Jacob"),true,"Failed");

    }

//    @Test (description = "test7", alwaysRun = true, priority = 4)
//    public void testvalidLogin2(){
//        Myaccount.enterEmail("nadunimendis@gmail.com");
//        Myaccount.enterPassword("123123123");
//        sAssert.assertEquals(Myaccount.displayUsername().contains("William Jacob"),true,"Failed");
//
//    }

}
