package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Practice5
//배열 arr 의 값을 오름차순으로 출력

//입출력 예시)
//arr: 5, 3, 1, 4, 6, 1
//결과: 1, 1, 3, 4, 5, 6

public class arraySort {
 public static void main(String[] args) {
ArrayList arr = new ArrayList(Arrays.asList( 5, 3, 1, 4, 6, 1));
Collections.sort(arr);

System.out.println(arr);
 }
}



