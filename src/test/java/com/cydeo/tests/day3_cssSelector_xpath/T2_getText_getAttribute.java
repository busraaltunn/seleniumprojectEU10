package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel=driver.findElement(By.className("login-item-checkbox-label"));

        String expectedLabel= "Remember me on this computer";
        String actualLabel= rememberMeLabel.getText();

        if(actualLabel.equals(expectedLabel)){
            System.out.println("Remember Label verification is PASSED!");
        }else{
            System.out.println("Remember Label verification is FAILED!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassword= driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPassword= "Forgot your password?";
        String actualForgotPassword= forgotPassword.getText();

        if(actualForgotPassword.equals(expectedForgotPassword)){
            System.out.println("Forgot Password verification is PASSED!");
        }else{
            System.out.println("actualForgotPasswordLinkText= "+ actualForgotPassword);
            System.out.println("expectedForgotPasswordLinkText= " +expectedForgotPassword);

            System.out.println("Forgot Password verification is FAILED!");
        }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref= "forgot_password=yes";
        String actualInHref= forgotPassword.getAttribute("href");

        System.out.println("actualHrefAttribute= "+actualInHref);

        if(actualInHref.equals(expectedInHref)){
            System.out.println("Href attribute verification PASSED!");
        }else{
            System.out.println("Href attribute verification FAILED");
        }

    }
}
