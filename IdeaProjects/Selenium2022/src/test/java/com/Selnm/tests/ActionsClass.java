package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");
        Actions actions = new Actions(Driver.getDriver());

        Thread.sleep(5000);
        WebElement helloSignIn = Driver.getDriver().findElement(By.xpath("//span[text()= 'Hello, Sign in']"));
        actions.moveToElement(helloSignIn).perform();
    }
}
