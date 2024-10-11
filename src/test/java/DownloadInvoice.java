import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadInvoice extends Start{
    PlaceOrder order = new PlaceOrder();
    RegisterUser user = new RegisterUser();
    @Test
    public void DownloadInvoiceAfterPurchase(){
//        4. Add products to cart
//        5. Click 'Cart' button
//        6. Verify that cart page is displayed
//        7. Click Proceed To Checkout
        order.Addproducts(driver);

//        8. Click 'Register / Login' button
//        9. Fill all details in Signup and create account
//        10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//        11. Verify ' Logged in as username' at top
        user.SignUp(driver);

//        12.Click 'Cart' button
//        13. Click 'Proceed To Checkout' button
//        14. Verify Address Details and Review Your Order

//        15. Enter description in comment text area and click 'Place Order'
//        16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//        17. Click 'Pay and Confirm Order' button
//        18. Verify success message 'Your order has been placed successfully!'
        order.fillInDetails(driver);

//        19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/a")).click();

//        20. Click 'Continue' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

//        21. Click 'Delete Account' button
//        22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        order.Delete(driver);
    }
}
