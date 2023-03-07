package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2_Homework4 {

    @Test
    public void day2_hm4(){
        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        Driver.getDriver().get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Practice";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
