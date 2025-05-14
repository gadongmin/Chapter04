package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// 준비
		Map<String, Point> pMap = new HashMap<String, Point>();

		// 포인트
		Point p01 = new Point(2, 4);
		Point p02 = new Point(2, 4);
		Point p03 = new Point(43, 78);

		// Map에 포인트(주소) 담기, Key가 중복지 않게 해준다.
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);

		// 출력
		System.out.println(pMap.size()); // 갯수확인
		System.out.println("---------------------------------");

		// pMap의 toString
		System.out.println(pMap.toString());
		System.out.println("---------------------------------");

		// 박명수의 toString
		System.out.println(pMap.get("박명수"));
		System.out.println(pMap.get("박명수").getX());
		System.out.println("---------------------------------");

		// 박명수 정보 삭제
		pMap.remove("박명수");
		System.out.println(pMap.toString());
		System.out.println("---------------------------------");

		// 서장훈 추가
		Point p04 = new Point(100, 150);
		pMap.put("서장훈", p04);
		System.out.println(pMap.toString());
		System.out.println("---------------------------------");

		// 중복입력(같은 Key), 기존(2,4) 값을 새로운(90,80) 값으로 덮어씀
		Point p05 = new Point(90, 80);
		pMap.put("이효리", p05);
		System.out.println(pMap.toString());
		System.out.println("---------------------------------");

		// 전체 출력
		// 1. Key Set를 요청한다.
		Set<String> keys = pMap.keySet();
		// 2. Key Set의 Key를 1개씩 출력한다.(향상된 for문 사용)
		for (String name : keys) { // Key를 담는 그릇(name)를 설정
			System.out.println(pMap.get(name)); // pMap에 name으로 출력
		}
		System.out.println("---------------------------------");

		HashMap<String, String> bMap = new HashMap<String, String>();

		bMap.put("title", "게시판 제목 입니다.");
		bMap.put("date", "2025-05-14");
		bMap.put("id", "jus");
		bMap.put("content", "게시판 글 내용입니다.");

		System.out.println(bMap.get("title"));
		System.out.println(bMap.get("date"));
		System.out.println("---------------------------------");

		Set<String> names = bMap.keySet();
		for (String name : names) {
			System.out.println(bMap.get(name));
		}
		System.out.println("---------------------------------");

	}

}
