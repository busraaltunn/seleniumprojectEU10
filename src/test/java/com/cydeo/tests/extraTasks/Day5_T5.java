package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_T5 {

    @Test
    public void day5_t5(){

        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        //3. Select Illinois
        Select state= new Select(Driver.getDriver().findElement(By.xpath("//select[@id='state']")));
        state.selectByVisibleText("Illinois");

        //4. Select Virginia
        state.selectByValue("VA");

        //5. Select California
        state.selectByValue("CA");

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        String expectedSelectedOption="California";
        String actualSelectedOption=state.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedSelectedOption, actualSelectedOption);

    }
}
