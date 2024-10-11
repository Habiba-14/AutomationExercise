import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewAndCart extends Start{
    @Test
    public void ViewandCartBrandProducts(){
//        3. Click on 'Products' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

//        4. Verify that Brands are visible on left side bar
//        String brands = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/h2")).getText();
//        System.out.println(brands);

//        5. Click on any brand name
        //driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/ul/li[1]/a")).click();

//        6. Verify that user is navigated to brand page and brand products are displayed
        String url = driver.getCurrentUrl();
        System.out.println(url);

//        7. On left side bar, click on any other brand link
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/div/ul/li[6]/a")).click();

//        8. Verify that user is navigated to that brand page and can see products
        url = driver.getCurrentUrl();
        System.out.println("the other brand url"+url);
    }
}
