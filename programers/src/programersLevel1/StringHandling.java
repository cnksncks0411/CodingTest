package programersLevel1;
//문자열 다루기 기본
public class StringHandling {

	public static void main(String[] args) {
		System.out.println(solution("12234"));
	}
	
	public static boolean solution(String s) {
        boolean answer = false;
        
        try {
        	if(s.length()==4 || s.length()==6) {
            	if(Integer.parseInt(s)>=0) {
            		answer = true;
            	}
            }else {
            	answer = false;
            }
		} catch (Exception e) {
			answer=false;
		}
        
        return answer;
    }

}
