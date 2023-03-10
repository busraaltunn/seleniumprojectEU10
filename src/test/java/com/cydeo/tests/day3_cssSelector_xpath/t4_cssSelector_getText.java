package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class t4_cssSelector_getText {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[class='login-btn']"));  //by using class attribute
        //WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[value='Reset password']")  //by using value attribute

        String expected="Reset password";
        String actual=resetPasswordButton.getText();

        if(actual.equals(expected)){
            System.out.println("Reset button verification PASSED!");
        }else{
            System.out.println("Reset button verification FAILED!");
        }
    }
}
