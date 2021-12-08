package programersLevel1;
//x만큼 간격이 있는 n개의 숫자
public class TermNumber {

	public static void main(String[] args) {
		System.out.println(solution(3,5));

	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = x;
        for(int i=0; i<n; i++){
            answer[i] = a;
            a += x;
        }
        return answer;
    }

}
