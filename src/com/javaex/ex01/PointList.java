package com.javaex.ex01;

public class PointList {
	// 필드
	private Point[] pArr; // 자동으로 추가, 삭제 진행
	private int crtPos; // 현재위치(화살표)
	
	// 생성자
	public PointList() {
		pArr = new Point[3]; // 그릇 준비
		crtPos = 0; // 그릇 0부터 시작
	}

	// 메소드 일반
	public void add(Point p) {
		this.pArr[crtPos] = p; // 현재 그릇에 반찬(Point)을 담고
		this.crtPos++; // 그릇을 한칸씩 옮긴다
	}

	public Point get(int i) {
		return pArr[i]; // i번째 그릇의 반찬(Point)을 꺼내줍니다.
	}
	
	public int size() {
		return crtPos; // 지금까지 몇개의 반찬(Point)이 저장됐는지 확인
	}
}
