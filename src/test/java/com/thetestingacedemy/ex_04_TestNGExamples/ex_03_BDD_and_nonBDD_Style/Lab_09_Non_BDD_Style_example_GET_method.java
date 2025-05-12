package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_09_Non_BDD_Style_example_GET_method {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void get(){
//        int pincode = 560045;
//        RestAssured
//                .given()
//                .baseUri("https://api.zippopotam.us")
//                .basePath("/IN/"+pincode)
//
//                .when()
//                .get()
//
//                .then()
//                .log().all().statusCode(200);

        int pincode = 560045;
        //given
        r =RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        //when
        response =r.when().log().all().get();
        System.out.println(response.toString()+"these is when method");

        //then
        vr=response.then().log().all();
        vr.statusCode(200);

    }
}
