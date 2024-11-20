package com.bddStyleAPIAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class GetBooks {
@Test
    public void getbook(){
        RestAssured.useRelaxedHTTPSValidation();
               RestAssured .given()
                .baseUri("https://bookcart.azurewebsites.net")
                .when()
                .get("/api/Book/90").prettyPrint();
    }
    @Test
    public void postBookIdchange(){
        RestAssured.useRelaxedHTTPSValidation();
        File jsonfile=new File("postData.json");
        RestAssured.given().baseUri("https://bookcart.azurewebsites.net")
                .header("Content-type","Application/json")
                .body("jsonfile").when().post("/api/Book").prettyPrint();
    }
}
