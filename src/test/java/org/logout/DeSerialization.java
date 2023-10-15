package org.logout;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerialization {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		FileReader fr = new FileReader("src\\test\\resources\\JsonRead.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Root readValue = objectMapper.readValue(fr, Root.class);
		
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		
		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		
//		Iteration
		
		for (int i = 0; i <batter.size() ; i++) {
			
			System.out.println(batter.get(i).getId());
			System.out.println(batter.get(i).getType());
			
		}
		
		ArrayList<Toppings> topping = readValue.getTopping();
		
		for (int i = 0; i < topping.size() ; i++) {
			
			System.out.println(topping.get(i).getId());
			System.out.println(topping.get(i).getType());
			
		}
		
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(readValue.getBatters().getBatter().get(0).getId());
//		System.out.println(readValue.getBatters().getBatter().get(0).getType());
//		System.out.println(readValue.getBatters().getBatter().get(1).getId());
//		System.out.println(readValue.getBatters().getBatter().get(1).getType());
//		System.out.println(readValue.getBatters().getBatter().get(2).getId());
//		System.out.println(readValue.getBatters().getBatter().get(2).getType());
//		System.out.println(readValue.getBatters().getBatter().get(3).getId());
//		System.out.println(readValue.getBatters().getBatter().get(3).getType());
//		
//		System.out.println(readValue.getTopping().get(0).getId());
//		System.out.println(readValue.getTopping().get(0).getType());
//		System.out.println(readValue.getTopping().get(1).getId());
//		System.out.println(readValue.getTopping().get(1).getType());
//		System.out.println(readValue.getTopping().get(2).getId());
//		System.out.println(readValue.getTopping().get(2).getType());
//		System.out.println(readValue.getTopping().get(3).getId());
//		System.out.println(readValue.getTopping().get(3).getType());
//		System.out.println(readValue.getTopping().get(4).getId());
//		System.out.println(readValue.getTopping().get(4).getType());
//		System.out.println(readValue.getTopping().get(5).getId());
//		System.out.println(readValue.getTopping().get(5).getType());
//		System.out.println(readValue.getTopping().get(6).getId());
//		System.out.println(readValue.getTopping().get(6).getType());
	