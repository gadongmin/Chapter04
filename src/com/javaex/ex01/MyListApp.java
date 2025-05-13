package com.javaex.ex01;

import java.util.Arrays;

public class MyListApp {

	public static void main(String[] args) {
		/*
		// 배열
		// 배열의 갯수가 고정되어 있어 포인트가 늘어나면 배열도 수정해야하는 문제
		// 배열을 미리 많은 수를 설정해놓으면 낭비되는 문제
		Point[] pArr = new Point[3];

		// 포인트
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		// 배열에 포인트 주소 담기
		pArr[0] = p01;
		pArr[1] = p02;
		pArr[2] = p03;
		
		// System.out.println(Arrays.toString(pArr)); 배열안에 toString
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]); // toString 생략
		}
		*/
		
		// 리스트(포인트), 그릇
		PointList pList = new PointList();

		// 포인트, 반찬
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		// 리스트 포인트 추가, 반찬을 그릇담기
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		// 출력, 그릇에 담긴 반찬 꺼내기
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("-------------------");
		
		// 리스트(원)
		CircleList clist = new CircleList();

		// 원
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		Circle c03 = new Circle(5);

		// 리스트 원 추가
		clist.add(c01);
		clist.add(c02);
		clist.add(c03);

		// 출력
		for (int i = 0; i < clist.size(); i++) {
			System.out.println(clist.get(i));
		}

	}
}
