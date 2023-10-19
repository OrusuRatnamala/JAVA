package com.infinite.Collections;

import java.util.Map;

public class MapConstructorinjection {

	private Map<String, String> Mp;
	
	MapConstructorinjection(){
}
	
		MapConstructorinjection(Map<String,String> t){
			Mp=t;
		}
		public void display(){
			System.out.println(Mp.keySet());
		}
	}