package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetAttribute {
    @Test
    public void test(){
        Driver.getDriver().get("https://amazon.com");

        WebElement link = Driver.getDriver().findElement(By.partialLinkText("Gift cards"));
        String href = link.getAttribute("href");
        String slotId = link.getAttribute("data-csa-c-slot-id");

        System.out.println(href);
        System.out.println(slotId);

        String color = link.getCssValue("color");
        String fontSize = link.getCssValue("font-size");

        System.out.println("color");
        System.out.println(fontSize);
    }
}
