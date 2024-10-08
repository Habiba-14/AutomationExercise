import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidRegister extends Start{
    @Test
    public void RegisterExistingUser(){
        //click on signup/register
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //Verify 'New User Signup!' is visible
        String actualText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
        System.out.println(actualText);

        //Enter name and already registered email address
        driver.findElement(By.name("name")).sendKeys("Habiba");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("habebaa111111@gmail.com");

        //Click 'Signup' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();

        //Verify error 'Email Address already exist!' is visible
        String errormssg = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).getText();
        System.out.println(errormssg);

    }
}
