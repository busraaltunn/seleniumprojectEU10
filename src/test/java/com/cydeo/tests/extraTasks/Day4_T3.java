package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_T3 {

    @Test
    public void test1(){
        //1. Open Chrome browser
        //2. Go to http://practice.cydeo.com/multiple_buttons
        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1=Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        button1.click();

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”

        WebElement text=Driver.getDriver().findElement(By.xpath("//p[.='Clicked on button one!']"));

        String actualText= text.getText();
        String expectedText="Clicked on button one!";

        Assert.assertEquals(actualText, expectedText);
    }
}
