package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.testng.annotations.Test;

public class DriverMethods {
    @Test
    public void test1(){
        //Driver.getDriver().get(); helps you to go to that page
        //Driver.getDriver().navigate(); you can use some sub methods under navigate method to do certain actions
        //.to()
        //.refresh()
        //.back()
        //.forward()
        //Driver.getDriver().finElement(); helps you to find only one element
        //Driver.getDriver().finElements(); helps you to find all elements
        //Driver.getDriver().getTitle(); helps you to get the title of the current page
        //Driver.getDriver().close(); closes the current tab
        //Driver.getDriver().quit(); closes all the tabs
        //Driver.getDriver().manage(); helps you to manage driver
        //Driver.getDriver().switchTo(); helps you to switch between tabs
        //Driver.getDriver().getWindowHandles(); helps you the get the id numbers of each tab. You need it when you switch tabs
        //Driver.getDriver().getWindowHandle(); helps you the get the id number of the current tab.
        //Driver.getDriver().getCurrentUrl(); helps you the get the address(url) of the current tab.
        //Driver.getDriver().getPageSource(); helps you the get the source code(HTML code) of the current tab.

        Driver.getDriver().get("https://amazon.com");
        String codes = Driver.getDriver().getPageSource();

        System.out.println(codes);
    }
}
