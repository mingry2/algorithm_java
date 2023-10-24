package boj;

import java.util.Scanner;

public class Q2738 {
	static Scanner sc = new Scanner(System.in);

	// n과 m을 받아서 행렬을 만들어주는 메서드
	public static int[][] makeProcession(int n, int m) {
		int[][] pro = new int[n][m]; // 행렬 - 2차원 배열로 초기화

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				pro[i][j] = sc.nextInt();
			}
		}
		return pro;
	}

	public static void main(String[] args) {
		int n = sc.nextInt(); // 행값 받기
		int m = sc.nextInt(); // 열값 받기

		int[][] arr1 = makeProcession(n,m);
		int[][] arr2 = makeProcession(n,m);

		int[][] result = new int[n][m];

		// arr1, arr2 두 행렬을 더한 값을 result 결과 행렬에 담는다
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		// 결과 행렬 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
