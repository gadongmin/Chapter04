package com.javaex.ex06;

import java.util.ArrayList;
import java.util.List;

public class TriangleApp {
	public static void main(String[] args) {
		// 리스트
		List<Triangle> tList = new ArrayList<Triangle>();
		// List<Triangle> tList = new LinkedList<Triangle>();

		// Triangle
		Triangle t01 = new Triangle(3, 3);
		Triangle t02 = new Triangle(4, 4);
		Triangle t03 = new Triangle(5, 5);

		// 담기
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);

		// 출력
		for (int i = 0; i < tList.size(); i++) {
			System.out.println(tList.get(i));
		}

		System.out.println("--------------------------------");

		System.out.println(tList.get(1).getX());
		System.out.println(tList.get(1).getY());

		System.out.println("--------------------------------");

		tList.remove(1);
		System.out.println(tList.toString());
		System.out.println(tList.size());

		System.out.println("--------------------------------");
		// 3 6 9
		// 리스트
		// List<int> iList = new ArrayList<int>();, 기본자료형 사용불가
		List<Integer> iList = new ArrayList<Integer>();

		/* 기본 자료형(8개, int..)
		Integer i01 = 3; // 생략가능
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);
		*/
		
		// 담기, Boxing
		iList.add(3);
		iList.add(6);
		iList.add(9);

		// 출력
		System.out.println(iList.toString());
		System.out.println("--------------------------------");
		for (int i = 0; i < iList.size(); i++) {
			System.out.println(iList.get(i));
		}

	}
}
