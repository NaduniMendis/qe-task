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
        iTestContext.setAttribute("feature", "Bundabergrum_V1 - Checkout_V1");

        Home.loadHomePage();
        Home.ageCheck("5","May","1992");
        Home.clickSubmit();
        Home.checkLoadpage();
        Myaccount.clickAccount();
        Myaccount.enterEmail("williamjacob802@gmail.com");
        Myaccount.enterPassword("12345678");
//        Myaccount.enterEmail("nadunimendis@gmail.com");
//        Myaccount.enterPassword("123123123");
    }

    @Test (description = "test8",alwaysRun = true,priority = 1)
    public void testCart() {
        Cart.openCart();
        sAssert.assertEquals(Cart.verifyCartpopup(),true, "Cart popup failed");
    }

    @Test (description = "test9",alwaysRun = true,priority = 2)
    public void testremoveCartItem(){
        Cart.removeItem();
        sAssert.assertEquals(Cart.verifyEmptycart(), true, "Cart item removal failed");
    }


    @Test (description = "test10", alwaysRun = true,priority = 3)
    public void testaddItem(){
        Cart.navigateToProduct();

    }

    @Test (description = "test11",alwaysRun = true,priority = 4)
    public void testselectItem(){
        Cart.addtoCart();
    }

    @Test(description = "test12", alwaysRun = true,priority = 5)
    public void testGotoCart(){
        Cart.itemCheckout();

    }

    @Test(description = "test13",alwaysRun = true,priority = 6)
    public void testItem_name_and_price(){
        Cart.checkItemName();
        sAssert.assertEquals(Cart.checkItemName(),
                "BUNDABERG ROYAL LIQUEUR SALTED CARAMEL ...",
                "Cart item is wrong");
        Cart.checkItemprice();
        sAssert.assertEquals(Cart.checkItemprice(),"$49.95", "Item price is wrong");
        sAssert.assertAll();
    }

    @Test(description = "test14",alwaysRun = true,priority = 7)
    public void testProceedtocheckout(){
        Cart.proceedtoCheckout();

    }

    @Test(description = "test14",alwaysRun = true,priority = 8)
    public void test_firstname_and_lastname(){
        Cart.checkFirstname();
        sAssert.assertEquals(Cart.checkFirstname(),
                "william",
                "Firstname is incorrect");
        Cart.checkLastname();
        sAssert.assertEquals(Cart.checkLastname(),"jacob", "Lastname is incorrect");
        sAssert.assertAll();
    }

    @Test(description = "test15",alwaysRun = true,priority = 9)
    public void test_validate_continuebtn(){
        Cart.clearformdetails();
        Cart.clickContinue();
        Cart.getEmptyfieldserror();

    }


    @Test(description = "test16",alwaysRun = true,priority = 10)
    public void test_continuebtn(){
        Cart.fillformdetails();
        Cart.clickContinue();

    }

    @Test(description = "test17",alwaysRun = true,priority = 11)
    public void test_continueshipbtn(){
        Cart.clickContinueshipbtn();

    }







}
