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
}
