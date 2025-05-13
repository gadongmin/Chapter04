package com.javaex.ex01;

public class CircleList {
	// 필드
	private Circle[] cArr; // 자동으로 추가, 삭제 진행
	private int crtPos; // 현재위치(화살표)
	// 생성자

	public CircleList() {
		cArr = new Circle[3]; // 그릇을 준비
		crtPos = 0; // 그릇 0번째부터 시작
	}

	// 메소드
	public void add(Circle c) {
		this.cArr[crtPos] = c; // 현재그릇에 반찬을 담고
		this.crtPos++; // 한칸씩 옆으로 옮긴다
	}

	public Circle get(int i) {
		return cArr[i]; // i번째 반찬을 꺼낸다.
	}

	public int size() {
		return crtPos; // 지금까지 저장된 반찬 확인
	}

}
