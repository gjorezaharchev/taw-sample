package com.taw.tests;

import com.taw.common.Global;
import com.taw.objects.rest.Store;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PetStoreRestTests extends Global {

    private RequestSpecification httpRequest;
    private Response response;
    private JsonPath jsonPathEvaluator;
    private Store so = new Store();

    @BeforeMethod
    public void setup() {

        RestAssured.baseURI = $("RESTURI");
        RestAssured.port = Integer.valueOf($("PORT"));
        httpRequest = RestAssured.given();
    }

    @Test
    public void get_pet() {
        int id =5;
        response = httpRequest.get("/pet/"+id);
        jsonPathEvaluator = response.jsonPath();

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.header("Content-Type")).isEqualTo("application/json");
        assertThat(response.time()).isLessThan(10000);
        assertThat(jsonPathEvaluator.get("id").toString()).isEqualTo(id);
    }

    @Test
    public void post_store_order() {
        System.out.println(so.simple_order().toJSONString());
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(so.simple_order().toJSONString());

        response = httpRequest.post("/store/order");
        jsonPathEvaluator = response.jsonPath();
        response.print();

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.header("Content-Type")).isEqualTo("application/json");
        assertThat(response.time()).isLessThan(10000);
        assertThat(jsonPathEvaluator.get("id").toString()).isEqualTo(0);
    }
}
