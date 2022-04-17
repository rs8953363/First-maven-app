package com.Selnm.tests;

import com.Selnm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectOptionsInDropdown {
    @Test
    public void test1() {
        Driver.getDriver().get("https://amazon.com");
        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();//Helps you to get all options
        System.out.println(options);

//        for (WebElement w : options) {
//            System.out.println(w.getText());
//        }
        boolean result = isOrdered(options);
        System.out.println(result);
    }

    //compareTo() method compares to String: if equals-->0, previous --> -1, later --> 1
    public boolean isOrdered(List<WebElement> options) {
        boolean isOrdered = false;

        for (int i = 1; i < options.size(); i++) {

            WebElement previousValue = options.get(i - 1);
            WebElement currentValue = options.get(i);

            if (previousValue.getText().compareTo(currentValue.getText()) < 0) {
                isOrdered = true;
            } else {
                isOrdered = false;
            }
        }
        return isOrdered;
    }
}