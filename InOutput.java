package kimjr;
	// Java 프로그래밍 - 입출력_1

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;

	public class InOutput {

	    public static void referInputStream() throws IOException {
//	      System.in
	        System.out.println("== System.in ==");
	        System.out.print("입력: ");
	        int a = System.in.read() - '0';//엔터키가 마지막에 남는다
	        System.out.println("a = " + a);
	        System.in.read(new byte[System.in.available()]);//엔터키가 남아서 다음 입력이 불가하기에 여기서 지워준다

//	      InputStreamReader
	        System.out.println("== InputStreamReader ==");
	        InputStreamReader reader = new InputStreamReader(System.in);//배열이 필요하다
	        char[] c = new char[3];
	        System.out.print("입력: ");
	        reader.read(c);//읽어오기
	        System.out.println(c);

//	      BufferedReader
	        System.out.println("== BufferedReader ==");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("입력: ");
	        String s1 = br.readLine();
	        System.out.println("s1 = " + s1);
	    }

	    public static void main(String[] args) throws IOException {

//	      1. 입력
//	      1-1. 다른 입력 방식 참고
//	        referInputStream();

//	      1-2. Scanner
	        System.out.println("== Scanner ==");
	        System.out.print("입력1: ");
	        Scanner sc = new Scanner(System.in);
	        System.out.println(sc.next());
	        sc.nextLine();

	        System.out.print("입력2: ");
	        System.out.println(sc.nextInt());//정수만
	        sc.nextLine();

	        System.out.print("입력3: ");
	        System.out.println(sc.nextLine());


//	      참고) 정수, 문자열 변환
	        int num = Integer.parseInt("12345");//정수형 문자를 정수로 형변환
	        String str = Integer.toString(12345);//문자열 정수를 문자로 형변환
	        
//	      2. 출력
	        System.out.println("== 출력 ==");
	        System.out.println("Hello");
	        System.out.println("World!");

	        System.out.print("Hello ");
	        System.out.print("World!");

	        System.out.printf("Hello ");//포맷format
	        System.out.printf("World!");
	        System.out.println();

	        String s = "자바";
	        int number = 3;

	        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
	        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);//f는 줄 바꿈을 해줘야함 \n

	        System.out.printf("%d\n", 10);//2진수
	        System.out.printf("%o\n", 10);//8
	        System.out.printf("%x\n", 10);//16

	        System.out.printf("%f\n", 5.2f);//소수점
	        
	        System.out.printf("%c\n", 'A');//문자
	        System.out.printf("%s\n", "안녕하세요");//문자열

	        System.out.printf("%5d\n", 123);//줄 맞추기 우정렬 -%5d\n = 좌정렬
	        System.out.printf("%5d\n", 1234);
	        System.out.printf("%5d\n", 12345);

	        System.out.printf("%.2f\n", 1.126123f);//소수점 2자리까지 만큼
	    }
	}