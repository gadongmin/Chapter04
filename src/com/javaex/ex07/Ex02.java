package com.javaex.ex07;

//mini Lotto
import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		Set<Integer> iSet = new HashSet<Integer>();

		while (true) {
			if (iSet.size() == 6) { // iSet에 숫자가 6개면 끝
				break;
			}

			int no = (int) (Math.random() * 45) + 1;
			iSet.add(no); // 중복이면 안들어감
		}

		// 출력
		for (int no : iSet) {
			System.out.println(no);
		}

		System.out.println("-----------------------------");

		while (iSet.size() < 6) { // 0 ~ 5 까지 반복
			int r = (int) (Math.random() * 45) + 1;
			iSet.add(r);
		}
		System.out.println(iSet);

	}

}
