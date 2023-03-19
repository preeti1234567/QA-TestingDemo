package restAPIDemo;



import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITesting {
	public static Response response=null;	
	static String responseBody = null;
	public void testDemo(){
	RestAssured.baseURI="https://reqres.in";
	  RequestSpecification httpRequest= RestAssured.given();
	  
	response= httpRequest.request(Method.GET, "/api/users?page=2");
}
	 

	public static void main(String[] args)throws IOException {
		

		  
			  
		
		APITesting ts = new APITesting();
		ts.testDemo();
		responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
  if(response.getStatusCode() == 200){
	  System.out.println("Test has passed");
  }
	  else {
		  
	  System.out.println("Test has not passed");
	  }	
	  }
}
		
	



