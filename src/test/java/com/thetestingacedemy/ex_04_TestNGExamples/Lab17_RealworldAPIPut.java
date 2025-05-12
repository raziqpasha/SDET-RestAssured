package com.thetestingacedemy.ex_04_TestNGExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;

public class Lab17_RealworldAPIPut {
    RequestSpecification rs;
    Response response;
    ValidatableResponse validatableResponse;

    String token;
    int bookingId = 1;

    @BeforeSuite()
    public void beforesuite() {
        System.out.println("before suite");
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

    }

    @BeforeTest
    public void beforetest(){
        System.out.println("🔧 [BeforeTest] Run before <test> in XML");

    }
@BeforeClass
    public void beforeclass(){
    System.out.println("🔧 [BeforeClass] Generating token or test setup...");
    token = "32e6b4463acb671"; // Ideally fetched dynamically
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("🔧 [BeforeMethod] Preparing request...");
        rs = RestAssured.given();
        rs.basePath("/booking/" + bookingId);
        rs.contentType(ContentType.JSON);
        rs.cookie("token", token);
    }

    @Test(priority=1)
    public void Test(){
        System.out.println("🚀 [Test] Executing PUT test...");

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

        rs.body(payload).log().all();

        response = rs.when().put();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("✅ [AfterMethod] Request completed.\n");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("✅ [AfterClass] All tests in class done.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("✅ [AfterTest] Test section cleanup done.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("✅ [AfterSuite] Global teardown complete.");
    }
}