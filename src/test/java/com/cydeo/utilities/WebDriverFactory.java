package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Task: New method creation
//Method name=getDriver
//Static method
//Accept string arg: browserType
// -This arg will determine what type of browser is opened
// -if "chrome" passed -->it will open chrome browser
//if "firefox" passed -->it will open firefox browser
//Return type: "WebDriver"
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver=null");
            return null;

         }
    }
}

