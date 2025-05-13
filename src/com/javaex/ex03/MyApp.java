package com.javaex.ex03;

public class MyApp {

	public static void main(String[] args) {
		// 포인트 리스트(포인트 전용)
		MyList<Point> pArr = new MyList<Point>();

		// 포인트
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		// 리스트에 포인트(주소) 담기
		pArr.add(p01);
		pArr.add(p02);
		pArr.add(p03);

		// 출력
		for (int i = 0; i < pArr.size(); i++) {
			System.out.println(pArr.get(i));
		}

		System.out.println("------------------------");		
		
		// 원 리스트
		MyList<Circle> cArr = new MyList<Circle>();

		// 원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);

		// 리스트에 원(주소) 담기
		cArr.add(c01);
		cArr.add(c02);
		cArr.add(c03);

		// 출력
		for (int i = 0; i < cArr.size(); i++) {
			System.out.println(cArr.get(i));
		}

	}

}
