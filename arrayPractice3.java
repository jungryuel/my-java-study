package kimjr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class arrayPractice3 {
	    public static void solution(int[]arr, int k, int x) {
HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();//int차이값,list해당 절대값차이에 해당하는 값들을 이어줌 
	    	for (int i = 0; i < arr.length; i++) {
	    		int diff = Math.abs(x-arr[i]);//차이값 절대값으로
	    		
	    		ArrayList<Integer>cur=map.get(diff);//차이값 꺼내보기
	    		if(cur == null) {
	    			map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));//현재 해당 숫자값 입력
	    		}
	    		else {
	    			int idx = cur.size();
	    			for (int j = 0; j < cur.size(); j++) {
	    				if(cur.get(j)>arr[i]) {
	    					idx = j;
	    					break;
	    					
	    				}
						
					}
	    			cur.add(idx,arr[i]);
	    		}
				
			}
	    	ArrayList<Integer> result = new ArrayList<>();
	    	int cnt =0;
	    	while (map.size()>0) {
	    		int mindiff =map.keySet().stream().min((a,b)->a-b).get();//현재 들어있는 값들 중 가장 작은값
	    		ArrayList<Integer> cur =map.get(mindiff);//값 가져오기
				map.remove(mindiff);//해당 위치 값은 삭제
				
			 while(cur.size()>0) {
				 result.add(cur.get(0));
				 cur.remove(0);
				 cnt++;
				 if(cnt == k) {
					 break;
					 
				 }
			 }
			 if(cnt == k) {
				 break;
			 }
			}
	    	Collections.sort(result);
	    	System.out.println(result);
	    }

	    public static void main(String[] args) {
	        // Test code
	        int[] arr = {1, 2, 3, 4, 5};
	        solution(arr, 4, 3);

	        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        solution(arr, 5, 5);

	        arr = new int[]{2, 4};
	        solution(arr, 1, 3);

	        arr = new int[]{2, 4};
	        solution(arr, 3, 3);
	    }
	}

