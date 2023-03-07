package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_T6 {

    @Test
    public void day5_t6(){
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1st, 1923” and verify it is selected.
        Select year=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='year']")));
        Select month=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));
        Select day=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='day']")));

        //Select year using  : visible text
        year.selectByVisibleText("2023");

        //Select month using   : value attribute
        month.selectByValue("0");

        //Select day using : index number
        day.selectByValue("3");

        //Verification

        String expectedYear= "2023";
        String expectedMonth="January";
        String expectedDay="3";

        String actualYear=year.getFirstSelectedOption().getText();
        String actualMonth=month.getFirstSelectedOption().getText();
        String actualDay=day.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear, actualYear);
        Assert.assertEquals(expectedMonth, actualMonth);
        Assert.assertEquals(expectedDay,actualDay);

    }
}
