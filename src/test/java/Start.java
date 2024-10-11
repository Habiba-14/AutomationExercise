import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Start {
    WebDriver driver;
    @BeforeTest
    public void OpenBrowser(){

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }
    @AfterTest
    public void CloseBrowser(){
        driver.quit();
    }
}
