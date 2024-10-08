import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterUser extends Start {
    @Test
    public void SignUp() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.name("name")).sendKeys("Habiba");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("habebaa111111@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();

        //enter account info page

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("Habiba@2002");

        //selecting from a drop box
        String[] ids = {"days", "months", "years"};
        String[] values = {"14", "12", "2002"};
        for (int i = 0; i < ids.length; i++) {
            WebElement dropdown = driver.findElement(By.id(ids[i]));
            Select select = new Select(dropdown);
            select.selectByValue(values[i]);
        }
        //checkbox
        driver.findElement(By.id("newsletter")).click();

        //fill address info
        driver.findElement(By.id("first_name")).sendKeys("habiba");
        driver.findElement(By.id("last_name")).sendKeys("ali");
        driver.findElement(By.id("address1")).sendKeys("cairo");

        //select country from dropbox
        WebElement dropdown = driver.findElement(By.id("country"));
        Select select = new Select(dropdown);
        select.selectByValue("Australia");

        //fill in the address detailsS
        driver.findElement(By.id("state")).sendKeys("cairo");
        driver.findElement(By.id("city")).sendKeys("cairo");
        driver.findElement(By.id("zipcode")).sendKeys("11111");
        driver.findElement(By.id("mobile_number")).sendKeys("111110000");

        //click on create account
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();

        //verify text
       String actualText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        System.out.println(actualText);
        //click on continue
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

    }

    @Test
    public void DeleteAcc(){
        SignUp();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
        String actualText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        System.out.println(actualText);
        //click on continue
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }
}
