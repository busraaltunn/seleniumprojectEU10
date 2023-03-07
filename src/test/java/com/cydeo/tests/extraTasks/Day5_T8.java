package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day5_T8 {

    @Test
    public void day5_t8(){

        //TC #8: Selecting value from multiple select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

        //3. Select all the options from multiple select dropdown.
        Select languagesAll= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='Languages']")));
        languagesAll.getAllSelectedOptions();

        //4. Print out all selected values.
        //??

        //5. Deselect all values.
        languagesAll.deselectAll();
    }
}
