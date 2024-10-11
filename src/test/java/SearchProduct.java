import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchProduct extends Start{
    @Test
    public void SearchforProduct(WebDriver driver){
//        4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
//
//        5. Verify user is navigated to ALL PRODUCTS page successfully
            String url = driver.getCurrentUrl();
            System.out.println(url);
//
//        6. Enter product name in search input and click search button
        driver.findElement(By.id("search_product")).sendKeys("blue top");
        driver.findElement(By.id("submit_search")).click();
//
//        7. Verify 'SEARCHED PRODUCTS' is visible
//        String searchedproductActualResult= driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p")).getText();
//        System.out.println(searchedproductActualResult);


    }
}
