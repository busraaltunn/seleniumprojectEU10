package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_T2 {

    @Test
    public void day6_t2(){
        //TC #2: Confirmation alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Confirm” button
        WebElement jsConfirmBtn= Driver.getDriver().findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsConfirmBtn.click();


        //4. Click to OK button from the alert
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement result=Driver.getDriver().findElement(By.xpath("//p[@id='result']"));

        String actualResult= result.getText();
        String expectedResult="You successfully clicked an alert";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
