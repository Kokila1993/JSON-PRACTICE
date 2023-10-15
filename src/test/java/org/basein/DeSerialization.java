package org.basein;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		Root root = new Root();

		// ArrayList<Root> al = new ArrayList<Root>();

		FileReader fr = new FileReader("src\\test\\resources\\JsonArray.json");

		ObjectMapper objectMapper = new ObjectMapper();

		Root readValue = objectMapper.readValue(fr, Root.class);
		
		
	}

}
