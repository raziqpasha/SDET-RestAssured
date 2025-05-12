package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab08_BDD_Style {
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
