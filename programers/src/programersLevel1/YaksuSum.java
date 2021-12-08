package programersLevel1;
// 약수의 합
public class YaksuSum {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i=n; i>0; i--){
            if(n%i==0){
                answer += i;
            }
        }
        return answer;
    }

}
