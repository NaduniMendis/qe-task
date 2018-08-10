package com.sysco.pages.home;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {

    protected static SyscoLabUI syscoLabUIOgm;

    private By msgEnterage= By.xpath("//*[@id=\"age_content\"]/form/div[7]/div/span");
    private By errorMsg = By.id("age_missing_message");

    private By drpDwnDay = By.id("age_select_day");
    private By drpDwnMonth=By.id("age_select_month");
    private By drpDwnYear=By.id("age_select_year");
    private By btnEnter= By.id("age_confirm_btn");

    public static void loadHomepage(Capabilities capabilities, String url) {
        syscoLabUIOgm = new SyscoLabWUI(capabilities);
        syscoLabUIOgm.navigateTo(url);
        syscoLabUIOgm.driver.manage().window().maximize();
    }

    public String waitForText(){
        syscoLabUIOgm.waitTillElementLoaded(msgEnterage);
        return syscoLabUIOgm.getText(msgEnterage);
//       return syscoLabUIOgm.findElement(msgEnterage).isDisplayed();
    }

    public String checkError() {
        syscoLabUIOgm.waitTillElementLoaded(errorMsg);
        return syscoLabUIOgm.getText(errorMsg);
//        return syscoLabUIOgm.findElement(errorMsg).isDisplayed();
    }

    public void verifyAge(String day,String month, String year) {
        Select dayDropDown = new Select(syscoLabUIOgm.findElement(drpDwnDay));
        dayDropDown.selectByVisibleText(day);
        Select monthDropDown = new Select(syscoLabUIOgm.findElement(drpDwnMonth));
        monthDropDown.selectByVisibleText(month);
        Select yearDropDown = new Select(syscoLabUIOgm.findElement(drpDwnYear));
        yearDropDown.selectByVisibleText(year);
    }

    public void clickButton() {
        syscoLabUIOgm.findElement(btnEnter).click();
//        syscoLabUIOgm.waitTillElementDisappear(btnEnter);
    }

    public boolean loadNextPage() {
//        syscoLabUIOgm.waitTillElementDisappear(btnEnter);
        if(syscoLabUIOgm.waitTillElementDisappear(btnEnter))
        { return true;}
        else
            return false;
    }

    public void quitDriver() {
        if (syscoLabUIOgm != null) {

            syscoLabUIOgm.sleep(10);
            syscoLabUIOgm.quit();
        }
    }




}
