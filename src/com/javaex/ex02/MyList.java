package com.javaex.ex02;

public class MyList {
	// 필드
	private Object[] oArr; // 자동으로 추가, 삭제 진행
	private int crtPos; // 현재위치(화살표)

	// 생성자
	public MyList() {
		oArr = new Object[3]; // 그릇 준비
		crtPos = 0; // 그릇 0부터 시작
	}

	// 메소드 일반
	public void add(Object o) {
		this.oArr[crtPos] = o; // 현재 그릇에 반찬을 담고
		this.crtPos++; // 그릇을 한칸씩 옮긴다
	}

	public Object get(int i) {
		return oArr[i]; // i번째 그릇의 반찬을 꺼내줍니다.
	}

	public int size() {
		return crtPos; // 지금까지 몇개의 반찬이 저장됐는지 확인
	}
}
