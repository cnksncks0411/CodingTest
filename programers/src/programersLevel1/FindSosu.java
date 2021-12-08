package programersLevel1;
// 소수 찾기 (에라토스테네스의 체)
import java.util.ArrayList;

public class FindSosu {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	
	public static int solution(int n) {
		 int answer = 0;
	     int[] arr = new int[n+1];      
	     arr[0] = arr[1] = 0; 
	      
	     for(int i=2; i<=n; i++) {
	    	 arr[i] = i;  
	     }
	 
	     for(int i=2; i<=(int)Math.sqrt(n); i++) {
	         if(arr[i]==0) {
	        	 continue; 
	         }
	         for(int j=i+i; j<=n; j+=i) {  
	        	 arr[j] = 0; 
	         }
	     }
	      
	     for (int i=0; i<arr.length; i++) {
	    	  if(arr[i]!=0) answer++;
	     }
	    
	     return answer;
	}
}
