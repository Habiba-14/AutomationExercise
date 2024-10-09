import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddProducts extends Start{
    @Test
    public void AddProductsinCart(){

        // 3. Click 'Products' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


        // 4. Hover over first product and click 'Add to cart'
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='product col-sm-4'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).build().perform();
       firstProduct.findElement(By.cssSelector(".btn-success")).click();


        // 5. Click 'Continue Shopping' button
        driver.findElement(By.linkText("Continue Shopping")).click();


        // 6. Hover over second product and click 'Add to cart'
        WebElement secondProduct = driver.findElement(By.xpath("(//div[@class='product col-sm-4'])[2]"));
        actions.moveToElement(secondProduct).build().perform();
        secondProduct.findElement(By.cssSelector(".btn-success")).click();


        // 7. Click 'View Cart' button
        driver.findElement(By.linkText("View Cart")).click();


        // 8. Verify both products are added to Cart
        WebElement cartItems = driver.findElement(By.id("cartProducts"));
        List<WebElement> productElements = cartItems.findElements(By.tagName("li"));
        int expectedProducts = 2;
        Assert.assertEquals(productElements.size(), expectedProducts, "Number of products in cart does not match");


    }
}
