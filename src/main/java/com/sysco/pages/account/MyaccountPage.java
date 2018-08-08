package com.sysco.pages.account;

import com.sysco.pages.home.HomePage;
import org.openqa.selenium.By;

public class MyaccountPage extends HomePage {

    private By btnMyaccount= By.xpath("//*[@id=\"quick-access-list\"]/li[1]/ul/li[2]/ul/li/a");
    private By btnLogin= By.id("send2");
    private By txtEmail= By.id("email");
    private By emailErrormsg = By.id("advice-validate-email-email");
    private By txtPass = By.xpath("//*[@id=\"pass\"]");
    private By loginErrormsg= By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/ul/li/ul/li/span");
    private By lblUsername = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");

    public void clickMyaccount() {
        syscoLabUIOgm.click(btnMyaccount);
    }

    public boolean verifyLoginbtn() {
        return syscoLabUIOgm.findElement(btnLogin).isDisplayed();
    }

    public void inputEmail(String email) {
        syscoLabUIOgm.findElement(txtEmail).clear();
        syscoLabUIOgm.findElement(txtEmail).sendKeys(email);
    }

    public boolean checkEmailerror() {
        syscoLabUIOgm.findElement(txtPass).click();
        return  syscoLabUIOgm.findElement(emailErrormsg).isDisplayed();
    }

    public void clickLogin(String pass) {
        syscoLabUIOgm.findElement(txtPass).sendKeys(pass);
        syscoLabUIOgm.findElement(btnLogin).click();
    }

    public boolean checkLoginerrormsg() {
        return syscoLabUIOgm.findElement(loginErrormsg).isDisplayed();
    }

    public String getUsername() {
        return syscoLabUIOgm.findElement(lblUsername).getText();

    }
}
