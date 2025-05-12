package com.thetestingacedemy.ex_04_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab21_Parameters {
    @Parameters("browser")
    @Test
    public void p1(String value){
        System.out.println("iam using different browser");
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("iam opening firefox");
        }

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("iam opening chrome");
        }
    }

}
