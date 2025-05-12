package com.thetestingacedemy.ex_04_TestNGExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab16_RealwordTestNG {
    RequestSpecification r;
    Response response;
    ValidatableResponse rs;


    @BeforeTest
    public void beforetest(){

        System.out.println("befor testing");

    }

    @Test
    public void testing(){
        //url,method,  payload /body /headers
        //Auth?
        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("--------part1---------------");
        //given
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        //when
        System.out.println("---------------part2--------------");
        response = r.when().log().all().post();

        //then
        System.out.println("--------------part3-----------------");
        rs = response.then().log().all();
        rs.statusCode(200);
    }

    @AfterTest
    public void aftertest(){
        System.out.println("all testes are done");
    }
}
