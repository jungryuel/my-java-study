package kimjr;
// Java 프로그래밍 - 입출력_2

import java.io.*;

public class IO2 {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
    	FileWriter fw = new FileWriter("./memo.txt");
    	String memo = "헤드라인\n";
    	fw.write(memo);
    	
    	memo = "1월 1일 날씨 맑음\n";
    	fw.write(memo);
    	
    	fw.close();
    	

//      PrintWriter
    	PrintWriter pw = new PrintWriter("./memo.txt");
    	memo = "헤드라인\n";
    	pw.println(memo);
    	
    	memo = "1월 1일 날씨 맑음";
    	pw.println(memo);
    	pw.close()
//      파일 이어 쓰기
    	FileWriter fw2 = new FileWriter("./memo.txt",true);//true를 붙이면 이어쓰기 하겠다는 표시
    	memo = "1월 2일 날씨 완전맑음\n";
    	fw2.write(memo);//데이터 밀어넣기
    	fw2.close();
    	
    	PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt",true));//매개변수안에 fileWriter를 집어넣어야함
    	memo = "1월 3일 날씨 또 맑음\n";
    	pw.println(memo);
    	pw.close();
//      2. 파일 입력
    	BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));
    	while(true) {
    		String line = br.readLine();
    		
    		if(line == null) {
    			break;
    		}
    		System.out.println(line);
    		br.close();
    		
    	}


    }
}
