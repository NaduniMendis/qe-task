package com.sysco.functions.account;

import com.sysco.pages.account.MyaccountPage;

public class Myaccount  {


    public static MyaccountPage ogmAccountPage = new MyaccountPage();
    public static void clickAccount() {
        ogmAccountPage.clickMyaccount();
    }

    public static boolean verifyLgnbtn() {
        return ogmAccountPage.verifyLoginbtn();
    }

    public static void enterEmail(String email) {
        ogmAccountPage.inputEmail(email);
    }

    public static boolean displayEmailerror() {
        return ogmAccountPage.checkEmailerror();
    }


    public static void enterPassword(String password) {
        ogmAccountPage.clickLogin(password);
    }
    public static boolean displayCredentialserror() {
        return ogmAccountPage.checkLoginerrormsg();
    }

    public static String displayUsername() {
        return ogmAccountPage.getUsername();
    }
}
