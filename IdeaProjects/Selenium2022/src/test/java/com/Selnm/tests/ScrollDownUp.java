package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownUp {

    //How to scroll down or up on a web page?
    //1st method: Use Actions Class, pageDown, pageUp methods
    //2nd method: Use JavaScript codes

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

    }
}
