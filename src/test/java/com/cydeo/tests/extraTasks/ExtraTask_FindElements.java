package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ExtraTask_FindElements {

    @Test
    public void findElementsTest1(){
        //TC #1: Checking the number of links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");

        //3. Count the number of the links on the page and verify
        //Expected: 332
        List<WebElement> links=Driver.getDriver().findElements(By.tagName("a"));

        System.out.println(links.size());

       /* int count=0;
        for(WebElement each : links) {
            count++;
            System.out.println(count);
        }

        */
    }

    @Test
    public void findElementsTest2(){
        //TC #2: Printing out the texts of the links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");

        //3. Print out all of the texts of the links on the page
        List<WebElement> links=Driver.getDriver().findElements(By.tagName("a"));

        int order=0;
        for (WebElement each:links){
            order++;
            System.out.println(order +" link: "+each.getText());
        }

    }

    @Test
    public void findElementsTest3(){
        //TC #3: Counting the number of links that does not have text
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");

        //3. Count the number of links that does not have text and verify
        //Expected: 109
        List<WebElement> links=Driver.getDriver().findElements(By.tagName("a"));

        int emptyCount=0;
        for(WebElement each:links){
            if(each.getText().isEmpty()){
                emptyCount++;
            }
        }
        System.out.println(emptyCount);
    }
}
