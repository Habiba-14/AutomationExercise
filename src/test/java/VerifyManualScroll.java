import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class VerifyManualScroll extends Start{

    @Test
    public void VerifyScrollUpwithoutArrow(){
//        4. Scroll down page to bottom
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

//        5. Verify 'SUBSCRIPTION' is visible
        String text=  driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
        System.out.println(text);

//        6. Scroll up page to top
        js.executeScript("window.scrollTo(0, 0);");
    }
}
