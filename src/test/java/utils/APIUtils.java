package utils;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import java.util.Map;
import com.google.gson.JsonObject;
import io.restassured.response.Response;


/**
 *  This class will contains standard methods for API testing
 *  
 * @author Sheetal_Singh
 *
 */
public class APIUtils {
	
	private static final String DEFAULT_CONTENT_TYPE = "application/json";
	
	private APIUtils() {}

	private static RequestSpecification givenConfig() {
		return given().auth().preemptive().basic("username", "password");
	}
	
	private static RequestSpecification givenConfig(String contentType) {
		return given().auth().preemptive().basic("username", "password").header("Content-Type", contentType);
	}
	
	
	public static Response getRequest(String endPoint) {
		return givenConfig().when().get(endPoint);
	}
	
	public static Response getRequest(String endPoint, Map<String, String> queryParam) {
		return givenConfig(DEFAULT_CONTENT_TYPE).params(queryParam).when().get(endPoint);
	}
	
	public static Response getRequest(String endPoint, String contentType) {
		return givenConfig(contentType).when().get(endPoint);
	}
	
	
	public static int getStatusCode(Response response) {
		return response.getStatusCode();
	}
	
	public static Response postRequest(String endPoint, String jsonString) {
		return givenConfig().when().body(jsonString).post(endPoint);
	}
	
	public static Response postRequest(String endPoint, Map<String, String> queryparam) {
		return givenConfig().queryParams(queryparam).when().post(endPoint);
	}
	
	public static Response postRequest(String endPoint, JsonObject gsonObj) {
		return givenConfig().when().body(gsonObj).post(endPoint);
	}

	
	
	public static Response putRequest(String endPoint, String jsonData) {
		return givenConfig().when().body(jsonData).put(endPoint);
	}

	public static Response deleteRequest(String endPoint) {
		return givenConfig().when().delete(endPoint);
	}
	
}
