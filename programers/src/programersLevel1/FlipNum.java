package programersLevel1;
//자연수 뒤집어 배열로 만들기
public class FlipNum {

	public static void main(String[] args) {
//		int[] aa = solution(12345);
//		for(int a : aa) {
//			System.out.println(a);
//		}
		System.out.println(solution(123456));
	}
	
	public static int[] solution(long n) {
		int[] answer = {};
		String num = String.valueOf(n);
		answer = new int[num.length()];

		for(int i=0; i<num.length();i++) {
			answer[i]=(int)(n%10);
			n/=10;
		}

		return answer;
	}

}
