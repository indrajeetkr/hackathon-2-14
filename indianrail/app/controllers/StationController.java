package controllers;

import java.util.ArrayList;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class StationController extends Controller {

	public static Result getNearestStattion(Double lat, Double lng) {
		try {
			ObjectNode result = Json.newObject();
			result.put("station_name", "Bangalore");
//			result.put("station_code", "SBC");
			return ok(result);
		} catch (Exception e) {
			ObjectNode errorNode = Json.newObject();
			errorNode.put("message", "Invalid input");
			return badRequest(errorNode);
		}
	}
	
//	public static Result getPath(String source, String destination) {
//		try {
////			/path?source={source}&destination={destination}
//			
//			ArrayList resultList = new ArrayList<>();
//			ObjectNode result = Json.newObject();
//			result.put("lat", 12.9667);
//			result.put("lon", 77.5667);
//			result.put("station_name", "Bangalore");
//			result.put("station_code", "SBC");
//			resultList.add(result);
//			result = Json.newObject();
//			result.put("lat", 18.5203);
//			result.put("lon", 77.5667);
//			result.put("station_name", "Bangalore");
//			result.put("station_code", "SBC");
//			
//			return ok(result);
//		} catch (Exception e) {
//			ObjectNode errorNode = Json.newObject();
//			errorNode.put("message", "Invalid input");
//			return badRequest(errorNode);
//		}
//	}

}
