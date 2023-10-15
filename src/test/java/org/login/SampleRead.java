package org.login;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleRead {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fr = new FileReader("src\\test\\resources\\Sample.json");
		JSONParser jsonParser = new JSONParser();
		Object rootObject = jsonParser.parse(fr);
		
//		TypeCasting - DownCasting from Object to JSONObject
		
		JSONArray jsonArray = (JSONArray) rootObject;
		
		for (int i = 0; i < jsonArray.size() ; i++) {
			
			Object object = jsonArray.get(i);
//			System.out.println(object);
			
			JSONObject jsonObject = (JSONObject) object;
			Object object2 = jsonObject.get("id");
			Object object3 = jsonObject.get("type");
			Object object4 = jsonObject.get("name");
			Object object5 = jsonObject.get("ppu");
			Object object6 = jsonObject.get("batters");
			
			System.out.println(object2);
			System.out.println(object3);
			System.out.println(object4);
			System.out.println(object5);
//			System.out.println(object6);
			
			JSONObject jsonObject1 = (JSONObject)object6;
			Object object7 = jsonObject1.get("batter");
//			System.out.println(object7);
			
			JSONArray jsonArray1 = (JSONArray) object7;
			
			for (int j = 0; j < jsonArray1.size(); j++) {
				
				Object object8 = jsonArray1.get(j);
//				System.out.println(object8);
				
				JSONObject jsonObject2 = (JSONObject)object8;
				Object object9 = jsonObject2.get("id");
				Object object10 = jsonObject2.get("type");
				System.out.println(object9);
				System.out.println(object10);
			}
			
			Object object8 = jsonObject.get("topping");
//			System.out.println(object8);
			
			JSONArray jsonArray2 = (JSONArray) object8;
			
			for (int j = 0; j < jsonArray2.size(); j++) {
				
				Object object9 = jsonArray2.get(j);
//				System.out.println(object9);
				
				JSONObject jsonObject2 = (JSONObject) object9;
				Object object10 = jsonObject2.get("id");
				Object object11 = jsonObject2.get("type");
				
				System.out.println(object10);
				System.out.println(object11);	
			}
			
		}
		
		
	}

}
