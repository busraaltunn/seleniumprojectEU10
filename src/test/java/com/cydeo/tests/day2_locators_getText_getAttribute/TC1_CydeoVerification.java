package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_CydeoVerification {
    public static void main(String[] args) {

        //1.OPEN CHROME BROWSER
        //2.GO TO https://practice.cydeo.com
        //3.VERİFY URL CONTAİNS
        //expected:cydeo
        //4.VERİFY TİTLE:
        //expected:Practice

        //1-open the Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2-go to website
        driver.navigate().to("https://practice.cydeo.com");

        //3-Verify url contains
        String expectedURL="cydeo";
        String acctualURL= driver.getCurrentUrl();

        if(acctualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAİLED!");
        }

        //4-Verify title
        String expectedTitle= "Practice";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAİLED!");
        }
        driver.close();
    }
}
