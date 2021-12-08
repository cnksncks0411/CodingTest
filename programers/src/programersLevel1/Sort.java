package programersLevel1;
//정수 내림차순으로 배치하기
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		System.out.println(solution(4654542));
	}
	
	public static long solution(long n) {
		long answer=0;
		String num = String.valueOf(n); 
		String ansnum = ""; 
		
		char [] arr = new char[num.length()]; 
		for (int i = 0; i < num.length(); i++) { 
			arr[i] += num.charAt(i); 
		} 
		
		Arrays.sort(arr); 
		for (int i = arr.length-1; i >= 0; i--) {
			ansnum += arr[i];
		} 
		answer = Long.parseLong(ansnum); 
		return answer;

	}

}
