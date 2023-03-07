package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_T7 {

    @Test
    public void day5_t7(){
        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

        //3. Click to non-select dropdown
        WebElement dropdownLink=Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropdownLink.click();
        //Select dropdown= new Select(Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']")));

        //4. Select Facebook from dropdown
        WebElement facebook=Driver.getDriver().findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebook.click();

        //5. Verify title is “Facebook - Log In or Sign Up”

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
