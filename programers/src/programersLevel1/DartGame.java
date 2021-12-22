package programersLevel1;

import java.util.ArrayList;

// 다트 게임
public class DartGame {

	public static void main(String[] args) {
		int aa = solution("10D10S*3S");
		System.out.println(aa);
	}
	
	public static int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> round = new ArrayList<Integer>();
        String score = dartResult.replaceAll("[^0-9]", "");
        int cnt = 0;

        for(int i=0; i<score.length(); i++) {
        	if(score.charAt(i)=='1' && score.charAt(i+1)=='0') {
        		round.add(10);
        		i++;
        	}else {
        		round.add(Character.getNumericValue(score.charAt(i)));
        	}
        }
        
        dartResult += "A";
        for(int j=0; j<dartResult.length()-1; j++) {
        	if(dartResult.charAt(j)<48 || dartResult.charAt(j)>57) {
        		if(dartResult.charAt(j)=='S') {
            		round.set(cnt,round.get(cnt));
            		if(dartResult.charAt(j+1)!=42 && dartResult.charAt(j+1)!=35) {
                		cnt++;
                	}
            	}else if(dartResult.charAt(j)=='D') {
            		round.set(cnt,round.get(cnt)*round.get(cnt));
            		if(dartResult.charAt(j+1)!=42 && dartResult.charAt(j+1)!=35) {
                		cnt++;
                	}
            	}else if(dartResult.charAt(j)=='T') {
            		round.set(cnt,round.get(cnt)*round.get(cnt)*round.get(cnt));
            		if(dartResult.charAt(j+1)!=42 && dartResult.charAt(j+1)!=35) {
                		cnt++;
                	}
            	}else if(dartResult.charAt(j)>47 && dartResult.charAt(j)<58) {
            		continue;
            	}else if(dartResult.charAt(j)==42) {
            		if(cnt>0) {
            			round.set(cnt,round.get(cnt)*2);
            			round.set(cnt-1, round.get(cnt-1)*2);
            			cnt++;
            		}else {
            			round.set(cnt,round.get(cnt)*2);
            			cnt++;
            		}
            	}else if(dartResult.charAt(j)==35) {
            		round.set(cnt,round.get(cnt)*-1);
            		cnt++;
            	}
        	}
        }

        answer += round.get(0)+round.get(1)+round.get(2); 
        
        return answer;
    }

}
