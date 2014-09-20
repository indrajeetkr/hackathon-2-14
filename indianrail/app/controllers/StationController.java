package controllers;

import java.util.ArrayList;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class StationController extends Controller {

	public static Result getNearestStattion(Double lat, Double lng) {
		try {
			ObjectNode result = Json.newObject();
			result.put("name", "Bangalore");
			// result.put("station_code", "SBC");
			return ok(result);
		} catch (Exception e) {
			ObjectNode errorNode = Json.newObject();
			errorNode.put("message", "Invalid input");
			return badRequest(errorNode);
		}
	}

	public static Result getPath(String source, String destination) {
		try {

			ArrayList resultList = new ArrayList<>();
			ObjectNode result = Json.newObject();
//			{"lat":12.9715986,
//				"lng":77.5945663,
//				"name":"Bangalore",
//				"train":"Shatabdi Express",
//				"order":1
//				},
//				{
//				"lat":15.3647079,
//				"lng":75.1239548,
//				"name":"Hubli",
//				"train":"Intercity Express",
//				"order":2
//				},
//				{"lat":15.465067,
//				"lng":75.003481,
//				"name":"Dharwad",
//				"order"
//				}
			result.put("lat", 12.9715986);
			result.put("lng", 77.5945663);
			result.put("name", "Bangalore");
			result.put("train", "Shatabdi Express");
			result.put("order", 1);
			resultList.add(result);
			
			result = Json.newObject();
			result.put("lat", 15.3647079);
			result.put("lng", 75.1239548);
			result.put("name", "Hubli");
			result.put("train", "Intercity Express");
			result.put("order", 2);
			resultList.add(result);
			result = Json.newObject();
			result.put("lat", 15.465067);
			result.put("lng", 75.003481);
			result.put("name", "Dharwad");
			result.put("order", 3);
			resultList.add(result);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode userNode = mapper.convertValue(resultList, JsonNode.class);
			return ok(userNode);
		} catch (Exception e) {
			ObjectNode errorNode = Json.newObject();
			errorNode.put("message", "Invalid input");
			return badRequest(errorNode);
		}
	}

}
