package Crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    WebDriver driver;
    @Test
    public void googlesearch(){
        driver= new FirefoxDriver();
        driver.get("https://www.cwjobs.co.uk");
        driver.findElement(By.xpath(".//*[@id='keywords']")).sendKeys("test analyst");
        driver.findElement(By.xpath(".//*[@id='location']")).sendKeys("london");

        driver.findElement(By.xpath(".//*[@id='location']")).sendKeys(Keys.ENTER);
        // this assertTrue syntax
        String actual_value = driver.findElement(By.xpath(".//*[@id='75161167']/div/div/div[1]/a/h2")).getText();

        Assert.assertTrue(actual_value.contains("Test Analyst / Software Testing - MiFID II"));

        System.out.println("after enter---");
        //This is assertEqual syntax
        WebElement element = driver.findElement(By.xpath(".//*[@id='75161167']/div/div/div[1]/a/h2"));
        String expet = element.getText();
        System.out.println(expet);
        Assert.assertEquals("Test Analyst / Software Testing - MiFID II", expet);
    }

    }
