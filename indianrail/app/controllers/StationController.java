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
//			{"latA":12.9715986,
//				"lngA":77.5945663,
//				"latB":15.3647079,
//				"lngB":75.1239548,
//				"stationA":"Bangalore",
//				"stationB":"Hubli",
//				"train":"Shatabdi Express",
//				"order":1
//				},
//				{"latA":15.3647079,
//				"lngA":75.1239548,
//				"latB":15.465067,
//				"lngB":75.003481,
//				"stationA":"Hubli",
//				"stationB":"Dharwad",
//				"train":"Intercity Express",
//				"order":2
//				}
			result.put("latA", 12.9715986);
			result.put("lngA", 77.5945663);
			
			result.put("latB", 15.3647079);
			result.put("lngB", 75.1239548);
			result.put("stationA", "Bangalore");
			result.put("stationB", "Hubli");
			result.put("train", "Shatabdi Express");
			result.put("order", 1);
			resultList.add(result);
			result = Json.newObject();
			result.put("latA", 15.3647079);
			result.put("lngA", 75.1239548);
			
			result.put("latB", 15.465067);
			result.put("lngB", 75.003481);
			result.put("stationA", "Hubli");
			result.put("stationB", "Dharwad");
			result.put("train", "Intercity Express");
			result.put("order", 2);
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
