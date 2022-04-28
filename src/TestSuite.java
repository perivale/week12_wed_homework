import basefactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class TestSuite extends BaseTest {
    public String baseurl = "https://www.amazon.co.uk/";

    @Test
    public void dellComputer() {
        //  1. Open the URL https://www.amazon.co.uk/
        openbrowser(baseurl);
        driver.findElement(By.id("sp-cc-accept")).click();

        //  2. Type "Dell Laptop" in the search box and press enter or click on search on enter
        //Button.
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dell Laptop");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        //  3. Click on the checkbox brand dell on the left side.
        driver.findElement(By.xpath("//li[@id='p_89/Dell']/descendant::i")).click();
        //  4. Verify that the  30(May be different) products are displayed on the page.
        List<WebElement> productsize = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
        int actualsize = productsize.size();
        int expectedsize = 30;
        Assert.assertEquals(expectedsize, actualsize);
        //   5. Print all product names in the console.
        for (WebElement web : productsize) {
            System.out.println(web.getText());

        }
        closebrowser();


    }

}