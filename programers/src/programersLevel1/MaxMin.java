package programersLevel1;
//최대 공약수와 최소 공배수 구하기
public class MaxMin {

	public static void main(String[] args) {
		int[] answer = solution(2,5);
		System.out.println(answer[0]+","+answer[1]);
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = {n,m};
		for(int i=1; i<=Math.min(n, m); i++) {	//최대 공약수
			if(n%i==0 && m%i==0) {
				answer[0] = i;
			}
		}
		int max = Math.max(n, m);
		while(true) {	//최소 공배수
			if(max%n==0 && max%m==0) {
				answer[1] = max;
				break;
			}else {
				max++;
			}
		}
		
		return answer;
	}

}
