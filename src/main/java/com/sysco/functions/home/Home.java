package com.sysco.functions.home;

import com.sysco.common.Constants;
import com.sysco.pages.home.HomePage;
import com.sysco.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Home {
    public static HomePage ogmHomePage = new HomePage();

    public static void loadHomePage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmHomePage.loadHomepage(capabilities, Constants.APP_URL);
        } else {
            ogmHomePage.loadHomepage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }

    public static String agecheckAppear(){
         return ogmHomePage.waitForText();
    }

    public static void ageCheck(String day1, String month1, String year1) {
        ogmHomePage.verifyAge(day1, month1, year1);
    }

    public static void clickSubmit() {
        ogmHomePage.clickButton();
    }

    public static String appearValidationmsg() {
        return ogmHomePage.checkError();
    }

    public static boolean checkLoadpage() {
        return ogmHomePage.loadNextPage();
    }

    public static void quitDriverFunction() {
        ogmHomePage.quitDriver();
    }

}
