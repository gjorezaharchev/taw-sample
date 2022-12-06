package com.tawtest.objects.rest;

/*import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;*/

public class Store {

/*    private JSONObject requestParams = new JSONObject();

    public JSONObject sample_reg(){
        String reg = "{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2020-03-31T14:04:45.681Z\",\"status\": \"placed\",\"complete\": true}";
        JSONParser parser = new JSONParser();

        try {
            requestParams = (JSONObject)parser.parse(reg);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  requestParams;
    }*/

/*    public JSONObject simple_order(int id, int petId, int quantity) {
        requestParams.put("id", id);
        requestParams.put("petId", petId);
        requestParams.put("quantity", quantity);
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
                requestParams.put("someobject", sd);
        return requestParams;

    }

    public JSONObject preliminary(String clinicId, String reasonId, String employeeId, String start,String end, String[] patientIds, String clientNotes) {
        JSONObject preliminaryRQ = new JSONObject();
        preliminaryRQ.put("clinicId", clinicId);
        preliminaryRQ.put("reasonId", reasonId);
        preliminaryRQ.put("employeeId", employeeId);
        preliminaryRQ.put("start", clinicId);
        preliminaryRQ.put("end", clinicId);
        JSONArray patientIdsArr = new JSONArray();
        int i;
        for (i = 0; i < patientIds.length; i++) {
            patientIdsArr.add(patientIds[i]);
        }
        preliminaryRQ.put("patientIds", patientIdsArr);
        preliminaryRQ.put("clientNotes", clientNotes);

        return preliminaryRQ;
    }*/
}
