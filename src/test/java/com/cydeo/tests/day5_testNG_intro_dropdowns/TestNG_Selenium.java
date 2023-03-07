package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //Do browser driver setup
        //Open browser
        //Maximize the page
        //Implicit wait
        //Get "https://google.com"
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){
        //Do browser driver setup
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //Get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is "Google"
        //Assert.assertEquals(driver.getTitle(),"Google");  OR;

        String actualTitle=driver.getTitle();
        String expectedTitle="Google123";

        Assert.assertEquals(actualTitle, expectedTitle, "Title is NOT matching");
    }
}
