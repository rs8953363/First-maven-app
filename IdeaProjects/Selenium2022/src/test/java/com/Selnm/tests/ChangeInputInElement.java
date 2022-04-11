package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChangeInputInElement {
    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");

//        WebElement searchBox = Driver.getDriver().findElement(By.id("twotassearchtextbox"));
//        searchBox.sendKeys("iphone");
//
//        Thread.sleep(3000);
//        searchBox.clear();

        //Change the text in input or dethe text
        WebElement warning = Driver.getDriver().findElement(By.cssSelector(".a-section.a-spacing-none.a-padding-base.a-text-center.text-link-stripe.card-lite.text-link-stripe"));
        //warning.clear(); As warning element is not input, you cannot change it with clear(). Instead, you should use JavaScript codes.

        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver. getDriver();
        js.executeScript("arguments[0].innerText = 'Merhabalar' ", warning);//innerText is used to add a text to a WebElement in JavaScript
        //js.executeScript("arguments[0].innerText = '' ", warning);//This clears the message
    }
}
