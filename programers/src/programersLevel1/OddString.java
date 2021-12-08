package programersLevel1;
//이상한 문자 만들기
import java.util.ArrayList;

public class OddString {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split(""); // {try,hello,world}
		int word = 0;

		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(" ")) {
				word=0;
			}else {
				if(word%2==0) {
					word++;
					arr[i]=arr[i].toUpperCase();
				}else {
					word++;
					arr[i]=arr[i].toLowerCase();
				}
			}
			answer+=arr[i];
		}
		return answer;
	}

}
