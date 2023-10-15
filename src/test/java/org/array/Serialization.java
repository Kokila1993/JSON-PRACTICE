package org.array;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File fr = new File("src\\test\\resources\\JsonRead1.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Batter batter = new Batter("1001", "Regular");
		
		Batter1 batter1 = new Batter1("1002", "Chocolate");
		
		Batter2 batter2 = new Batter2("1003", "Blueberry");
		
		Batter3 batter3 = new Batter3("1004","Devil's Food");
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(batter);
		al.add(batter1);
		al.add(batter2);
		al.add(batter3);		
		
		Batters Batters = new Batters(al);
		
		Root root = new Root("0001", "donut", "Cake", 0.55, Batters);
		
		objectMapper.writeValue(fr,root);
		
		
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
	