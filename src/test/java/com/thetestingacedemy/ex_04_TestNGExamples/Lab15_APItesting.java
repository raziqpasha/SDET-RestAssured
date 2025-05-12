package com.thetestingacedemy.ex_04_TestNGExamples;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab15_APItesting {
    @Description("TC2: Verify the testcase if wheather firstname is not null")
    @Owner("raziq")
    @Severity(SeverityLevel.CRITICAL)
    @Test()
    @BeforeTest
    public void getToken(){
        System.out.println("before get tokem");
    }

    @Test
    public void test_Put(){
        System.out.println("put request");
    }

    @Test
    public void test_Put2(){
        System.out.println("put request2");
    }

    @AfterTest
    public void closeallthings(){
        System.out.println("closeall");
    }
}
