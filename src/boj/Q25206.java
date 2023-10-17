package boj;

import java.util.Scanner;

public class Q25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 총 전공학점
		double totalMajorScore = 0;
		// 총 학점
		double totalScore = 0;

		for (int i = 0; i < 20; i++) {
			// 과목명
			String subjectName = sc.next();
			// 학점
			double score = sc.nextDouble();
			// 등급
			String grade = sc.next();

			switch (grade) {
				case "A+":
					// 학점 * 과목 평점
					totalMajorScore += (score * 4.5);
					totalScore += score;
					break;
				case "A0":
					totalMajorScore += (score * 4.0);
					totalScore += score;
					break;
				case "B+":
					totalMajorScore += (score * 3.5);
					totalScore += score;
					break;
				case "B0":
					totalMajorScore += (score * 3.0);
					totalScore += score;
					break;
				case "C+":
					totalMajorScore += (score * 2.5);
					totalScore += score;
					break;
				case "C0":
					totalMajorScore += (score * 2.0);
					totalScore += score;
					break;
				case "D+":
					totalMajorScore += (score * 1.5);
					totalScore += score;
					break;
				case "D0":
					totalMajorScore += (score * 1.0);
					totalScore += score;
					break;
				case "F":
					totalMajorScore += (score * 0.0);
					totalScore += score;
					break;
				case "P":
					break;
			}

		}
		System.out.printf("%.6f", totalMajorScore/totalScore);

	}

}
