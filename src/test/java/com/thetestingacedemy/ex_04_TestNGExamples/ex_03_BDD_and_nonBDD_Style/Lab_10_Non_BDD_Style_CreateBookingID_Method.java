package com.thetestingacedemy.ex_04_TestNGExamples.ex_03_BDD_and_nonBDD_Style;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.jar.JarEntry;

public class Lab_10_Non_BDD_Style_CreateBookingID_Method {
String payload ="{\n" +
        "    \"firstname\" : \"Jim\",\n" +
        "    \"lastname\" : \"Brown\",\n" +
        "    \"totalprice\" : 111,\n" +
        "    \"depositpaid\" : true,\n" +
        "    \"bookingdates\" : {\n" +
        "        \"checkin\" : \"2018-01-01\",\n" +
        "        \"checkout\" : \"2019-01-01\"\n" +
        "    },\n" +
        "    \"additionalneeds\" : \"Breakfast\"\n" +
        "}";
    @Test()
    public void create(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        Response response = r.when().post();

        ValidatableResponse vr =  response.then().log().all();
                vr.statusCode(200);


        JsonPath jsonPath = response.jsonPath();
        int bookingId = jsonPath.getInt("bookingid");
        System.out.println("Booking ID: " + bookingId);    }




}
