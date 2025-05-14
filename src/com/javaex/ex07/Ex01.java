package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// HashSet<Integer> iSet = new HashSet<Integer>();, List처럼 같이 사용하면 유리함
		// 리스트
		Set<Integer> iSet = new HashSet<Integer>(); // 자동 중복체크

		// int, 기본형 생략
		// Integer i01 = new Integer(3);
		// Integer i02 = new Integer(6);
		// Integer i03 = new Integer(9);

		// 담기, 자동 Boxing
		iSet.add(3);
		iSet.add(6);
		iSet.add(9);
		iSet.add(9); // 중복된 데이터는 자동으로 제외
		
		/*
		 일반적인 순서로는 출력할 수 없다
		 for(int i=0; i<iSet.size();i++) {
		 	System.out.println(iSet.get(i)); }
		 */
		
		// 향상된 for문, iSet에서 임의대로 출력한다(순서의 개념이 없음)
		for (Integer i : iSet) {
			System.out.println(i.toString());
		}

		System.out.println("-------------------");
		
		System.out.println(iSet.size()); // 수량확인

		System.out.println("-------------------");
	}

}
