package programersLevel1;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
public class Stringsort {

	public static void main(String[] args) {
		System.out.println(solution("AabcdZ"));
	}
	
	public static String solution(String s) {
		String answer="";
		char[] arr = new char[s.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			answer += arr[i];
		}
		return answer;
	}

}
