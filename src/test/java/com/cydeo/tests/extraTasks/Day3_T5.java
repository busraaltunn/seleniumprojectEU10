package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3_T5 {

    @Test
    public void test_day3_t5(){

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement loginBtn=Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBtn.sendKeys("xxx");

        //4- Click to `Reset password` button
        WebElement resetBtn= Driver.getDriver().findElement(By.xpath("//button[@value='Reset password']"));
        resetBtn.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        WebElement label= Driver.getDriver().findElement(By.xpath("//div[@class='errortext']"));

        String actualLabel= label.getText();
        String expectedLabel= "Login or E-mail not found";

        Assert.assertEquals(actualLabel, expectedLabel);
    }
}
