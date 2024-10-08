import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifySubscription extends Start{
    @Test
    public void VerifySubscriptioninHomePage(){

//        5. Verify text 'SUBSCRIPTION'
       String text = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
        System.out.println(text);

        //        6. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("habeba@gmail.com");
        driver.findElement(By.id("subscribe")).click();

        //        7. Verify success message 'You have been successfully subscribed!' is visible
//        String successMssg = driver.findElement().getText();
//        System.out.println(successMssg);
    }
}
