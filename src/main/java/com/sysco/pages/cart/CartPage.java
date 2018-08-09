package com.sysco.pages.cart;

import com.sysco.pages.account.MyaccountPage;
import org.openqa.selenium.By;
public class CartPage extends MyaccountPage {


    int noOfItems;
    String num;
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
    private By cartIcon=By.className("orange");
    private By btnContinue= By.id("delivery-address-button");
    private By btnContinueshipmethod= By.id("shipping-method-button");


    public void gotoCart() {
        syscoLabUIOgm.findElement(iconCart).click();
        syscoLabUIOgm.waitTillElementLoaded(popupCart);


    }

    public boolean checkCartpopup() {

        syscoLabUIOgm.waitTillElementLoaded(popupCart);
        return syscoLabUIOgm.findElement(popupCart).isDisplayed();
    }

    public void clickRemove() {
//        num= syscoLabUIOgm.findElement(cartIcon).getText();
//        noOfItems=Integer.parseInt(num);
//
//        while (syscoLabUIOgm.findElement(txtCartempty).isDisplayed()==false){
        gotoCart();
        syscoLabUIOgm.mouseHover(popupCart);
        syscoLabUIOgm.findElement(btnRemove).click();
        if(syscoLabUIOgm.isAlertDisplayed())
            syscoLabUIOgm.clickOkInWindowsAlert();
//    }
//        while (!syscoLabUIOgm.findElement(txtCartempty).isDisplayed()) {
            gotoCart();
            //syscoLabUIOgm.waitTillElementLoaded(popupCart);
            syscoLabUIOgm.sleep(2);
            syscoLabUIOgm.findElement(btnRemove).click();
            if (syscoLabUIOgm.isAlertDisplayed())
                syscoLabUIOgm.clickOkInWindowsAlert();
//        }


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
       // syscoLabUIOgm.findElement(txtPostcode).sendKeys(postcode);

        syscoLabUIOgm.findElement(btnProceedtocheckout).click();
        syscoLabUIOgm.sleep(10);
        syscoLabUIOgm.findElement(btnContinue).click();
        syscoLabUIOgm.sleep(10);
        syscoLabUIOgm.findElement(btnContinueshipmethod).click();

    }
}
