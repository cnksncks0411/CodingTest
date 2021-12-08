package programersLevel1;

import java.util.ArrayList;

//제일 작은 수 제거하기
public class DeleteMin {
	public int[] solution(int[] arr) {
        int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		int min=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[min]>arr[i]) {
				min = i;
			}
		}
		list.remove(min);
		
		if(list.size()<1) {
			list.add(-1);
		}
		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}
