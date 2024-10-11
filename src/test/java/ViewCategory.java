import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ViewCategory extends Start{
    @Test
    public void ViewCategoryProducts(){
//        3. Verify that categories are visible on left side bar
        String category = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/h2")).getText();
        System.out.println(category);

//        4. Click on 'Women' category
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();

//        5. Click on any category link under 'Women' category, for example: Dress
        driver.findElement(By.linkText("Dress ")).click();

//        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
       String categoryPage =  driver.getCurrentUrl();
        System.out.println("category page is displayed : "+ categoryPage);
       String displayedText =  driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).getText();
        System.out.println("Displayed text:" + displayedText);

//        7. On left side bar, click on any sub-category link of 'Men' category
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[2]/a")).click();

//        8. Verify that user is navigated to that category page
         categoryPage =  driver.getCurrentUrl();
        System.out.println("Men's category page displayed : "+ categoryPage);

    }
}
