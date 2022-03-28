package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitImplicit {

    @Test
    public void test1(){

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        //Explicit wait: Wait time when you search for a specific element. You can write a condition for it
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'logo']")));

    }
}
