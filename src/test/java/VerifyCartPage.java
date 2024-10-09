import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyCartPage extends Start{
    @Test
    public void VerifySubscriptionInCartPage(){
//        4. Click 'Cart' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();

//        6. Verify text 'SUBSCRIPTION'
        String subscription=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
        System.out.println(subscription);
//        7. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("habeba@gmail.com");
        driver.findElement(By.id("subscribe")).click();

    }
}
