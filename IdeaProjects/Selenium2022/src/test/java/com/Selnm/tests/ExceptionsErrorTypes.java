package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.testng.annotations.Test;

public class ExceptionsErrorTypes {
    @Test
    public void test(){
        Driver.getDriver().get("https://amazon.com");
        //1. WebDriverException: error with driver
        //2. NoSuchElementException: locator error
        //3. TimeoutException: Error with time. If time is not enough
        //4. NoAlertPresentException: Errors related to the alerts
        //5. NoSuchWindowException: Error wit the window you're tring to switch Driver.getDriver().switchTo().window("asdf")
        //6. NoSuchFrameException: Error with the frame you're trying to switch
        //7. ElementNotSelectableException: Error if you cannot select an element


    }
}
