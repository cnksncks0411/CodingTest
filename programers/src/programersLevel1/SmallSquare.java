package programersLevel1;
// 최소 직사각형
import java.util.Arrays;

public class SmallSquare {

	public static void main(String[] args) {
	}

	public static int solution(int[][] sizes) {
        int answer = 0;
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++) {
        	max[i] = Math.max(sizes[i][0],sizes[i][1]);
        	min[i] = Math.min(sizes[i][0],sizes[i][1]);
        }
        Arrays.sort(max);
        Arrays.sort(min);
        answer = max[sizes.length-1]*min[sizes.length-1];
        return answer;
    }
}
