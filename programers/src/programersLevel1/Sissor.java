package programersLevel1;
// 시저 암호
public class Sissor {

	public static void main(String[] args) {
		System.out.println(solution("abcdef ghi",1));
	}
	
	public static String solution(String s, int n) {
		String answer="";
		
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			
			if(a>=65 && a<=90) {
				if(a+n>90) {
					answer += (char)(a+n-26);
				}else {
					answer += (char)(a+n);
				}
			}else if(a>=97 && a<=122) {
				if(a+n>122) {
					answer += (char)(a+n-26);
				}else {
					answer += (char)(a+n);
				}
			}else {
				answer += (char)a;
			}
		}	
		
		return answer;
	}

}
