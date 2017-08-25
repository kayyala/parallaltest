package crossbowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.naming.Name;

/**
 * Created by Sudhakar on 01/05/2016.
 */
public class tesco {

    WebDriver driver;
    @Test
    @Parameters("browser")
    public  void open(String browsername) throws InterruptedException {

        if (browsername.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
    }
        else if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browsername.equalsIgnoreCase("IE")) {
            //System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

            driver.get("http://www.google.com/");
         // driver.findElement(By.xpath("//*[@id='sb_ifc0']")).sendKeys("sudhaar");
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();
        driver.quit();
        System.out.println("it's closing");

        }


    }
