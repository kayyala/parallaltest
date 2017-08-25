package Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

/**
 * Created by Sudhakar on 11/07/2017.
 */
public class VerifyingPage {

    WebDriver driver;

@Test
@Parameters("browser")
    public void verifyingpagetitle(String browser){
    if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    } else if (browser.equalsIgnoreCase("ie")) {
        System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
        driver = (new InternetExplorerDriver());

    } else {
        driver = (new FirefoxDriver());

    }
    driver.get("https://www.youtube.com/watch?v=6nq1dOiTdC8#t=694.196598");
    System.out.println("ss"+driver.getTitle());
    driver.close();
}

    }
