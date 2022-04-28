package basefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
  public static  WebDriver driver;
    public void openbrowser(String baseurl){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //set obj
        driver=new ChromeDriver();
        driver.get(baseurl);
        //manage window
        driver.manage().window().maximize();
        //get implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public  void closebrowser(){
        driver.quit();
    }

}
