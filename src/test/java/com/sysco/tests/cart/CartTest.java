package com.sysco.tests.cart;

import com.sysco.functions.account.Myaccount;
import com.sysco.functions.cart.Cart;
import com.sysco.functions.home.Home;
import com.sysco.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends TestBase {

    SoftAssert sAssert = new SoftAssert();
    @BeforeClass
    public void setUp(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Naduni - abc");

        Home.loadHomePage();
        Home.ageCheck("5","May","1992");
        Home.clickSubmit();
        Home.checkLoadpage();
        Myaccount.clickAccount();
        Myaccount.enterEmail("williamjacob802@gmail.com");
        Myaccount.enterPassword("12345678");
    }

    @Test (priority = 1)
    public void testCart() {
        Cart.openCart();
        sAssert.assertEquals(Cart.verifyCartpopup(),true, "Cart popup failed");
    }

    @Test (priority = 2)
    public void removeCartItem(){
        Cart.removeItem();
        sAssert.assertEquals(Cart.verifyEmptycart(), true, "Cart item removal failed");
    }


    @Test (priority = 4)
    public void addItem(){
        Cart.navigateToProduct();

    }

    @Test (priority = 5)
    public void selectItem(){
        Cart.addtoCart();
    }

    @Test(priority = 6)
    public void checkoutCart(){
        Cart.itemCheckout();
        Home.quiteDriver();
    }



}
