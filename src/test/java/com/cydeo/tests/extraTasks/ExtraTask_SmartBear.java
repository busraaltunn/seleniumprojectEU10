package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ExtraTask_SmartBear {

    @Test
    public void testSmartBear(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");

        //5. Click to Login button
        WebElement loginBtn=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginBtn.click();

        //6. Print out count of all the links on landing page
        List<WebElement> links=Driver.getDriver().findElements(By.tagName("a"));

        //7. Print out each link text on this page
        for (WebElement each : links) {
            System.out.println(each.getText());

        }
    }

    @Test
    public void testsmartBear2(){
        //TC#2: Smartbear software order placing
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");

        //5. Click on Login button
        WebElement loginBtn=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginBtn.click();

        //6. Click on Order
        WebElement orderBtn=Driver.getDriver().findElement(By.xpath("//a[.='Order']"));
        orderBtn.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select product=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
        product.selectByVisibleText("FamilyAlbum");

        WebElement quantity= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantity.sendKeys("2");

        //8. Click to “Calculate” button
        WebElement calculateBtn= Driver.getDriver().findElement(By.xpath("//input[@value='Calculate']"));
        calculateBtn.click();

        //9. Fill address Info with JavaFaker
        Faker faker=new Faker();
        WebElement customerName=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        customerName.sendKeys(faker.name().firstName());

        WebElement street=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        street.sendKeys(faker.address().streetAddress());

        WebElement city=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        city.sendKeys(faker.address().city());

        WebElement state=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        state.sendKeys(faker.address().state());

        WebElement zipCode=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-", ""));

        //• Generate: name, street, city, state, zip code
        //10. Click on “visa” radio button
        WebElement visBtn= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visBtn.click();

        //11. Generate card number using JavaFaker
        WebElement cardNumber=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-", ""));

        WebElement expirationDateBox = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expirationDateBox.sendKeys("12/25");

        //12. Click on “Process”
        WebElement processButton = Driver.getDriver().findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processButton.click();

        //13. Verify success message “New order has been successfully added.”
        WebElement message=Driver.getDriver().findElement(By.xpath("//strong"));
        String actualmessage=message.getText();
        String expecedmessage="New order has been successfully added.";

        Assert.assertEquals(actualmessage,expecedmessage);
    }

    @Test
    public void testSmartBear3(){
        //TC#3: Smartbear software order verification
        //1. Open browser and login to Smartbear software
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");

        WebElement loginBtn=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginBtn.click();

        //2. Click on View all orders
        WebElement viewAllOrders=Driver.getDriver().findElement(By.xpath("//a[.='View all orders']"));
        viewAllOrders.click();

        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement orderDateSusan=Driver.getDriver().findElement(By.xpath("//td[.='01/05/2010']"));
        String actualdate=orderDateSusan.getText();
        String expecteddate="01/05/2010";

        Assert.assertEquals(actualdate,expecteddate);
    }
}
