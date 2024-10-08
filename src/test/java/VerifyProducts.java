import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyProducts extends Start{
    @Test
    public void VerifyAllProductsPage(){
//        4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
//        5. Verify user is navigated to ALL PRODUCTS page successfully
            String url = driver.getCurrentUrl();
            System.out.println(url);
//        6. The products list is visible

//        7. Click on 'View Product' of first product
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
//        8. User is landed to product detail page
        String urldetails = driver.getCurrentUrl();
        System.out.println(urldetails);
//        9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
      //  driver.findElements(By.className("product-information"));
    }
}
