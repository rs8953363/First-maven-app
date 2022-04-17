package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HowToCheckAlertInSelenium {
    @Test
    public void test() throws InterruptedException{
        Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");

        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(500);
        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(500);
        Driver.getDriver().switchTo().alert().accept();

        //dismiss() --> rejects alert
        //accept() -->accepts alert
        // sendKeys() --> add text into input.

        Thread.sleep(3000);
        WebElement homeLinki = Driver.getDriver().findElement(By.xpath("//a[@title='TutorialsTeacher.com Home']"));
        homeLinki.click();


    }

}
