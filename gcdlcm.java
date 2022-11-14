package algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class gcdlcm {
    public static void main(String[] args) {

//      1. 합의 법칙
        System.out.println("== 합의 법칙 ==");
//      두 개의 주사를 던졌을 때 합이 3 또는 4의 배수일 경우의 수

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;
        
        // 기본 풀이
        for (int item1 : dice1) {
        	for (int item2 : dice2) {
        		if((item1 + item2) %3 == 0) {
        			nA += 1;//3의 배수일 경우 A갯수를 1증가
        		}
        		if((item1 + item2) %4 == 0) {
        			nB += 1;//4의 배수일 경우 B갯수를 1증가
        		}
        		if((item1 + item2) %12 == 0) {
        			nAandB += 1;//공통 갯수 1증가
        		}
			}
			
		}
        System.out.println("결과:"+(nA + nB - nAandB));

        
        // HashSet 이용
        HashSet<ArrayList>allCase = new HashSet<>();
        for(int item1:dice1) {
        	for(int item2:dice2) {
        		if((item1+item2) %3 == 0||(item1 + item2)%4==0) {
        			//조건식 만족시 새로 만들어 주면서 두개의 눈금을 새로 리스트로 만들어 해시셋에 넣어줌
        			ArrayList list = new ArrayList(Arrays.asList(item1,item2));
        			allCase.add(list);
        		}
        	}
        }
        System.out.println("결과:"+ allCase.size());



//      2. 곱의 법칙
        System.out.println("== 곱의 법칙 ==");
//      두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        nA = 0;
        nB = 0;

        
        for (int item1: dice1) {
        	if(item1 % 3 == 0) {
        		nA++;
        	}
			
		}
        for (int item2: dice2) {
        	if(item2 % 4 == 0) {
        		nA++;
        	}
			
		}
        
        System.out.println("결과:"+ nA * nB);

    }
}