import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddReview extends Start{
    @Test
    public void AddReviewToProducts(){
//        3. Click on 'Products' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
//        4. Verify user is navigated to ALL PRODUCTS page successfully
        driver.getCurrentUrl();
//        5. Click on 'View Product' button
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
//        6. Verify 'Write Your Review' is visible
      String text=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")).getText();
        System.out.println(text);
//        7. Enter name, email and review
        driver.findElement(By.id("name")).sendKeys("Habiba");
        driver.findElement(By.id("email")).sendKeys("habeba@gmail.com");
        driver.findElement(By.id("review")).sendKeys("text text text review review review");
//        8. Click 'Submit' button
        driver.findElement(By.id("button-review")).click();

    }
}
