// Java 프로그래밍 - 변수와 자료형_3

import java.util.Locale;
public class zerobase2 {  
	public static void main(String[] args) {

//  1. 자료형 - 문자열
    System.out.println("== 문자열 ==");
    String s1 = "Hello World!";
    System.out.println("s1=" + s1);
    String s2 = "01234";
    System.out.println("s2=" + s2);

// 문자열 메소드
//  1-1. equals
    String s3 = "Hi";
    String s4 = "Hi";
    System.out.println(s3.equals(s4));
    System.out.println(s3 == s4);
    String s5 =new String("Hi");
    System.out.println(s3.equals(s5));//값을 비교 hi라는 값을 비교
    System.out.println(s3 == s5);//객체를 비교 new String 사용으로 새롭게 만들어져서 값이 다름


//  1-2. indexOf 특정문자열의 위치를 찾아준다
    String s6 ="Hello! World!";
    System.out.println(s6.indexOf("!"));//배열은 0번지부터 시작
    System.out.println(s6.indexOf("!", s6.indexOf("!")+1));//어디서부터 찾을건지
//  1-3. replace//
    String s7= s6.replace("Hello","Bye");
    System.out.println("s7=" + s7);

//  1-4. substring //기본의 문자열에서 구분문자열을 뽑아준다
    System.out.println(s7.substring(0,3));
    System.out.println(s7.substring(0,s7.indexOf("!")+1));

//  1-5. toUpperCase//대문자로 바꿔준다
    System.out.println(s7.toUpperCase());


//  2. 자료형 - StringBuffer//문자열의 변화가 빈번하게 발생할 때는 StringBuffer를 사용한다.
    System.out.println("== StringBuffer ==");
    StringBuffer sb1= new StringBuffer();
sb1.append("01234");
System.out.println("sb1=" + sb1);
sb1.append("56789");
System.out.println("sb1=" + sb1);

String a= "01234";
String b= "56789";

String bak = a;
System.out.println(a == bak);//t

a+=b;//a에 b를 더한값을 a에 저장
System.out.println(a);
System.out.println(a == bak);//f

//  3. 자료형 - 배열
    System.out.println("== 배열 ==");
    int[] Array1 = {1,2,3,4,5};
    System.out.println(Array1[0]);
    System.out.println(Array1[1]);
    System.out.println(Array1[2]);
    System.out.println(Array1[3]);
    System.out.println(Array1[4]);
    
    char[ ]Array2= {'a','b','c','d','e'};
    System.out.println(Array2[2]);
    
    
   String[]Array3 = new String[3];
   Array3[0] = "Hello";
   Array3[1] = " ";
   Array3[2] = "world!";
   System.out.println(Array3[0]+Array3[1]+Array3[2]);






	}
}
