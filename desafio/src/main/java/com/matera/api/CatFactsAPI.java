package com.matera.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CatFactsAPI {
    private RequestSpecification request;
    
    public CatFactsAPI() {
        RestAssured.baseURI = "https://catfact.ninja/#/";
        request = RestAssured.given();
    }
    
    public Response getBreeds() {
        return request.get("/breeds");
    }
}