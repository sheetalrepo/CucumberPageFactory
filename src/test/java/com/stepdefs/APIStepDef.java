package com.stepdefs;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojos.PhotoIdPojo;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import utils.APIUtils;

public class APIStepDef {
	@Given("^user initialize setup$")
	public void user_initialize_setup() throws Throwable {
		// RA Setup
		System.out.println("Setup...");
	}

	@When("^user creates request body for photo id$")
	public void user_creates_request_body_for_photo_id(DataTable dataTable) throws Throwable {
		List<Map<String, String>> listOfDataTableMap = dataTable.asMaps(String.class, String.class);

		Map<String, String> map1 = listOfDataTableMap.get(0);
		System.out.println(">>" + map1);
		
		
		//create pojo
		PhotoIdPojo pojo = new PhotoIdPojo();
		pojo.setId(Integer.parseInt(map1.get("PHOTO_ID")));
		pojo.setAlbumId(Integer.parseInt(map1.get("ALBUM_ID")));
		pojo.setTitle(map1.get("TITLE"));
		pojo.setUrl(map1.get("URL"));
		pojo.setThumbnailUrl(map1.get("THUMBNAIL_URL"));

		
		//pojo to json string
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(pojo);
		System.out.println("json: "+jsonString);
		
		String endPoint = "http://jsonplaceholder.typicode.com/photos/1";
		Response response = APIUtils.getRequest(endPoint);
		
		System.out.println("Status Code:  "+ response.getStatusCode());
		System.out.println("Response:  "+ response.print());
	}
}
