import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PlaceOrder extends Start {
    RegisterUser user = new RegisterUser();
    @Test
    public void PlaceOrderandRegister(){
//        4. Add products to cart
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")).click();

//        5. Click 'Cart' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
//        6. Verify that cart page is displayed
        String cart= driver.getCurrentUrl();
        System.out.println(cart);
//        7. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
//        8. Click 'Register / Login' button
            WebElement element = driver.switchTo().activeElement();
            element.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();

            // 9. Fill all details in Signup and create account
//        10. Verify 'ACCOUNT CREATED!' and click 'Continue' button

            user.SignUp(driver);

//        11. Verify ' Logged in as username' at top


//        12.Click 'Cart' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
//        13. Click 'Proceed To Checkout' button
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
//        14. Verify Address Details and Review Your Order

//        15. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.name("message")).sendKeys("text text text");
        driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();

//        16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        driver.findElement(By.name("name_on_card")).sendKeys("Habiba");
        driver.findElement(By.name("card_number")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("123");
        driver.findElement(By.name("expiry_year")).sendKeys("2020");

//        17. Click 'Pay and Confirm Order' button
        driver.findElement(By.id("submit")).click();

//        18. Verify success message 'Your order has been placed successfully!'

//        19. Click 'Delete Account' button
//        20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
        String actualText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        System.out.println(actualText);
        //click on continue
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

    }
}
