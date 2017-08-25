package crossbowser;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 28/07/2017.
 */
public class verifypagetitle {
WebDriver driver;
    @Test(groups = "smoke",priority = 5)
    @Parameters("browser")
        public void verifyingpagetitle(String browser)
        {
            if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\Sudhakar\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("ie")) {

                System.setProperty("webdriver.ie.driver",
                        "C:\\Users\\Sudhakar\\SeleniumDriver\\IEDriver\\IEDriverServer.exe");


                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();

            }


            driver.get("https://www.tesco.com/");
//            driver.manage().window().maximize();
            System.out.println("this is my page title --12345");

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1024,768));
            System.out.println("ss" + driver.getTitle());
            System.out.println("this is my page title --5");
            driver.close();
    }
    @Test(priority = 2)
    public void test2(){
        System .out.println("this is my test 2");
    }
    @Test(groups = "smoke",priority = 3)

    public void test3(){
        System .out.println("this is my test 3");
    }
    @Test(priority = 4)
    public void test4(){
        System .out.println("this is my test 4");
    }
}
