package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day10_T4 {

    @Test
    public void day10_t4(){
        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink =Driver.getDriver().findElement((By.linkText("CYDEO")));
        //JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView(true);", cydeoLink);

        //4- Scroll using Actions class “moveTo(element)” method
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();

        //5-Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

    }
}
