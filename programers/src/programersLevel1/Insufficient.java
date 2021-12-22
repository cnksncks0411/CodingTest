package programersLevel1;
//부족한 금액 계산하기
public class Insufficient {

	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}

	public static long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;
        
        for(int i=1; i<=count; i++) {
        	pay += price*i;
        }
        answer = pay-money;
        if(pay<money) {
        	answer = 0;
        }
        return answer;
    }
}
