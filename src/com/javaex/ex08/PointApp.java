package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// 리스트
		Set<Point> pSet = new HashSet<Point>();

		// 포인트
		// 주소 x+y
		Point p01 = new Point(1, 2); // 진짜 주소 → 3
		Point p02 = new Point(10, 20); // 진짜 주소 → 30
		Point p03 = new Point(2, 1); // 진짜 주소 → 3
		Point p04 = new Point(1, 2); // 진짜 주소 → 3

		// 담기
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);

		// 출력

		System.out.println("------------------------------");		
		System.out.println(pSet.toString());
				
		System.out.println("------------------------------");
		for (Point p : pSet) {
			// System.out.println(p.getX() * p.getY());
			System.out.println(p.hashCode());
			System.out.println(p.toString());
		}

		
	}
	

}
