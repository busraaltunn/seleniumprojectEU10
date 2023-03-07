package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link, locate homeLink using cssSelector
        WebElement homeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));

        //with syntax2
        WebElement homeLink2=driver.findElement(By.cssSelector("a.nav-link"));

        //with href value
        WebElement homeLink3=driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //locate parent element and move down to h2
        WebElement header_ex1= driver.findElement(By.cssSelector("div.example > h2"));

        //with xpath
        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header_ex2= driver.findElement(By.xpath("/h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox_ex1= driver.findElement(By.xpath("//input[@type='text']"));

        WebElement inputBox_ex2= driver.findElement(By.xpath("//input[@name='email']"));

        WebElement inputBox_ex3= driver.findElement(By.xpath("//input[contains(@name, 'email')]"));

        //e. “Retrieve password” button
        WebElement retriecePasswordBtn= driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement cydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retriecePasswordBtn.isDisplayed() = " + retriecePasswordBtn.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());


    }
}
