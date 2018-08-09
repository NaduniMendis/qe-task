package com.sysco.functions.cart;

import com.sysco.pages.cart.CartPage;

public class Cart {

    public static CartPage ogmCartPage = new CartPage();

    public static void openCart() {
        ogmCartPage.gotoCart();
    }

    public static boolean verifyCartpopup() {
        return ogmCartPage.checkCartpopup();
    }

    public static void removeItem() {
        ogmCartPage.clickRemove();
    }

    public static boolean verifyEmptycart() {
        return ogmCartPage.checkCartempty();
    }

    public static void navigateToProduct() {
        ogmCartPage.selectProducttab();
        ogmCartPage.hoverProduct();
    }

    public static void addtoCart() {
        ogmCartPage.selectItem();
    }

    public static void itemCheckout() {
        ogmCartPage.checkoutFromCart();
    }

    public static String checkItemName() {
        return ogmCartPage.verifyItemname();
    }

    public static String checkItemprice() {
        return ogmCartPage.verifyItemprice();

    }

    public static void proceedtoCheckout() {
        ogmCartPage.clickProceedtocheckout();
    }

    public static String checkFirstname() {
        return ogmCartPage.verifyFirstname();
    }

    public static String checkLastname() {
        return ogmCartPage.verifyLastname();
    }

    public static void clickContinue() {
        ogmCartPage.clickContinue();

    }

    public static void clickContinueshipbtn() {
        ogmCartPage.clickContinueshipmethod();
    }

    public static void clearformdetails() {
        ogmCartPage.clearform();
    }

    public static String getEmptyfieldserror() {
        return ogmCartPage.verifyFormempty();
    }

    public static void fillformdetails() {
        ogmCartPage.fillform();
    }
}
