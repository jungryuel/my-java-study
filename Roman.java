package kimjr;

import java.util.ArrayList;

public class Roman {
    public static String solution(String input, String cmd) {
       StringBuffer sb= new StringBuffer (input); // 문자열의 편집이 빈번할 때 유리한 StringBuffer 로 변환하여 사용
       ArrayList<String> cmdArr = new ArrayList<>();//cmd값을 받아서 처리할 값
       
       for (String s:cmd.split(" ")) {
    	   cmdArr.add(s);//cmd.split을 이용 ArrayListdp cmd를 만들기
    	   
       }
       int curSor =sb.length();// 명령어 배열의 인덱스로 사용할 변수 커서의 위치
       int cmdIdx = 0;//인덱스 변수
       while (cmdIdx != cmdArr.size()) {//인덱스가 가장 끝에 있는 커맨드 실행때까지
    	   String cur = cmdArr.get(cmdIdx);
    	   
    	   if(cur.equals("L")) {//왼쪽 커서 이동 
    		   curSor =Math.max(0, curSor-1); //음수로 가능경우에는 0		   
    	   }
    	   else if(cur.equals("D")) {//우측 커서 이동
    		   curSor =Math.min(sb.length(),curSor +1);//문자열 길이보다 길게는 못가도록
    	   }
    	   else if(cur.equals("B")) {//해당 부분 삭제
    		   if(curSor == 0) {//0일때
    			   cmdIdx++;//인덱스 증가
    			   continue;//다음 문자로 넘어가기
    		   }sb.delete(curSor-1, curSor);//delete이용 좌측에 있는 데이터 삭제
    		   curSor =Math.max(0, curSor-1);//좌측 이동시 처럼
    		   
    	   }
    	    else if (cur.equals("P")) {//데이터 삽입
    		   String s =cmdArr.get(++cmdIdx);//꺼낼때 마다 우측 이동
    		   sb.insert(curSor, s);//insert이용 커서위치에 문자 넣기
    		   curSor +=1;//커서 1증가
    	   }
    	   cmdIdx++;//반복문 돌 때 마다 걸리지 않으면 다음으로 이동
       }
       return sb.toString();//StringBuffer를 toString로 바꿔서 반환
    }

    public static void main(String[] args) {
        // test code
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
