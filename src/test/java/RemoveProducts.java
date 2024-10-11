import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RemoveProducts extends Start{
    String iteminCartName;
    @Test
    public void RemoveProductsFromCart(){
//        4. Add products to cart
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")).click();

//        5. Click 'Cart' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
         iteminCartName= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a")).getText();
        System.out.println("name of the item before it is removed"+iteminCartName);
//        6. Verify that cart page is displayed
        String cart = driver.getCurrentUrl();
        System.out.println(cart);

//        7. Click 'X' button corresponding to particular product
        driver.findElement(By.className("cart_quantity_delete")).click();

//        8. Verify that product is removed from the cart
            isTextNotFound(iteminCartName);


    }
    public boolean isTextNotFound(String iteminCart) {
        String pageSource = driver.getPageSource();
        boolean isTextPresent = pageSource.contains(iteminCart);
        return !isTextPresent;

    }
}
