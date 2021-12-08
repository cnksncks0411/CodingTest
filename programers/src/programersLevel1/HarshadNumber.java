package programersLevel1;
// 하샤드 수
public class HarshadNumber {
	public boolean solution(int x) {
        boolean answer = true;
        int y=0;
        int t = x;
        while(t>0) {
        	y += t%10;
        	t = t/10;
        }
        if(x%y == 0) {
        	return answer;
        }else {
        	answer=false;
        }
        return answer;
    }
}
