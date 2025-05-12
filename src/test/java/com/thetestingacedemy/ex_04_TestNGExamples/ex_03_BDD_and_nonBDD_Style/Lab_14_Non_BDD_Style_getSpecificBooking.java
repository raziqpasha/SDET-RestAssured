package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_14_Non_BDD_Style_getSpecificBooking {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String bookingidspecific ="2052";
    @Test
    public void getallBooking(){
        //url,method,  payload /body /headers
        //Auth?


        System.out.println("--------part1---------------");
        //given
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingidspecific);


        //when
        System.out.println("---------------part2--------------");
        response = r.when().log().all().get();

        //then
        System.out.println("--------------part3-----------------");
        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
