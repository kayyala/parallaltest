import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 25/07/2017.
 */
public class BBCnews {
    WebDriver driver;

    @Test
    public void bbcnews() {
        driver = new FirefoxDriver();
        driver.get("http://www.bbc.co.uk/");
        WebElement actual = driver.findElement(By.xpath(".//*[@id='orb-modules']/div[2]/section[1]/div/h2"));
        String expet = actual.getText();
        System.out.println(expet);
        Assert.assertEquals("Welcome to the BBC", expet);
    }

    @Test
    public void lombardrisk() {
        driver = new FirefoxDriver();
        driver.get("https://www.lombardrisk.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("lombard risk birmingham");
//        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
        WebElement actual = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div[11]/div/div/div/div[1]/div/h2"));
        String expected = actual.getText();
        System.out.println(expected);
        Assert.assertEquals("Keep up to date with Lombard Risk.",expected);
       // Assert.assertEquals(actual,expected);
    }
}

