package com.thetestingacedemy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab19_grouping {

    @Test(groups ={"sanity","reg"},priority=1)
    public void test_sanity(){
        System.out.println("sanity testing");
    }

    @Test(groups ={"reg"},priority=2)
    public void test_reg(){
        System.out.println("regression testing");
    }

    @Test(groups={"p1","reg"},priority=3)
    public void test_smoke(){
        System.out.println("smoke testing");
    }
}
