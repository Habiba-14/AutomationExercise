import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLogin extends Start{
    @Test
    public void InvalidLoginInfo(){
//Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

//Verify 'Login to your account' is visible


//Enter incorrect email address and password
        driver.findElement(By.name("email")).sendKeys("h@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Habiba@2002");

//Click 'login' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

//Verify error 'Your email or password is incorrect!' is visible
       String actualText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText();
        System.out.println(actualText);
    }
}
