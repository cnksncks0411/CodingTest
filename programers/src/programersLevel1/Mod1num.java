package programersLevel1;
// 나머지가 1이 되는 수 찾기
public class Mod1num {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	public static int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<n; i++) {
        	if(n%i==1) {
        		answer=i;
        		break;
        	}
        }
        
        return answer;
    }
}
