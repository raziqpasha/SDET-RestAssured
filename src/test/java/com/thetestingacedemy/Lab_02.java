package com.thetestingacedemy;

import io.restassured.RestAssured;
import java.util.*;

public class Lab_02 {
    public static void main(String[] args) {

        //restAssured
        //Gherkins Syntax
        //given() pre requ - url, headers,auth,body
        //when - http methods() ? - get,put,post,patch,delete
        //then() - status code -200 ok , ex: firstname == raziq


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
