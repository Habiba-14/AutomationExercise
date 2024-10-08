import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends Start{

    @Test
    public void Login(){
        //Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //Verify 'Login to your account' is visible


        //Enter correct email address and password
        driver.findElement(By.name("email")).sendKeys("habebaa111111@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Habiba@2002");

        //Click 'login' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

        //Verify that 'Logged in as username' is visible
//       String actualText= driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/text()")).getText();
//        System.out.println(actualText);

        //Click 'Delete Account' button
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();


        //Verify that 'ACCOUNT DELETED!' is visible
        String actual2Text= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        System.out.println(actual2Text);
        //click on continue
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();


    }
}
