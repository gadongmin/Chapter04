package com.javaex.ex04;

import java.util.ArrayList;

public class MyApp {

	public static void main(String[] args) {
		// 리스트
		ArrayList<Point> pList = new ArrayList<Point>();

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

		System.out.println("-----------------------");
		// 리스트
		ArrayList<Circle> cList = new ArrayList<Circle>();

		// 원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);

		// 리스트에 원(주소) 넣는다
		cList.add(c01);
		cList.add(c02);

		// 출력
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}

		System.out.println("-----------------------");
		// 추가
		Circle c03 = new Circle(30);
		cList.add(c03); // 3번방 추가

		// 출력
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}

		System.out.println("-----------------------");
		// 삭제
		cList.remove(1); // 1번방 삭제

		// 출력
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-----------------------");
		System.out.println(cList.toString()); // Circle의 toString이 출력, 삭제하면 Object의 toString이 출력 
	}
}
