package programersLevel1;
//정수 제곱근 판별
public class Pow {

	public static void main(String[] args) {
		long a = solution(16);
		System.out.println(a);
	}
	
	 public static long solution(long n) {
	        long answer = 0;
	        long i = 1;
	        while(i<=(n/2+1)){
	            if(n/i==i&&n%i==0){
	                answer=(i+1)*(i+1);
	                break;
	            }else {
	            	answer=-1;
	            }
	            i++;
	        }
	        return answer;
	    }

}
