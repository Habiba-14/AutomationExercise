import org.testng.annotations.Test;

public class RegisterBfCheckout extends Start{
    PlaceOrder order = new PlaceOrder();
    RegisterUser user = new RegisterUser();
    @Test
    public void PlaceOrderRegisterbeforeCheckout(){
//        4. Click 'Signup / Login' button
//        5. Fill all details in Signup and create account
//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        user.SignUp(driver);


//        8. Add products to cart
//        9. Click 'Cart' button
//        10. Verify that cart page is displayed
//        11. Click Proceed To Checkout
//        12. Verify Address Details and Review Your Order
//        13. Enter description in comment text area and click 'Place Order'
//        14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//        15. Click 'Pay and Confirm Order' button
        order.Addproducts(driver);
        order.fillInDetails(driver);

//        17. Click 'Delete Account' button
//        18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        order.Delete(driver);
    }
}
