package Crossbrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by Sudhakar on 11/07/2017.
 */
public class TestNgTest {
     WebDriver driver;
@Test
@Parameters("browser")
    public void openBrowser() throws IOException {
        Properties prop = new Properties();
        FileInputStream fileInputStreamfs = new FileInputStream("C:\\Users\\Sudhakar\\IdeaProjects\\Tesco\\src\\test\\resources\\Config.properties");
        prop.load(fileInputStreamfs);
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        System.out.print("browser: " + browser);
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


    {
//        driver.quit();
    }

    }

