package com.thetestingacedemy.ex_04_TestNGExamples.ex_01_restassured;


import io.restassured.RestAssured;

public class Lab_01 {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")

            .when()
                .get("/ping")

                .then()
                .log().all()
                .statusCode(200);
    }
}
