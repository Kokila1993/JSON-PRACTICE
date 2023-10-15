package org.base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONWrite {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f = new  File("C:\\Users\\kokpa\\eclipse-workspace\\new\\JSONRead\\src\\test\\resources\\SampleWrite.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Selenium");
		al.add("Python");
		al.add("Ruby");
		
		Address address = new Address("Namakkal", "TamilNadu");
		
		Root root = new Root("Kokila", 30, true, address, al);
		
		objectMapper.writeValue(f, root);
		
	}

}
