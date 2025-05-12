package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_09_Non_BDD_Style_tokens_Post_method {

    RequestSpecification r;
    Response response;
    ValidatableResponse rs;

    @Test
    public void post(){
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
}
