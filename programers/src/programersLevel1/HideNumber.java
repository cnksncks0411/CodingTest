package programersLevel1;
//핸드폰 번호 가리기
public class HideNumber {
	public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++) {
        	answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}
