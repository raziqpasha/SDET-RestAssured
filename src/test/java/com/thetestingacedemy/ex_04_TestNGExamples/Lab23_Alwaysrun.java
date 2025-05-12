package com.thetestingacedemy.ex_04_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab23_Alwaysrun {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = false)
    public void test_normal() {
        Assert.assertTrue(false);
    }
}
