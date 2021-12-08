package programersLevel1;
// 수박수박수박수박수박수?
public class Subak {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2==1) {
        		answer += "수";
        	}else {
        		answer += "박";
        	}
        }
        return answer;
    }

}
