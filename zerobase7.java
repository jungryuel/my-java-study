// Java 프로그래밍 - 반복문
public class zerobase7 {
	 public static void main(String[] args) {

//	      1. 반복문 - for
	        System.out.println("== for ==");
//	      1-1. 기본 사용 방법
	        for (int i = 0; i < 5; i++) {
	            System.out.println(i);
	        }

	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < i + 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        for (int i = 0; i < 5; i++) {
	            if (i == 2) {
	                continue;//반복문이 continue를 만나면 다음으로 넘어감
	            }

	            for (int j = 0; j < i + 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        for (int i = 0; i < 5; i++) {
	            if (i == 2) {
	                break;//break는 바로 탈출
	            }

	            for (int j = 0; j < i + 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

//	      1-2. for each
	        System.out.println();
	        int[] nums = {1, 2, 3, 4, 5};//배열
	        for (int i = 0; i < nums.length; i++) {
	            System.out.println(nums[i]);
	        }

	        for(int num: nums) {  //nums는 반복하고자 하는 대상 좌측은 대상의 자료형+변수명
	            System.out.println(num);
	        }


//	      2. 반복문 - while
	        System.out.println("== while ==");
//	      2-1. while
	        System.out.println();
	        int i = 0;
	        while (i < 5) {
	            System.out.println(i++);
	        }

	        System.out.println();
	        i = 0;
	        while (i < 5) {
	            if (i == 2) {
	                i++;
	                continue;
	            }

	            System.out.println(i++);
	        }

	        System.out.println();
	        i = 0;
	        while (i < 5) {
	            if (i == 2) {
	                i++;
	                break;
	            }

	            System.out.println(i++);
	        }

//	      2-2. do-while
	        boolean knock = false;
	        do {
	            System.out.println("knock");
	        } while (knock);


//	      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//	      *  1
//	      *** 2
//	      ***** 4
//	      ******* 8
	        for (int m = 0; m < 8; m++) {
	            if (m%2 != 0) {
	                continue;//반복문이 continue를 만나면 다음으로 넘어감
	            }

	            for (int n = 0; n < m + 1; n++) {//별찍기 
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        
//	      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//	          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
	        int waterTemperature = 0;
	        while (waterTemperature < 100) {
	            waterTemperature++;

	            if (waterTemperature % 10 == 0) {
	                System.out.println(waterTemperature + "도 입니다.");
	            }
	        }

	    }
	}