package com.kh.collection.map.model.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Member;

public class MapService {
	// Map
	// - Key, Value가 한쌍으로 존재함
	// - Key는 중복된 값을 허용하지 않고, 순서가 유지되지 않음 == Set 특징
	// - Value는 Key에 의해 서로가 구분되므로 중복값을 허용함 == List 특징
	
	public void example1() {
		// HashMap<K, V>
		// - 자바의 가장 대표적인 맵
		// - Key 객체의 hashCode() 이용한 중복 검사를 진행함
		// - hashCode()를 이용하여 Key값 검색을 진행하므로
		//	  검색 속도가 빠름
		
		//Map<String, Member> memberMap = new HashMap<>();
												// 타입 추론
		Map<String, Member> memberMap = new LinkedHashMap<>();
												// 순서 유지
		
		// 1. put(K key, V value) : Map에 데이터 추가
		memberMap.put("admin", new Member("admin", "1234", "김관리", 
				"1990-01-01", "010-1234-1234"));
		
		memberMap.put("user01", new Member("user01", "pass01", "유저일", 
				"1990-01-01", "010-1111-1111"));
		
		memberMap.put("user02", new Member("user02", "pass02", "유저이", 
				"1990-02-02", "010-2222-2222"));
		
		System.out.println(memberMap);
		
		
		
		// 2. get(K key) : Map 내부 데이터 중 Key값이 일치하는 부분의 Value를 얻어옴
		System.out.println("get()");
		System.out.println(memberMap.get("admin"));
		
		
		
		// 3. size() : Map에 담겨있는 Key 객체의 개수
		System.out.println("\n size() : " + memberMap.size());
		
		
		
		// 4. remove(K key) : Key값이 일치하는 Map 데이터 제거
		// 삭제 성공 시 삭제된 Key의 Value값이 반환됨
//		System.out.println("\n remove() : " + memberMap.remove("user02"));
		
	
	
		// ---------------------------------------------------------------
		
		// Map 반복 접근 방법
		
		// 1. keySet()을 이용하는 방법(부분적으로 사용할 때 효율적임)
		// - Map의 저장된 데이터 중 Key만으로 이루어진 Set
		Set<String> keySet = memberMap.keySet();
		
		// 1) Set -> List
		// 2) Iterator 반복자
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			
			System.out.println("key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		// 3) 향상된 for문
		for(String key : keySet) {
			System.out.println("key : " + key);
			System.out.println("Value : " + memberMap.get(key));
		}
		
		
		// 2. entrySet()을 이용한 방법
		// - entry란? Key와 Value 한 쌍을 묶어서 부르는 말
		
		Set<Map.Entry<String, Member>> entrySet = memberMap.entrySet();
		
		// 1) Iterator 반복자 사용
		Iterator<Entry<String, Member>> it2 = entrySet.iterator();
		
		while(it2.hasNext()) {
			Entry<String, Member> entry = it2.next();
			
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		// 2) 향상된 for문
		for(Entry<String, Member> entry : entrySet ) {
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	
	
	
	}
	
	
	
	
	

}
