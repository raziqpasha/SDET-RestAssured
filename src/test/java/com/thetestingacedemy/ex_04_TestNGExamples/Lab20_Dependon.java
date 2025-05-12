package com.thetestingacedemy.ex_04_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab20_Dependon {

    @Test
    public void p1(){
        System.out.println("one");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "p1")
    public void p2(){
        System.out.println("two");

    }
    @Test
    public void p3(){
        System.out.println("three");

    }
}
