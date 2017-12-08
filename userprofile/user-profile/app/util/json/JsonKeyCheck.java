/**
 * 
 */
package util.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeType;

/**
 * @author Manzarul.Haque
 *
 */
public class JsonKeyCheck extends JsonNode {

	@Override
    public String asText() {
	    // TODO Auto-generated method stub
	    return null;
    }


	@Override
    public boolean equals(Object arg0) {
	    // TODO Auto-generated method stub
	    return false;
    }

	@Override
    public JsonNode findParent(String arg0) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public List<JsonNode> findParents(String arg0, List<JsonNode> arg1) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public JsonNode findPath(String arg0) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public JsonNode findValue(String arg0) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public List<JsonNode> findValues(String arg0, List<JsonNode> arg1) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public List<String> findValuesAsText(String arg0, List<String> arg1) {
	    // TODO Auto-generated method stub
	    return null;
    }


	@Override
    public JsonNode path(String arg0) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public JsonNode path(int arg0) {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public String toString() {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public JsonParser traverse() {
	    // TODO Auto-generated method stub
	    return null;
    }

	/**
	 * This method will check incoming key is there or not.
	 * if present then send its value and if not then send default 
	 * empty string.
	 * @param jsonNode JsonNode
	 * @param key String
	 * @return String
	 */
	public static String checkForStringValue(JsonNode jsonNode ,String key) {
		       if (jsonNode.has(key)) {
		    	   return  jsonNode.get(key).asText();
		       } 
		       return "";
	}
	
	/**
	 * This method will check incoming key is there or not.
	 * if present then send its value and if not then send default 
	 * empty string.
	 * @param jsonNode JsonNode
	 * @param key String
	 * @return String
	 */
	public static Long checkForLongValue (JsonNode jsonNode ,String key) {
	       if (jsonNode.has(key)) {
	    	   return  jsonNode.get(key).asLong();
	       } 
	       return 0l;
}
	
	/**
	 * This method will check incoming key is there or not.
	 * if present then send its value and if not then send default 
	 * empty string.
	 * @param jsonNode JsonNode
	 * @param key String
	 * @return String
	 */
 public static int checkForIntValue	(JsonNode jsonNode ,String key) {
     if (jsonNode.has(key)) {
  	   return  jsonNode.get(key).asInt();
     } 
     return 0;
}
	
 /**
	 * This method will check incoming key is there or not.
	 * if present then send its value and if not then send default 
	 * empty string.
	 * @param jsonNode JsonNode
	 * @param key String
	 * @return String
	 */
 public static boolean checkForBooleanValue (JsonNode jsonNode ,String key) {
     if (jsonNode.has(key)) {
    	   return  jsonNode.get(key).asBoolean();
       } 
       return false;
  }
	
 /**
	 * This method will check incoming key is there or not.
	 * if present then send its value and if not then send default 
	 * empty string.
	 * @param jsonNode JsonNode
	 * @param key String
	 * @return String
	 */
 public static double checkForDoubleValue (JsonNode jsonNode ,String key) {
     if (jsonNode.has(key)) {
    	   return  jsonNode.get(key).asDouble();
       } 
       return 0.0;
  }

@Override
public NumberType numberType() {
    // TODO Auto-generated method stub
    return null;
}

//@Override
public JsonParser traverse(ObjectCodec arg0) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public <T extends JsonNode> T deepCopy() {
    // TODO Auto-generated method stub
    return null;
}

@Override
public JsonNode get(int arg0) {
    // TODO Auto-generated method stub
    return null;
}

//@Override
public JsonNodeType getNodeType() {
    // TODO Auto-generated method stub
    return null;
}


@Override
public JsonToken asToken() {
    // TODO Auto-generated method stub
    return null;
}


@Override
public void serialize(JsonGenerator arg0, SerializerProvider arg1) throws IOException {
    // TODO Auto-generated method stub
    
}


@Override
public void serializeWithType(JsonGenerator arg0, SerializerProvider arg1, TypeSerializer arg2) throws IOException {
    // TODO Auto-generated method stub
    
}


@Override
protected JsonNode _at(JsonPointer arg0) {
    // TODO Auto-generated method stub
    return null;
}
}
