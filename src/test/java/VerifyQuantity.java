import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VerifyQuantity extends Start{

    @Test
    public void VerifyQuantityInCart(){
//        4. Click 'View Product' for any product on home page
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")).click();
//        5. Verify product detail is opened
            String page = driver.getCurrentUrl();
            System.out.println(page);
//        6. Increase quantity to 4
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("4");
//        7. Click 'Add to cart' button
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
//
//       8. Click 'View Cart' button
       // driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
//
//        9. Verify that product is displayed in cart page with exact quantity
    }
}
