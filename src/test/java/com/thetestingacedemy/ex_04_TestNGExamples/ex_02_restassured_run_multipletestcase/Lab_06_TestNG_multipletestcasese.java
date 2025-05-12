package com.thetestingacedemy.ex_04_TestNGExamples.ex_02_restassured_run_multipletestcase;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_06_TestNG_multipletestcasese {

    @Test
    public void positivetestcase_step1() {
        int pincode = 560045;
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)

                .when()
                .get()

                .then()
                .log().all().statusCode(200);

    }

    @Test
    public void neagtivetestcase_step2() {
        String pincodee = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincodee)

                .when()
                .get()

                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void neagtivetestcase_step3() {
        String pincodeee = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincodeee)

                .when()
                .get()

                .then()
                .log().all().statusCode(200);
    }


}
