// Java 프로그래밍 - 조건문
public class zerobase6 {
	public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 99;

        if (waterTemperature >= 100) {
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다.");
        }

        int score = 90;
        char grade = 0;//등급을 0으로 초기화
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);


//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";
        switch (fruit) {//fruit은 입력값
            case "apple"://사과인 경우
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry"://블루베리인 경우
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default://둘 다 아닐경우
                System.out.println("해당 과일이 없습니다.");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;
        if (number % 2 == 0) {//홀짝 비교시 나머지연산 사용
            System.out.println("짝수 입니다!");
        } else {
            System.out.println("홀수 입니다!");
        }


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
        score=85;
        grade=0;
        switch(score/10) {
        case 10://이경우에는 탈출없이 A로
        case 9:
        	 grade='A';
        	 break;
        case 8:
       	 grade='B';
       	break;
        case 7:
       	 grade='C';
       	break;
       	 default:
       	 grade='F';
        	        }
        System.out.println("grade = " + grade);
        		
        
    }
}