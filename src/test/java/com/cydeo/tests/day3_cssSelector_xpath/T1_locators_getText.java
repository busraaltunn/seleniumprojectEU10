package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();  //for maximize

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect username");
        WebElement userName =driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errortext = driver.findElement(By.className("errortext"));
        String expectedErrorText="Incorrect login or password";
        String actualErrorText=errortext.getText();

        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("error message verification PASSED!");
        }else{
            System.out.println("error message verification FAILED!");
        }
    }
}
