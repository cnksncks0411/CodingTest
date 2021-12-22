package SkillCheck;

import java.util.ArrayList;

public class DeleteMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	list.add(arr[0]);
        }
        
        int min = 0;
        
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
