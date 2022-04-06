package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownUp {

    //How to scroll down or up on a web page?
    //1st method: Use Actions Class, pageDown, pageUp methods
    //2nd method: Use JavaScript codes to go somewhere on the webpage

    @Test
        public void test1() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");

        Actions actions = new Actions(Driver.getDriver());

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN);
        //actions.sendKeys(Keys.ARROW_DOWN); You can use this method, as well. But arrow_down does not move the page as much as Page_Down

        //2nd way
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) Driver.getDriver());

        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");//If you write 300 instead of
        // document.body.scrollHeight, it moves 300 pixels

        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0, document.body, scrollHeight)");//You can type (300,600) to make
        // it move from 300 pixels to 600 pixels

        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");//You can type (600,900) to make
        // it move from 600 pixels to 900 pixels
    }
}
