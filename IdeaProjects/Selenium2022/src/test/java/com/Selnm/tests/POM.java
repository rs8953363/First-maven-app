package com.Selnm.tests;

import com.Selnm.pages.AmazonPage;
import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POM {
    //POM is a structure to help us to create a webElement pool. IT's useful especially if you need to use a webElement
    // over and over again.

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");

        Thread.sleep(3000);
//        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("iphone" + Keys.ENTER);
        //Instead of writing like above, you can create a class for each page under pages package and keep your WebElements in there
        amazonPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }
}
