package util;

import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;
import util.json.JsonKey;




/**
 * 
 * @author Varun
 *
 */
public class ProjectUtil {
	
	 public static ObjectNode successResponse() {
			ObjectNode response = Json.newObject();
			response.put(JsonKey.STATUS_CODE, ResponseCode.Success.getErrorCode());
			response.put(JsonKey.STATUS_MESSAGE,
				ResponseCode.Success.getErrorMessage());
			response.put(JsonKey.ERROR_MESSAGE, "");
			return response;
		    }
	 
	 public static ObjectNode failureResponse() {
			ObjectNode response = Json.newObject();
			response.put(JsonKey.STATUS_CODE, ResponseCode.FAILURE.getErrorCode());
			response.put(JsonKey.STATUS_MESSAGE,
				ResponseCode.FAILURE.getErrorMessage());
			response.put(JsonKey.ERROR_MESSAGE,
				ResponseCode.FAILURE.getErrorMessage());
			return response;
		    }
	 

	public static ObjectNode successResponse(Object obj) {
			ObjectNode response = Json.newObject();
			response.put(JsonKey.STATUS_CODE, ResponseCode.Success.getErrorCode());
			response.put(JsonKey.STATUS_MESSAGE,
				ResponseCode.Success.getErrorMessage());
			response.put(JsonKey.ERROR_MESSAGE, "");
			if (obj != null) {
			    response.set(JsonKey.RESPONSE_DATA, Json.toJson(obj));
			}
			return response;
		    }
	
}