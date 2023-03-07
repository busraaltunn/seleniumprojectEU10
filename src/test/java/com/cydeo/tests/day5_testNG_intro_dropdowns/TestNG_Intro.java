package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test
    public void test1(){
        System.out.println("test1 is running...");

        //Assert equals= compare 2 of the same thing
        String actual="apple";
        String expected="apple2";

        Assert.assertEquals(actual,expected,"your message is here when test failure");
    }

    @Test
    public void test2(){
        System.out.println("test2 is running...");

        //assert true
        String actual="apple";
        String expected="apple2";

        Assert.assertTrue(actual.equals(expected));
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("--> BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--> AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> AfterMethod is running");
    }

}
