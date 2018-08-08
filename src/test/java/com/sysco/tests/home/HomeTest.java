package com.sysco.tests.home;

import com.sysco.functions.home.Home;
import com.sysco.utils.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.ITestContext;

public class HomeTest extends TestBase {

    SoftAssert sAssert = new SoftAssert();
    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test (priority = 0)
    public void testLoadHome() throws Exception {
        Home.loadHomePage();
        sAssert.assertEquals(Home.agecheckAppear(), true, "Couldn't load website");
    }

    @Test (priority = 2)
    public void testValidAge(){
        Home.ageCheck("5","June","1993");
        Home.clickSubmit();
        sAssert.assertEquals(Home.appearError(), false, "Age validation is not working");
//        Home.quiteDriver();
    }

    @Test (priority = 1)
    public void testInvalidAge(){
        Home.ageCheck("5","July","2000");
        Home.clickSubmit();
        sAssert.assertEquals(Home.appearError(), true, "Invalid Age validation is not working");
    }
}

