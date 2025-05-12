package com.thetestingacedemy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab18_Priority {

    @Test(priority=1)
    public void p1(){
        System.out.println("one");
    }
    @Test(priority=3)
    public void p2(){
        System.out.println("two");

    }
    @Test(priority=2)
    public void p3(){
        System.out.println("three");

    }
}
