package kimjr;
//Java 프로그래밍 - 예외 처리

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NotTenException extends RuntimeException {}//띄우고자 하는 메세지 + 상속

public class Exception {

 public static boolean checkTen(int ten) {
     if (ten != 10) {
         return false;
     }

     return true;
 }

 public static boolean checkTenWithException(int ten) {
     try {
         if (ten != 10) {
             throw new NotTenException();
         }
     } catch (NotTenException e) {
         System.out.println("e = " + e);
         return false;
     }

     return true;
 }

 public static boolean checkTenWithThrows(int ten) throws NotTenException {//예외 발생시 밖으로 내보냄
     if (ten != 10) {//함수를 호출한 쪽에서 고쳐줘야함
         throw new NotTenException();
     }

     return true;
 }

 public static void main(String[] args) throws IOException {

//   1. 예외
//   1-1. 0으로 나누기
     System.out.println("== 0으로 나누기 ==");
//   int a = 5 / 0;예외발생

     try {
        int a = 5 / 0;//예외 발생코드
     } catch (ArithmeticException e) {
         System.out.println("0으로 나누기 예외 발생");//위에거를 받아서 예외 발생시 출력
         System.out.println("e = " + e);
     } finally {//무조건 실행 예외발생 상관 없이
         System.out.println("1-1 연습 종료");
     }

//   1-2. 배열 인덱스 초과
     System.out.println("== 배열 인덱스 초과 ==");
     int[] b = new int[4];
//     b[4] = 1;

     try {
         b[4] = 1; //예외발생 코드
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("인덱스 초과!");//예외 발생시 출력
         System.out.println("e = " + e);
     }
     
//   1-3. 없는 파일 열기
     System.out.println("== 없는 파일 열기 ==");
//     BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


//   2. throw, throws
     System.out.println("== checkTen ==");
     boolean checkResult = Exception.checkTen(10);
     System.out.println("checkResult = " + checkResult);

     System.out.println("== checkTenWithException ==");
     checkResult = checkTenWithException(5);
     System.out.println("checkResult = " + checkResult);

     System.out.println("== checkTenWithThrows ==");
     try {
         checkResult = checkTenWithThrows(5);
     } catch (NotTenException e) {
         System.out.println("e = " + e);
     }
     System.out.println("checkResult = " + checkResult);

 }

}
