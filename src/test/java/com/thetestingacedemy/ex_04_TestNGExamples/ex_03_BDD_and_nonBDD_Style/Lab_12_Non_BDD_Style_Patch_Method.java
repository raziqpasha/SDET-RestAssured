package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_12_Non_BDD_Style_Patch_Method {

    @Test
    public void patch(){
        String token= "ec6547fc5d6e2c7";
        String bookingid="509";
        String payload = "{\n" +
                "    \"firstname\" : \"rp\",\n" +
                "    \"lastname\" : \"pr\"\n" +
                "}";
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com/booking");
        rs.basePath("/bookingID/"+bookingid);
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.body(payload).log().all();

        Response response  = rs.when().patch();

        ValidatableResponse vs = response.then().log().all();
        vs.statusCode(200);
    }

}
