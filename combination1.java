package algorithm;
//Practice
//1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 X, 중복 x)의 각 결과를 출력하시오

public class combination1 {
 void combination(int[] arr, boolean[] visited, int depth, int n, int r) {
     if (r == 0) {
         for (int i = 0; i < n; i++) {
             if (visited[i]) {//true 인 경우만
                 System.out.print(arr[i] + " ");
             }
         }
         System.out.println();
         return;
     }

     if (depth == n) {//끝까지 다 돌았을 때
         return;//리턴
     }

     visited[depth] = true;//호출부
     combination(arr, visited, depth + 1, n, r - 1);

     visited[depth] = false;//돌아왔을 때
     combination(arr, visited, depth + 1, n, r);
 }
 
 public static void main(String[] args) {
//   Test code
     int[] arr = {1, 2, 3, 4};
     boolean[] visited = {false, false, false, false};//0000

     combination1 p = new combination1();
     p.combination(arr, visited, 0, 4, 3);
 }
}