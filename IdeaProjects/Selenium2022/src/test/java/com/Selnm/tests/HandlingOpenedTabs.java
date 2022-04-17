package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingOpenedTabs {

    @Test
    public void test1() throws InterruptedException {
        /*What would you do if you click on a link and it opened on a new window?
    I would use WindowsHandle as there is a code for each window. By using that code, I move between windows with the help
    of switchTo method.
    Driver.getDriver().switchTo().window(PagesHandleValue);
         */
        Driver.getDriver().get("https://www.w3schools.com/colors/colors_picker.asp");
        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[@title = 'Facebook'"));
        facebookLink.click();

        //System.out.println(Driver.getDriver().getWindowHandles());

        Driver.getDriver().getWindowHandle();
        Thread.sleep(3000);

        Set<String> handles = Driver.getDriver().getWindowHandles();
        Object[] array = handles.toArray();
        //System.out.println(array[array.length-1].toString());

        String lastPagesHandleValue = array[array.length-1].toString();
        System.out.println();

       Driver.getDriver().switchTo().window(lastPagesHandleValue);

    }




}
