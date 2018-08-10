package com.sysco.tests.home;

import com.sysco.functions.home.Home;
import com.sysco.utils.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.ITestContext;

public class HomeTest extends TestBase {
//https://github.com/NaduniMendis/qe-task.git
    SoftAssert sAssert = new SoftAssert();
    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum_V1 - Checkout_V1");
    }

    @Test (description = "tc-01", alwaysRun = true,priority = 1)
    public void testLoadHome() {
        Home.loadHomePage();
        sAssert.assertEquals(Home.agecheckAppear(), "Enter your birthdate:", "Couldn't load website");
    }

    @Test (description = "tc-02",alwaysRun = true,priority = 2)
    public void testInvalidAge(){
        Home.ageCheck("31","December","1994"); //boundary value of invalid age
        Home.clickSubmit();
        sAssert.assertEquals(Home.appearValidationmsg(),
                "Sorry, your age or location does not permit you to enter at this time.",
                "Age validation is not working");

    }
    @Test (description = "tc-03",alwaysRun = true,priority = 3)
    public void testValidAge(){
        Home.ageCheck("1","January","1993"); //boundary value of valid age
        Home.clickSubmit();
        sAssert.assertEquals(Home.checkLoadpage(), true, "Age validation is not working");
    }


}

