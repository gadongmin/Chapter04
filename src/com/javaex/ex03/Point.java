package com.javaex.ex03;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 매소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 일반
	@Override // 이름 변경 시 삭제할 것
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}