package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2_Homework_Facebook {

    @Test
    public void test1_facebook(){
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void test2_facebook(){
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement userName= Driver.getDriver().findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
        userName.sendKeys("incorrect");

        //4. Enter incorrect password
        WebElement password= Driver.getDriver().findElement(By.xpath("//div[@class='_6luy _55r1 _1kbt']"));
        password.sendKeys("incorrect");

        WebElement login= Driver.getDriver().findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
        login.click();

        //5. Verify title changed to:
        //Expected: “Facebook'a Giriş Yap”
        String actualtitle= Driver.getDriver().getTitle();
        String expectedtitle= "Facebook'a Giriş Yap";

        Assert.assertEquals(actualtitle, expectedtitle);
    }
}
