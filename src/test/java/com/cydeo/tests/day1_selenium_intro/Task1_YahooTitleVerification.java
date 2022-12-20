package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //tc:Yahoo title verification

        WebDriverManager.chromedriver().setup();
        //1-open the Chrome browser
        WebDriver driver=new ChromeDriver();

        //2-go to yahoo website
        driver.get("https://www.yahoo.com");

        //verify title: Expected:Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle= driver.getTitle();  //cURRENT TİTLE ON THE SİTE

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT expected. Verification FAILED! ");
        }


    }
}
