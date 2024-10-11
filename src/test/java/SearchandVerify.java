import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchandVerify extends Start{
    @Test
    public void SearchProductsAndVerifyCartAfterLogin(){
        SearchProduct search = new SearchProduct();
        ValidLogin login = new ValidLogin();

//        3. Click on 'Products' button
//        4. Verify user is navigated to ALL PRODUCTS page successfully
//        5. Enter product name in search input and click search button
//        6. Verify 'SEARCHED PRODUCTS' is visible
//        7. Verify all the products related to search are visible
        search.SearchforProduct(driver);

//        8. Add those products to cart

        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();

//        9. Click 'Cart' button and verify that products are visible in cart
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();

//        10. Click 'Signup / Login' button and submit login details
        login.Login(driver);

//        11. Again, go to Cart page
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();



    }
}
