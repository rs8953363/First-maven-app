package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestColorOfAnElement {

    @Test
    public void test(){
        Driver.getDriver().get("https://w3schools.com");
        WebElement learnHtml = Driver.getDriver().findElement(By.linkText("Learn HTML"));
        // #04AA6D

        String backgroundColor = learnHtml.getCssValue("background-color");
        System.out.println(backgroundColor);//Prints rgba value to the console.
        boolean isEqual = backgroundColor.equals("rgb(4, 170, 109, 1");
        Assert.assertTrue(isEqual);
    }
}
