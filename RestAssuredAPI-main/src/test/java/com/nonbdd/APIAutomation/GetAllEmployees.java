package com.nonbdd.APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class GetAllEmployees {

    @Test
    public void getAllBooks() {
        //Base URI-->BAse URL
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://parabank.parasoft.com/parabank/images/home-normal.gif";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.GET);
        System.out.println(response.asPrettyString());
        System.out.println("Status Line is:" + response.getStatusLine());

    }
@Test
    public void updateBooks() {
    RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://bookcart.azurewebsites.net";
        RequestSpecification requestspecification = RestAssured
                .given()
                .header("Content-type","application/json")
                .body(" {\n" +
                "        \"bookId\": 41,\n" +
                "        \"title\": \"The Hate U Give\",\n" +
                "        \"author\": \"Angie Thomas\",\n" +
                "        \"category\": \"Biography\",\n" +
                "        \"price\": 128.00,\n" +
                "        \"coverFileName\": \"3d894fa1-8746-4443-b244-99624cc39f1fq1we.jpg\"\n" +
                "    }");
        Response response = requestspecification.request(Method.PUT, "/api/Book/41");
        System.out.println("Put Response is"+response.getStatusLine());
        System.out.println(response.asPrettyString());
    }


    @Test
    public void postnewBooking() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://bookcart.azurewebsites.net";
        RequestSpecification requestSpecification = RestAssured.given().
                header("Content-Type", "application.json").body(" {\n" +
                        "        \"bookId\": 99,\n" +
                        "        \"title\": \"Sudharshan Legend\",\n" +
                        "        \"author\": \"Vignesh\",\n" +
                        "        \"category\": \"Role model\",\n" +
                        "        \"price\": 235.00,\n" +
                        "        \"coverFileName\": \"9d8f4978-0ef8-42d0-873a-4eb583439237HP2.jpg\"\n" +
                        "    }"


                );
        Response response = requestSpecification.request(Method.POST, "/api/Book");
        System.out.println(response.asPrettyString());
        System.out.println("Status line for postnewBook" + response.getStatusLine());


    }
}
