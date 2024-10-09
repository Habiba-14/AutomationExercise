import org.testng.annotations.Test;

public class LoginBfCheckout extends Start{
    ValidLogin login = new ValidLogin();
    PlaceOrder order = new PlaceOrder();
    @Test
    public void LoginbeforeCheckout() {
// 4. Click 'Signup / Login' button
//5. Fill email, password and click 'Login' button
        login.Login(driver);

//7. Add products to cart
//8. Click 'Cart' button
//9. Verify that cart page is displayed
//10. Click Proceed To Checkout
//11. Verify Address Details and Review Your Order
//12. Enter description in comment text area and click 'Place Order'
// 13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//14. Click 'Pay and Confirm Order' button
//15. Verify success message 'Your order has been placed successfully!'
        order.Addproducts(driver);
        order.fillInDetails(driver);
// 16. Click 'Delete Account' button
//17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        order.Delete(driver);
    }

}
