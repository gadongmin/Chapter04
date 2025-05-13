package com.javaex.ex05;

import java.util.LinkedList;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		// 리스트
		/* 
		   ArrayList ↔ LinkedList 하려면 List에만 있는 메소드를 사용해야한다.
		   메소드를 공통으로 쓰는 것만 사용하도록 업캐스팅(섞어쓰기)
		*/
		List<Point> pList = new LinkedList<Point>(); // 부모가 인터페이스로 사용된 경우 통상 섞어쓰기로 사용

		// 포인트
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		// 리스트에 포인트(주소) 넣는다.
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		// 출력
		Point p = pList.get(0);
		System.out.println(p.toString()); // Point의 toString이 출력, 삭제하면 Object의 toString이 출력

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}

	}
}
