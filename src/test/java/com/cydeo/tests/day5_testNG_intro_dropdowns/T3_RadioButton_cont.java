package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name= 'sports' radio buttons and store themö in a list of Web Element
        List<WebElement> sportRadioButton=driver.findElements(By.name("sport"));

        //Loop through List of WebElement and select matching result "hockey"

            clickAndVerifyRadioButton(driver, "sport", "hockey");

            clickAndVerifyRadioButton(driver, "sport", "football");

            clickAndVerifyRadioButton(driver, "color", "yellow");
            }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButton) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {
                each.click();

                System.out.println(eachId +" is selected : " + each.isSelected());
                break;
            }
        }
    }
}


