package com.thetestingacedemy.ex_04_TestNGExamples.ex_02_restassured_run_multipletestcase;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_07_Singletestcasese {

    @Test
    public void st(){
        int pincode = 560045;
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)

                .when()
                .get()

                .then()
                .log().all().statusCode(200);
    }
}
