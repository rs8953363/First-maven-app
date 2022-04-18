package com.Selnm.tests;

import org.testng.annotations.Test;

public class PrioritizeTestsInTestNG {

    @Test(priority=10)
    public void method1(){
        System.out.println("Method1 worked");
    }

    @Test(priority=1)
    public void method2(){
        System.out.println("Method2 worked");
    }

    @Test(priority=2)
    //If you don't put priority, it runs according to the alphabetical order(the following method first)
    public void asdfmethod3(){
        System.out.println("Method3 worked");
    }

}
