package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class HardcodedExamples {
	
	/**
	 * Rest Assured
	 * given - prepare your request
	 * when -
	 * then -
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="18.232.148.34/syntaxapi/api";
		
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTUzOTksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTEzODU5OSwidXNlcklkIjoiNjY2In0.kkh1VxUvka5ARgfu9XiuzfBZnNd8h3W2CR6YqAeiPgI";
		
		RequestSpecification getOneEmployeeRequest = given().header("Content_Type", "application/json").header("Authorisation", token).queryParam("employee_id", "16509A");
		
		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
	}
	
	public void sampleTestNotes() {
		
	}
		@Test
		public void aPOSTcreateEmployee() {
			
			RequestSpecification createEmployeeRequest = given().header("Content-Type", "Application/json").header("Authorization", "token")
					.body("{n"+"");
		}
	}