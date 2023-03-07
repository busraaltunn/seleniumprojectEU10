package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InterviewTask_ToDoMvc {

    @Test
    public void todomvcTest(){

        Driver.getDriver().get("https://todomvc.com/");

        WebElement javaScritBtn=Driver.getDriver().findElement(By.xpath("//div[.='JavaScript']"));
        javaScritBtn.click();

        WebElement polymerLink=Driver.getDriver().findElement(By.xpath("//a[@href='examples/polymer/index.html']"));
        polymerLink.click();

        WebElement todo1=Driver.getDriver().findElement(By.xpath("//input[@class='new-todo style-scope td-todos']"));
        todo1.sendKeys("working"+ Keys.ENTER);
            todo1.sendKeys("jogging"+Keys.ENTER);


        WebElement editing=Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));

        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(editing).perform();
        editing.sendKeys("newJob"+Keys.ENTER);


    }
}
