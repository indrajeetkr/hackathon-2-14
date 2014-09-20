package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class StationController extends Controller {

	public static Result getNearestStattion(Double lat, Double lng) {
		try {
			ObjectNode result = Json.newObject();
			result.put("station_name", "Bangalore");
			result.put("station_code", "SBC");
			return ok(result);
		} catch (Exception e) {
			ObjectNode errorNode = Json.newObject();
			errorNode.put("message", "Invalid input");
			return badRequest(errorNode);
		}
	}

}
