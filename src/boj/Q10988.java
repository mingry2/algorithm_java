package boj;

// boj 10988 팰린드롬인지 확인하기
public class Q10988 {
	public int solution(String str) {
		int answer = 0;

		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();

		if (reverse.equals(str)) {
			answer = 1;
		} else {
			return answer;
		}

		return answer;
	}

	public static void main(String[] args) {
		Q10988 q = new Q10988();

		String str = "level";

		System.out.println(q.solution(str));

	}

}
