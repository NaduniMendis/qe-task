package com.sysco.pages.cart;

import com.sysco.pages.account.MyaccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class CartPage extends MyaccountPage {

   // private  int noOfItems;
    private String num;
    private By iconCart=By.xpath("//*[@id=\"cartHeader\"]");
    private By popupCart= By.id("topCartContent");
        private By btnRemove= By.xpath("//*[contains(text(),'Remove')]");
//    private By btnRemove = By.xpath("/html//ol[@id='mini-cart']/li[1]/div[@class='product-details']/div[@class='product-btn-content']/a[@title='Remove']");
//    private By btnRemove= By.xpath("//*[contains(@id,'cartheader-item-')]");
    private By txtCartempty= By.xpath("//div[@id='topCartContent']//p[@class='cart-empty']");
    private By btnProducts= By.className("link-product");
    private By txtExclusiveRange = By.xpath("/html//div[@id='nav-wrapper']/div[@class='nav-wrapper-inner']/div[4]/div[@class='megamenu-left']/div[1]/ul//ul[@class='level0']//a[@href='https://www.bundabergrum.com.au/all-bottles/exclusive']");
    private By btnViewMore= By.xpath("//*[@id=\"main-image\"]/img");
    private By btnAddtocart= By.xpath("//*[@id=\"price-inner-content\"]/div[2]/div/div[2]/button");
    private By btnCheckout= By.xpath("//*[@id=\"topCartContent\"]/div/div/div/button/span/span");
    private By btnProceedtocheckout= By.xpath("//div[@id='price-total-content']//ul[@class='checkout-types']//button[@title='Proceed to Checkout']/span/span");
    private By cartIcon=By.xpath("/*[@id=\\\"quick-access-list\\\"]/li[2]/ul/li[3]/div/div[1]/span[2]");
    private By btnContinue= By.id("delivery-address-button");
    private By btnContinueshipmethod= By.id("shipping-method-button");
    private By txtPostcode =By.id("postcodesuburb");
    private String postcode="2000 BARANGAROO New South Wales";
    private By itemName=By.xpath("//*[@id=\"shopping-cart-table\"]/div[2]/div/div/div[2]/h2/a");
//    private By itemName=By.xpath("/html//div[@id='shopping-cart-table']/div[@class='tbody']//h2/a[@href='https://www.bundabergrum.com.au/bundaberg-royal-liqueur-salted-caramel']");
    private By itemPrice=By.xpath("//*[@id=\"shopping-cart-table\"]/div[2]/div/div/div[3]/div[1]/span/span");
    private By txtFirstname=By.id("billing:firstname");
    private By txtLastname=By.id("billing:lastname");
    private By textAddress1=By.id("billing:street1");
    private By textPostcode= By.id("billing:postcodesuburb");
    private By btnPostcode=By.id("billing:postcodesuburbremove");
    private By txtContactnum=By.id("billing:telephone");
    private By errorRquiredFieldMsg= By.id("advice-required-entry-billing:firstname");
    private By txtCheckout=By.id("checkoutSteps");
    private By drpDwnCity=By.id("Autocomplete_billing:postcodesuburb");
    private By cityDropDownItem=By.xpath("//*[@id=\"Autocomplete_billing:postcodesuburb\"]/div[1]");

//    private By itemPrice = By.xpath("/html//div[@id='shopping-cart-table']/div[@class='tbody']/div[@class='product-item']//div[@class='col-3 desktop-view']/span[@class='cart-price']/span[@class='price']");


    public void gotoCart() {
        syscoLabUIOgm.findElement(iconCart).click();
        syscoLabUIOgm.waitTillElementLoaded(popupCart);


    }

    public boolean checkCartpopup() {

        syscoLabUIOgm.waitTillElementLoaded(popupCart);
        return syscoLabUIOgm.findElement(popupCart).isDisplayed();
    }

    public void clickRemove() {
//        while (syscoLabUIOgm.findElement(txtCartempty).isDisplayed()==false){
        gotoCart();
        syscoLabUIOgm.mouseHover(popupCart);
        syscoLabUIOgm.waitTillElementLoaded(popupCart);
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.findElement(btnRemove).click();
        syscoLabUIOgm.sleep(2);
        if(syscoLabUIOgm.isAlertDisplayed())
            syscoLabUIOgm.clickOkInWindowsAlert();
//    }
        syscoLabUIOgm.sleep(4);
        int noOfItems = Integer.parseInt(syscoLabUIOgm.getText(cartIcon));
//        num=syscoLabUIOgm.getText(cartIcon);
//        noOfItems=Integer.parseInt(num);
//        System.out.println(num);
//        System.out.println(noOfItems);
        if(noOfItems!=0){
            for(int i=0;i<noOfItems;i++) {
                gotoCart();
                syscoLabUIOgm.waitTillElementLoaded(popupCart);
                syscoLabUIOgm.sleep(2);
                syscoLabUIOgm.findElement(btnRemove).click();
                syscoLabUIOgm.sleep(2);
                if (syscoLabUIOgm.isAlertDisplayed())
                    syscoLabUIOgm.clickOkInWindowsAlert();
            }
        }
//        System.out.println(noOfItems);


    }

    public boolean checkCartempty() {

         syscoLabUIOgm.findElement(txtCartempty).getText();
         System.out.println(syscoLabUIOgm.findElement(txtCartempty).getText());
         return syscoLabUIOgm.findElement(txtCartempty).isDisplayed();

    }

    public void selectProducttab() {
        syscoLabUIOgm.findElement(btnProducts).click();
    }

    public void hoverProduct() {
        syscoLabUIOgm.mouseHover(btnProducts);
        syscoLabUIOgm.findElement(txtExclusiveRange).click();
        syscoLabUIOgm.findElement(btnViewMore).click();
    }


    public void selectItem() {
        syscoLabUIOgm.findElement(btnAddtocart).click();
    }

    public void checkoutFromCart() {
        syscoLabUIOgm.findElement(iconCart).click();
        syscoLabUIOgm.waitTillElementLoaded(popupCart);
        syscoLabUIOgm.sleep(10);
        syscoLabUIOgm.findElement(btnCheckout).click();
//        syscoLabUIOgm.findElement(itemName).getText();
//       syscoLabUIOgm.findElement(txtPostcode).sendKeys(postcode);
//        syscoLabUIOgm.findElement(btnProceedtocheckout).click();
//        syscoLabUIOgm.sleep(10);
//        syscoLabUIOgm.findElement(btnContinue).click();
//        syscoLabUIOgm.sleep(10);
//        syscoLabUIOgm.findElement(btnContinueshipmethod).click();

    }

    public String verifyItemname() {
        return syscoLabUIOgm.findElement(itemName).getText();

    }

    public String verifyItemprice() {
        return syscoLabUIOgm.findElement(itemPrice).getText();


    }

    public void clickProceedtocheckout() {
        syscoLabUIOgm.findElement(txtPostcode).sendKeys(postcode);

        syscoLabUIOgm.findElement(btnProceedtocheckout).click();
        syscoLabUIOgm.sleep(10);

    }

    public String verifyFirstname(){
//        return syscoLabUIOgm.findElement(txtFirstname).getText();
        return syscoLabUIOgm.findElement(txtFirstname).getAttribute("value");
    }

    public String verifyLastname(){
        return syscoLabUIOgm.findElement(txtLastname).getAttribute("value");
    }

    public void clickContinue() {

        syscoLabUIOgm.findElement(btnContinue).click();
        syscoLabUIOgm.sleep(5);
        while (syscoLabUIOgm.isAlertDisplayed()){
            syscoLabUIOgm.sleep(3);
            syscoLabUIOgm.clickOkInWindowsAlert();
        }
        syscoLabUIOgm.sleep(5);

        if (syscoLabUIOgm.isAlertDisplayed()) {
            syscoLabUIOgm.clickOkInWindowsAlert();
            syscoLabUIOgm.sleep(5);
        }
        if(syscoLabUIOgm.findElement(txtCheckout).isDisplayed()) {

            syscoLabUIOgm.sleep(5);
            if(syscoLabUIOgm.findElement(btnContinue).isDisplayed())
            syscoLabUIOgm.findElement(btnContinue).click();
        }
    }

    public void clickContinueshipmethod() {
        syscoLabUIOgm.sleep(5);
        syscoLabUIOgm.findElement(btnContinueshipmethod).click();
        syscoLabUIOgm.sleep(2);;
    }


    public void clearform() {
        syscoLabUIOgm.findElement(txtFirstname).clear();
        syscoLabUIOgm.findElement(txtLastname).clear();
        syscoLabUIOgm.findElement(textAddress1).clear();
        syscoLabUIOgm.findElement(btnPostcode).click();
        syscoLabUIOgm.findElement(txtContactnum).clear();


    }

    public String verifyFormempty() {

        return syscoLabUIOgm.findElement(errorRquiredFieldMsg).getText();
    }

    public void fillform() {
        syscoLabUIOgm.findElement(txtFirstname).sendKeys("william");
        syscoLabUIOgm.findElement(txtLastname).sendKeys("jacob");
        syscoLabUIOgm.findElement(textAddress1).sendKeys("12/1, Park Street");
        syscoLabUIOgm.findElement(textPostcode).sendKeys("2000");

        try {
            Robot robot = new Robot();
            for (int i = 1; i <= 2; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(2000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        syscoLabUIOgm.findElement(txtContactnum).sendKeys("777777");

    }
}
