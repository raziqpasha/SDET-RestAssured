package ex_06_Assetj;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;


public class Lab26_assetj {
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

    @Description("TC1: Verify the testcase if wheather firstname is not null")
    @Owner("raziq")
    @Severity(SeverityLevel.CRITICAL)
    @Test()
    public void create() {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        Response response = r.when().post();

        ValidatableResponse vr = response.then().log().all();
        vr.statusCode(200);


        System.out.println("assertion part--------------------?");

        vr.body("booking.firstname", Matchers.equalTo("Jim"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
        vr.body("bookingid", Matchers.notNullValue());

      int  bookingId=response.then().extract().path("bookingid");


        assertThat(bookingId).isNotZero().isNotNull();
        assertThat("firstname").isEqualTo("Jim").isNotEmpty().isNotBlank().isNotNull().isAlphanumeric();
        Allure.step("returm boolont:"+bookingId);


    }

    }
