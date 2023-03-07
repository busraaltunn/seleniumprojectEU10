package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_T3 {

    @Test
    public void day6_t3(){

        //TC #3: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Prompt” button
        WebElement jsPromptBtn= Driver.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptBtn.click();

        //4. Send “hello” text to alert
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered:  hello” text is displayed.
        WebElement result=Driver.getDriver().findElement(By.xpath("//p[@id='result']"));

        String actualResult= result.getText();
        String expectedResult="You entered: hello";

        Assert.assertEquals(actualResult, expectedResult);

    }
}
