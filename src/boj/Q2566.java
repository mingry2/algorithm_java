package boj;

import java.util.Scanner;

public class Q2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j;

		// 최댓값
		int max = 0;

		// 최댓값의 행, 렬
		int x = 1, y = 1;

		int arr[][] = new int[9][9];

		// 9*9 랜덤 수의 행렬
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 행렬 중 최댓값과 그 행,렬
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					x = i + 1; // 인덱스 값 + 1
					y = j + 1;
				}
			}
		}

		sc.close();

		System.out.println(max);
		System.out.println(x + " " + y);
	}

}
