import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseExists extends Start{
    @Test
   public void ValidateTestCasePageExists(){
        //Click on 'Test Cases' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();


        //Verify user is navigated to test cases page successfully
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

}
