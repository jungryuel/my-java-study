package kimjr;
// Practice
// 로또 번호 만들기

import java.util.*;

public class MakeLotto {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {//로또번호
            int num = (int)(Math.random() * 45) + 1;//번호 랜덤으로 (1부터 45까지 데이터)
            set.add(num);// 랜덤 데이터가 set에 들어감 중복되지 않는 데이터
        }

        LinkedList list = new LinkedList(set);//로또 출력 객체 생성
        Collections.sort(list);//오름차순으로 정렬
        System.out.println("로또 번호: " + list);
    }
}
