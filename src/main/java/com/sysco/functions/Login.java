//package com.sysco.functions;
//
//import com.sysco.common.Constants;
//import com.sysco.pages.LoginPage;
//import com.sysco.utils.DriverSetUpUtil;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
///**
// * Created by Rifad on 5/21/18.
// */
//public class Login  {
//
//    public static LoginPage ogmLoginPage = new LoginPage();
//
//
//    public static void loadLoginPage() {
//
//        if (Constants.RUN_LOCALLY) {
//            DriverSetUpUtil.setToRunLocally();
//            DesiredCapabilities capabilities = null;
//            ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);
//        } else {
//            ogmLoginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
//        }
//    }
//
//
//    public static void quiteDriver() {
//        ogmLoginPage.quitDriver();
//    }
//
//    public static void loginToFtr() {
//
//    }
//}
