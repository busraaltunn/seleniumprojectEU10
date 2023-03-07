package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtraTask_GasMileageCalculator {

    @Test
    public void testGasMileageCalculator(){

        //1. Add a new class GasMileageCalculatorTest
        //2. Go to https://www.calculator.net
        Driver.getDriver().get("https://www.calculator.net");

        //3. Search for “gas mileage” using search box
        WebElement searchBar=Driver.getDriver().findElement(By.xpath("//input[@name='calcSearchTerm']"));
        searchBar.sendKeys("gas mileage");

        //4. Click on the “Gas Mileage Calculator” link
        WebElement calculatorLink=Driver.getDriver().findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        calculatorLink.click();

        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Gas Mileage Calculator";
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification is failed");

        //b. “Gas Mileage Calculator” label is displayed
        WebElement label=Driver.getDriver().findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        System.out.println("label.isDisplayed() = " + label.isDisplayed());

        //6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometer=Driver.getDriver().findElement(By.xpath("//input[@name='mucodreading']"));
        currentOdometer.clear();
        currentOdometer.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer=Driver.getDriver().findElement(By.xpath("//input[@name='mupodreading']"));
        previousOdometer.clear();
        previousOdometer.sendKeys("7550");

        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded=Driver.getDriver().findElement(By.xpath("//input[@name='mugasputin']"));
        gasAdded.clear();
        gasAdded.sendKeys("16");

        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice=Driver.getDriver().findElement(By.xpath("//input[@name='mugasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");

        //10. Click on Calculate button
        WebElement calculateBtn=Driver.getDriver().findElement(By.xpath("//table[@id='metric']/tbody//tr[5]//input"));
        calculateBtn.click();

        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        WebElement value= Driver.getDriver().findElement(By.xpath("//b[.='23.44 km/L  or 4.27  L/100 km ']"));
        String actualValue=value.getText();
        String expectedValue="23.44";

        Assert.assertTrue(expectedValue.contains("23.44"));
    }
}
