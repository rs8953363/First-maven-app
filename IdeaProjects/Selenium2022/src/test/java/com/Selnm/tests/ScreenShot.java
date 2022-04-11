package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    @Test
    public void test1(){
        Driver.getDriver().get("https://amazon.com");
        takeYourScreenshot("amazon_tc101");
    }
    public void takeYourScreenshot(String name){
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File goruntu = new File(System.getProperty("user.dir") + "/" + name + ".png");
        try {
            FileUtils.copyFile(source, goruntu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
