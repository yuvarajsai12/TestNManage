package com.app.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	
	public static void main(String[] args) {
		/*List<String> l1 =new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		List<String> l2 =new ArrayList<String>();
		l2.add("3");
		l2.add("4");
		List<String> l3 =new ArrayList<String>();
		l3.add("5");
		l3.add("6");
		// list of list
		List<List<String>> li = new ArrayList<List<String>>();
		li.add(l1);//0
		li.add(l2);//1
		li.add(l3);//2
		
		System.out.println(li.get(0).get(1));
		System.out.println(li.get(3).get(3));*/
		
		//List of Map
		Map<String, String> m1 =new HashMap<String, String>();
		m1.put("0", "3");
		Map<String, String> m2 =new HashMap<String, String>();
		m2.put("0", "4");
		Map<String, String> m3 =new HashMap<String, String>();
		m3.put("0", "5");
		
		List<Map<String , String>> listmap = new ArrayList<Map<String,String>>();
		listmap.add(m1);
		listmap.add(m2);
		listmap.add(m3);
		System.out.println(listmap.get(0).get("0"));
		System.out.println(listmap.get(1).get("0"));
		System.out.println(listmap.get(2).get("0"));
		
	}

}
