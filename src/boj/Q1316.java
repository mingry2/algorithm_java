package boj;

import java.util.Scanner;

public class Q1316 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 단어의 개수
		int n = sc.nextInt();

		int result = 0;

		// 개수 n만큼 단어를 입력받음
		for (int i = 0; i < n; i++) {

			if (check() == true) {
				result++;
			}
		}
		System.out.println(result);

	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			// 현재 알파벳
			int now = str.charAt(i);

			if (prev != now) {
				// 0~25 자리가 a~z 알파벳 자리
				// 해당 인덱스가 true인 경우는 해당 알파벳이 나왔다는 것
				// ex) a 자리인 [0]가 true라면 a는 한번 나온것
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}

			} else {
				continue;
			}
		}
		return true;
	}

}
