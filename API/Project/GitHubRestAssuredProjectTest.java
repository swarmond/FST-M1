package project;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitHubRestAssuredProjectTest {
	// SSH Key to test with
	String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIEXgzxR9X3i2TXugVtnJxU8dawZ+G22p4IRy+kedX8ir";
	// Temp variable to store & share ID
	int keyId;
	// Declare the Request and Response Specification
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setup() {
		// Initialize the Request Specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com/user/keys").
				addHeader("Content-Type", "application/json").
				addHeader("Authorization", "token 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"). //Can use 'bearer' in place of 'token' 
				addHeader("X-GitHub-Api-Version", "2022-11-28").
				build();
				
		// Initialize the Response Specification
		responseSpec = new ResponseSpecBuilder().
				expectBody("title", Matchers.equalTo("TestKey")).
				expectBody("key", Matchers.equalTo(sshKey)).
				expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).				
				build();
		
	}
	
	@Test(priority = 1)
	public void postRequestTest() {
		// Create a request body
		HashMap<String, String> reqBody = new HashMap<String, String>();
		reqBody.put("title", "TestKey");
		reqBody.put("key", sshKey);
		// Send request, save response
		Response response = RestAssured.given().spec(requestSpec).body(reqBody).log().all().
			when().post();
		//Extract the ID from response
		keyId = response.then().extract().path("id");
		// Assertion
		response.then().statusCode(201).spec(responseSpec).log().all();
		
	}
	
	@Test(priority = 2)
    public void getRequestTest() {
    	// Send request, save response
    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
		when().get("/{keyId}").
		then().statusCode(200).spec(responseSpec);
    }
	
	@Test(priority = 3)
    public void deleteRequestTest() {
    	// Send request, save response
    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
		when().delete("/{keyId}").
		then().statusCode(204).time(Matchers.lessThanOrEqualTo(3000L));
    }
	

}
