package com.cydeo.tests.day11_actions_jsexecuter_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //Create object of actions and pass our "driver" instances
        Actions actions=new Actions(Driver.getDriver());

        //Locating cydeo link to be able to pass in the actions method

        WebElement cydeoLink =Driver.getDriver().findElement((By.linkText("CYDEO")));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();  //one way of scrolling

        //5- Scroll back up to "Home" link using pageUp button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();  //another way of scrolling

        //Driver.getDriver().quit();  //we create this method in the Driver utility class
        Driver.closeDriver();
    }
        @Test
        public void test2(){
            Driver.getDriver().get("https://practice.cydeo.com/");
            Driver.closeDriver();
        }

        @Test
        public void test3(){
            Driver.getDriver().get("https://practice.cydeo.com/");
            Driver.closeDriver();
        }

        @Test
        public void test4(){
            Driver.getDriver().get("https://practice.cydeo.com/");
            Driver.closeDriver();
        }



}
