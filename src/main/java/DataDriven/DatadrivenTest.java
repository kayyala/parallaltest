package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 28/07/2017.
 */
public class DatadrivenTest {
    WebDriver driver;

    @BeforeMethod
    public void startup()
    {
        driver= new FirefoxDriver();
    }

    @Test(dataProvider = "moltondata")
    public void moltonLogin(String username,String password) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.dominos.co.uk/");
        driver.findElement(By.xpath(".//*[@id='account-overlay']/ul/li[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='loginPanel']/section[1]/form/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath(".//*[@id='loginPanel']/section[1]/form/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='loginPanel']/section[1]/form/button[1]")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getTitle().contains("Welcome"));
        System.out.println(""+driver.getTitle());
    }
@DataProvider(name = "moltondata")
    public Object[][] passData()
    {
        Object[][] data = new Object[2][2];
        data[0][0] ="sudhak@gmail.com";
        data[0][1] = "kayyala";

        data[1][0] = "sudhakar@gmail.com";
        data[1][1] = "London1987";

//        data[2][0] = "RAJJ@gmail.com";
//        data[2][1] = "kayyala";

        return data;


    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
    }
}