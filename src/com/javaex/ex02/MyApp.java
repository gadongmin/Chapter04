package com.javaex.ex02;

public class MyApp {

	public static void main(String[] args) {
		// 각 종류별(포인트, 원)로 관리

		// 포인트 리스트
		MyList pList = new MyList();

		// 포인트
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		// 포인트 리스트에 포인트 추가
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		// 출력
		// System.out.println(pList.get(0));
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}

		System.out.println("--------------------");
		
		// 원 리스트
		MyList cList = new MyList();

		// 원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);

		// 원 리스트에 원 추가
		cList.add(c01);
		cList.add(c02);
		cList.add(p03); // 다른 종류가 들어와도 오류가 나지 않는다.

		// 출력
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
			// System.out.println(((Circle)cList.get(i)).getRadius());, 강제형변환
		}

	}

}
