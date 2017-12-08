
package util.mapper;

import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

import exceptions.RequestDataMissingException;

/**
 * @author Manzarul
 *
 */
public class ControllerRequestMapper {
	/**
	 * @param <T>
	 * @param requestData
	 * @param obj
	 *            Object
	 * @exception RequestDataMissingException
	 * @return Object
	 */
	public <T> Object mapRequest(JsonNode requestData, Class<T> obj) throws RequestDataMissingException {
		try {
			return Json.fromJson(requestData, obj);
		} catch (Exception e) {
			throw new RequestDataMissingException("Plz Check The Data");
		}
	}

}
