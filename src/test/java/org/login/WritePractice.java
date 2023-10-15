package org.login;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WritePractice {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fr = new FileReader(
				"C:\\Users\\kokpa\\eclipse-workspace\\new\\JSONRead\\src\\test\\resources\\Sample.json");

		JSONParser jsonParser = new JSONParser();

		Object parse = jsonParser.parse(fr);

		JSONObject jsonObject = (JSONObject) parse;

		Object object = jsonObject.get("name");

		Object object2 = jsonObject.get("age");

		Object object3 = jsonObject.get("courses");

		System.out.println(object);

		System.out.println(object2);

		System.out.println(object3);

	}

}
