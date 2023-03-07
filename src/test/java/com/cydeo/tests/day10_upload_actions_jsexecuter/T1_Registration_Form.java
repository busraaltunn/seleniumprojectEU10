package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){      //Driver.getDriver()--->driver
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker=new Faker();

        //3. Enter first name
        WebElement inputFirstname=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstname= faker.name().firstName();
        inputFirstname.sendKeys(fakerFirstname);

        //4. Enter last name
        WebElement inputLastname=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastname.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUsername=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", ""));
        String user= faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);

        //6. Enter email address
        WebElement emailAddress=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAddress.sendKeys(user +"@email.com");

        //7. Enter password
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("#######"));

        //8. Enter phone number
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

        //10. Enter date of birth
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        dateOfBirth.sendKeys("03/08/2000");

        //11. Select Department/Office
        Select departmentDropdown=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }
}
