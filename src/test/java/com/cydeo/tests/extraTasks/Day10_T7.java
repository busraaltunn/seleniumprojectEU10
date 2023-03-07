package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day10_T7 {

    @Test
    public void task7_scroll_test(){

        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “Cydeo” link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        //4- Scroll up to “Home” link
        BrowserUtils.sleep(2);
        //js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
}
}
