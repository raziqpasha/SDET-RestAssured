package com.thetestingacedemy.ex_04_TestNGExamples.ex_01_restassured;

import io.restassured.RestAssured;
import java.util.*;

public class Lab_02_BuilderPattern_or_APIChainingMethod_Gherkins_Syntax {
    public static void main(String[] args) {

        //restAssured
        //Gherkins Syntax
        //given() pre requ - url, headers,auth,body
        //when - http methods() ? - get,put,post,patch,delete
        //then() - status code -200 ok , ex: firstname == raziq


        //these are consequite(continous without inteription) and important ->these gherkins syntax is
        // builder pattern and API Chaining method
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pincode");
        int pincode = sc.nextInt();
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/pincode")

                .when()
                .get()

                .then().log().all().statusCode(200);


    }
}
