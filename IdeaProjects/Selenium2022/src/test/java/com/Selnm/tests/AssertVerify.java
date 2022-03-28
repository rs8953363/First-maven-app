package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertVerify {
    /* Assert --> is used to check if test is passed or failed. If it fails, it gives fail report, but it doesn't run
    the rest of the codes
    Verify --> helps you to verify if test is successful or not. If it fails, the rest of the steps are executed and it
    gives the failed report.
    The diff btw Assert and SoftAssert
     */

    @Test
    public void test1(){
        Driver.getDriver().get("https://amazon.com");
        String title =  Driver.getDriver().getTitle();

        //HardAssert: If test fails, the execution stops, and it does not execute the remaining tests, it informs the tester that test is failed.
        Assert.assertEquals(title, "Amazon");

        //SoftAssert: Even if test fails, it continues to execute the other rest of the codes and it informs the tester that test is failed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Amazon");


    }
}
