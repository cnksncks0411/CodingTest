package programersLevel1;
// 문자열을 정수로 바꾸기
public class StringNum {

	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
	
	public static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

}
