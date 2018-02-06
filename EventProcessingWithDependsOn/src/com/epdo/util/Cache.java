package com.epdo.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private static Cache instance;
	private Map<String, Object> dataMap;
	private Cache(){
		dataMap=new ConcurrentHashMap<>();
	}
	public static synchronized Cache getInstance(){
		if (instance== null)
			instance=new Cache();
		return instance;
	}
	public void put(String key, Object value){
		dataMap.put(key, value);
	}
	public Object get(String key){
		return dataMap.get(key);
	}
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
	public void putAll(Map<String, Object> hashmap){
		dataMap.putAll(hashmap);
	}
}
