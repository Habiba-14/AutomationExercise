import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout extends Start {
    @Test
    public void ValidateLogout() {
        //Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //Verify 'Login to your account' is visible


        //Enter correct email address and password
        driver.findElement(By.name("email")).sendKeys("habebaa111111@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Habiba@2002");

        //Click 'login' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

        //Click 'Logout' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }
}
