package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium WebDriver
        //This is the line opening and empty browser
        WebDriver driver = new ChromeDriver();


        //This line will maximize the browser size
        driver.manage().window().maximize();

        //This line will fullscreen the browser size
        //driver.manage().window().fullscreen();

        //3-Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle=driver.getTitle();


        //stop code execution  for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution  for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution  for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution  for 3 seconds
        Thread.sleep(3000);

        //use navigate().to() method
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        System.out.println("currentTitle:" + currentTitle);

        //This will close the currently opened window
        driver.close();

        //This will close all of the opened window
        driver.quit();








    }
}
