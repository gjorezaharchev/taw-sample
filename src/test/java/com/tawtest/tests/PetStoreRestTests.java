package com.tawtest.tests;

import com.taw.common.Global;
import com.tawtest.objects.rest.Store;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.assertj.core.api.SoftAssertions;


import static org.assertj.core.api.Assertions.assertThat;

public class PetStoreRestTests extends Global {

    private RequestSpecification httpRequest;
    private Response response;
    private JsonPath jsonPathEvaluator;
    private final Store so = new Store();

    @BeforeMethod
    public void setup() {

        RestAssured.baseURI ="https://mobile-gateway-api-test.azurewebsites.net/api"; //$("RESTURI");
        RestAssured.port = Integer.valueOf($("PORT"));
        httpRequest = RestAssured.given();
    }

    @Test
    public void get_pet() {
        int id =5;
        //https://google.com/id/5
        response = httpRequest.get("/pet/"+id);

       //https://google.com?search=gjore&exclude=zaharchev
        response = httpRequest.param("search", "gjore").param("search", "zaharchev").get("/pet/"+id);

        jsonPathEvaluator = response.jsonPath();

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.header("Content-Type")).isEqualTo("application/json");
        assertThat(response.time()).isLessThan(10000);
        assertThat(jsonPathEvaluator.get("id").toString()).isEqualTo(id);
    }

    @Test
    public void post_store_order() {
        //System.out.println(so.simple_order(1, 2, 2).toJSONString());
        httpRequest.header("Content-Type","application/json");
      //  httpRequest.body(so.simple_order(1, 2, 2).toJSONString());

        response = httpRequest.post("/store/order");
        jsonPathEvaluator = response.jsonPath();
        response.print();

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.header("Content-Type")).isEqualTo("application/json");
        assertThat(response.time()).isLessThan(10000);
        assertThat(jsonPathEvaluator.get("id").toString()).isEqualTo(0);
    }

    @Test
    public void test1(){
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(1).isEqualTo(2);



        System.out.println("Soft assert is good");
        softAssertions.assertThat(1).isEqualTo(4);
        softAssertions.assertAll();
    }

    @Test
    public void preliminaryTest(){
        String[] cids = {"111", "222", "333"};
        //System.out.println(so.preliminary("1", "2", "3", "start date", "enddate", cids, "some notes"));
        httpRequest.header("Content-Type","application/json");
       // httpRequest.body(so.preliminary("1", "2", "3", "start date", "enddate", cids, "some notes"));

        response = httpRequest.post("/v2/clients/1328489/telemedicine/preliminary-appointments");
        jsonPathEvaluator = response.jsonPath();
        response.print();
        System.out.println(response.statusCode());
    }
}
