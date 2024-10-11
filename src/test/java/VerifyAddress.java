import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyAddress extends Start{
    RegisterUser user = new RegisterUser();

    @Test
    public void VerifyAddressDetailsInCheckoutPage(){
//        4. Click 'Signup / Login' button
//        5. Fill all details in Signup and create account
//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//        7. Verify ' Logged in as username' at top
        user.SignUp(driver);

//        8. Add products to cart
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")).click();
//        9. Click 'Cart' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
//        10. Verify that cart page is displayed
//        11. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
//        12. Verify that the delivery address is same address filled at the time registration of account
        WebElement ulElement = driver.findElement(By.id("address_delivery"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        for (WebElement li : liElements) {
            System.out.println(li.getText());
        }
//        13. Verify that the billing address is same address filled at the time registration of account
        WebElement ulElement2 = driver.findElement(By.id("address_invoice"));
        List<WebElement> liElements2 = ulElement.findElements(By.tagName("li"));
        for (WebElement li : liElements) {
            System.out.println(li.getText());
        }
//        14. Click 'Delete Account' button
//        15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
       user.DeleteAcc(driver);

    }
}
