import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddFromRecomendations extends Start{
 @Test
    public void AddToCartFromRecommendations(){
//     3. Scroll to bottom of page
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//     4. Verify 'RECOMMENDED ITEMS' are visible
     String text = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[2]/h2")).getText();
     System.out.println(text);
//     5. Click on 'Add To Cart' on Recommended product

     driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")).click();
//     6. Click on 'View Cart' button
     //driver.navigate().to("https://automationexercise.com/view_cart");
     WebElement element = driver.switchTo().activeElement();
     element.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]")).click();

     //driver.switchTo().activeElement().findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
//     7. Verify that product is displayed in cart page

 }
}
