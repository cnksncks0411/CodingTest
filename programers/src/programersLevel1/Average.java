package programersLevel1;
//평균 구하기
public class Average {
	public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        answer = answer/arr.length;
        return answer;
    }
}
