package com.taw.objects.rest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Store {

    private JSONObject requestParams = new JSONObject();

    public JSONObject sample_reg(){
        String reg = "{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2020-03-31T14:04:45.681Z\",\"status\": \"placed\",\"complete\": true}";
        JSONParser parser = new JSONParser();

        try {
            requestParams = (JSONObject)parser.parse(reg);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  requestParams;
    }

    public JSONObject simple_order() {
        requestParams.put("id", 0);
        requestParams.put("petId", 3);
        requestParams.put("quantity", 3);
        requestParams.put("shipDate", "2020-03-18T17:05:00.509Z");
        requestParams.put("status", "placed");
        requestParams.put("complete", true);
        JSONObject ab = new JSONObject();
        ab.put("cd", "ef");
        ab.put("cs", "dfs");
        ab.put("dfss", "dsdfdfd");
        JSONArray sd = new JSONArray();
        sd.add(ab);
        sd.add(ab);

        requestParams.put("some text", sd);
        return requestParams;

    }
}
