package com.cydeo.tests.extraTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InterviewTask_ToDo {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void todoTest() throws InterruptedException {
        //Navigating to the website
        driver.get("https://todomvc.com/");

        //Locating Javascript button and clicking
        WebElement javaScript = driver.findElement(By.xpath("//div[.='JavaScript']"));
        javaScript.click();

        //Polymer Javascript button and clicking
        WebElement polymer = driver.findElement(By.xpath("//a[.='Polymer']"));
        polymer.click();
        //Locating to-do list and creating 2 todos
        Thread.sleep(2000);
        WebElement todoList = driver.findElement(By.id("new-todo"));
        todoList.sendKeys("List1" + Keys.ENTER);
        todoList.sendKeys("List2" + Keys.ENTER);

        //Locating the second to-do list and storing the length in an int variable
        Actions action = new Actions(driver);
        WebElement secondTodo = driver.findElement(By.xpath("//li[@is='td-item'][2]//label"));
        int secondTodoTextSize = secondTodo.getText().length();

        //Double-clicking on second to-do list
        action.doubleClick(secondTodo).perform();
        WebElement secondTodoEdit = driver.findElement(By.cssSelector("#edit"));
        // 1. WAY


        secondTodoEdit.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.BACK_SPACE);
        //new to-do item instead of second to-do one
        secondTodoEdit.sendKeys("New List2" + Keys.ENTER);
        Thread.sleep(10000);
        // 2. WAY :
        // Removing the text with using backspace
//       for (int i = 0; i < secondTodoTextSize; i++) {
//           action.sendKeys(Keys.BACK_SPACE).perform();
//        }
        driver.close();
    }

}
