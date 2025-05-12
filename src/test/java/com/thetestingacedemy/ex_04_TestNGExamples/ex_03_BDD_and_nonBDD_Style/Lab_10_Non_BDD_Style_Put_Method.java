package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_10_Non_BDD_Style_Put_Method {
    @Test
    public void put(){
        String token= "45c660dec8f3b3e";
       // String bookingid="2052";
        String payload = "{\n" +
                "    \"firstname\" : \"raziq\",\n" +
                "    \"lastname\" : \"pasha\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com/booking");
       // rs.basePath("/bookingID/"+bookingid);
        rs.basePath("/booking/1");
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.body(payload).log().all();

        Response response  = rs.when().put();

        ValidatableResponse vs = response.then().log().all();
        vs.statusCode(200);
    }
}
