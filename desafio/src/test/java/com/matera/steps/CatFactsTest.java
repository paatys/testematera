package com.matera.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import com.matera.api.CatFactsAPI;

import static org.hamcrest.MatcherAssert.assertThat;

public class CatFactsTest {
    private CatFactsAPI catFactsAPI;
    private Response response;

    @Given("que a API Cat Facts está disponível")
    public void setupApi() {
        catFactsAPI = new CatFactsAPI();
    }

    @When("faço uma solicitação GET para \"/breeds\"")
    public void sendGetRequest() {
        response = catFactsAPI.getBreeds();
    }

    @Then("o código de status da resposta deve ser {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        assertThat(response.getStatusCode(), equalTo(expectedStatusCode));
    }

    @Then("o corpo da resposta deve conter uma lista de raças de gatos")
    public void verifyResponseBodyContainsCatBreeds() {
        response.then().assertThat().body("size()", greaterThan(0));
    }
    

}