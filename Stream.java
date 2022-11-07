package kimjr;
//Java 프로그래밍 - 스트림

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

 public static void main(String[] args) {

//   1. 스트림 생성

//   1-1. 배열 스트림
     System.out.println("== 배열 스트림 == ");
     String[] arr = new String[]{"a", "b", "c"};

     System.out.println("== fori ==");
     for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
     }

     System.out.println("== forEach ==");
     for (String item: arr) {
         System.out.println(item);
     }

     System.out.println("== Stream ==");//
     Stream stream1 = Arrays.stream(arr);//스트림으로  배열을 변환
     stream1.forEach(System.out::println);//출력 foreach로

//   1-2. 컬렉션 스트림
     System.out.println("== 컬렉션 스트림 ==");
     ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));//
     System.out.println("list1 = " + list1);

     Stream stream2 = list1.stream();//스트림으로 변환
     //stream2.forEach(System.out::println);//똑같이 출력
     stream2.forEach(num -> System.out.println("num = " + num));

//   1-3. 스트림 builder
     System.out.println("== 스트림 builder ==");
     Stream streamBuild = Stream.builder().add("1").add("2").add("3").build();//스트림 생성
     streamBuild.forEach(System.out::println);//출력


//   1-4. 스트림 generate
     System.out.println("== 스트림 generate ==");
     Stream streamGenerate = Stream.generate( () -> "abc" ).limit(3);//데이터를 limit만큼 반복해서 만들어준다
     streamGenerate.forEach(System.out::println);


//   1-5. 스트림 iterate
     System.out.println("== 스트림 iterate ==");
     Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);//n은 10 limit만큼 반복
     streamIterate.forEach(System.out::println);


//   1-6. 기본 타입 스트림
     System.out.println("== 기본타입 스트림 ==");
     IntStream intStream = IntStream.range(1, 5);//1~4까지 n~ n-1
     intStream.forEach(System.out::println);


//   2. 스트림 중개 연산

//   2-1. Filtering
     System.out.println("== Filtering ==");
     IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0);//짝수값만 1~9까지
     intStream2.forEach(System.out::println);

//   2-2. Mapping
     System.out.println("== Mapping ==");
     IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);//1~9까지 +1
     intStream3.forEach(n -> System.out.print(n + " "));
     System.out.println();

//   2-3. Sorting
     System.out.println("== Sorting ==");
     IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();//
     IntStream intStreamSort = intStream4.sorted();//오름차순 정렬
     intStreamSort.forEach(System.out::println);


//   3. 최종 연산

//   3-1. Sum, Average
     System.out.println("== sum, average ==");
     int sum = IntStream.range(1, 5).sum();//1~4까지 더하기
     double average = IntStream.range(1, 5).average().getAsDouble();//1~4까지평균 실수 값으로

     System.out.println(sum);
     System.out.println(average);


//   3-2. Min, Max
     System.out.println("== min, max ==");
     int min = IntStream.range(1, 5).min().getAsInt();//최소 정수값으로
     int max = IntStream.range(1, 5).max().getAsInt();//최대 
     System.out.println(min);
     System.out.println(max);


//   3-3. reduce
     System.out.println("== reduce ==");
     Stream<Integer> stream3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5)).stream();//정수형으로 고정  1,2,3,4,5
     System.out.println(stream3.reduce((x, y) -> x + y).get());//연쇄 합((1+2)+3)+4)+5)


//   3-4. forEach
     System.out.println("== forEach == ");
     IntStream.range(1, 10).filter(n -> n == 5).forEach(System.out::println);//같은데이터 뽑기

 }
}

