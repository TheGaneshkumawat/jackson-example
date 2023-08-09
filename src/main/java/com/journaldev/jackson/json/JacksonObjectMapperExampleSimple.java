package com.journaldev.jackson.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.journaldev.jackson.model.SimpleObject;


public class JacksonObjectMapperExampleSimple {

	public static void main(String[] args) throws IOException {
		
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("data.json"));
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		SimpleObject emp = objectMapper.readValue(jsonData, SimpleObject.class);
		
		System.out.println("Simple Object\n"+emp);
	
	}
	
}
