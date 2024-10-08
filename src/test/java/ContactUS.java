import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactUS extends Start {
    @Test
    public void ValidateContactUS(){
//        Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();

//        Verify 'GET IN TOUCH' is visible
       String text = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")).getText();
        System.out.println(text);

        //        Enter name, email, subject and message
        driver.findElement(By.name("name")).sendKeys("Habiba");
        driver.findElement(By.name("email")).sendKeys("habeba@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("HELP");
        driver.findElement(By.name("message")).sendKeys("textextextext");

        //        Upload file
        //driver.findElement(By.name("upload_file")).click();

//        Click 'Submit' button
        driver.findElement(By.name("submit")).click();

//        Click OK button
        driver.switchTo().alert().accept();

//        Verify success message 'Success! Your details have been submitted successfully.' is visible
        String sucessText = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")).getText();
        System.out.println(sucessText);
//        Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
    }
}
