package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        //1. Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement jsAlertBtn=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertBtn.click();
        Thread.sleep(1000);


        //to be able to click to alert OK button we need to switch driver'sfocus to alert itself
        Alert alert=driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement message= driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails: "Message is NOT displayed"
        Assert.assertTrue(message.isDisplayed(), "Message is NOT displayed");

        //OR;
        String expectedMessage="You successfully clicked an alert";
        String actualMessage= message.getText();

        Assert.assertEquals(actualMessage,expectedMessage,"Actual message is NOT as expected! ");
    }
}



