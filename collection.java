package kimjr;
// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

public class collection {

    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);//add로 데이터 하나씩 추가
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2));//그냥 2만 쓰면 0 1 2 해서 3을 지움 데이터를 지울 때는 integer.valueof로 지운다
        System.out.println("list1 = " + list1);
        list1.add(0, 10);//0번은 가장 앞
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));//데이터가 들어있는지 확인
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));//10의 인덱스위치 확인

//      1-2. LinkedList
        System.out.println("== LinkedList ==");//
        LinkedList list2 = new LinkedList();//객체 생성
        list2.add(1);//데이터 추가는 add
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10);//데이터 추가의 다른 방법 가장 처음에
        list2.addLast(20);//가장 마지막에
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1));//데이터 지울때 동일
        System.out.println("list2 = " + list2);
        list2.removeFirst();//처음꺼 지우기
        list2.removeLast();//마지막꺼 지우기
        System.out.println("list2 = " + list2);
        System.out.println("list2.size() = " + list2.size());


//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();//객체선언
        set1.add(1);//데이터 추가
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);//데이터 삭제 =바로 지우기 가능 값으로 인식하기 때문에
        System.out.println("set1 = " + set1);
        set1.add(2);//데이터 다시 넣기
        set1.add(3);
        System.out.println("set1 = " + set1);//중복된 값은 들어갈 수 없음
        System.out.println("set1.size() = " + set1.size());//size 출력가능
        System.out.println("set1.contains(2) = " + set1.contains(2));//데이터의 유무 확인가능

//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();//객체 생성
        set2.add(1);//데이터 추가
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2);//삭제 바로가능
        System.out.println("set2 = " + set2);
        set2.clear();//모든데이터 삭제
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15);
        System.out.println("set2 = " + set2);//중복값 들어갈 수 없음
        System.out.println("set2.first() = " + set2.first());//가장 처음
        System.out.println("set2.last() = " + set2.last());//마지막
        System.out.println("set2.lower(10) = " + set2.lower(10));//10보다 작은 값 출력
        System.out.println("set2.higher(10) = " + set2.higher(10));//10보다 큰 값 출력


//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");//데이터 입력은 put으로 키값고 데이터 입력
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);
        
        map1.remove(2);//지울때는 해당 키값
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1));//가져올때도 키값으로

//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");//데이터 입력은 put hashmap과 동일
        map2.put(5, "apple");
        map2.put(15, "mango");
        System.out.println("map2 = " + map2);

        System.out.println("map2.firstEntry() = " + map2.firstEntry());//처음 데이터 쌍으로
        System.out.println("map2.firstKey() = " + map2.firstKey());//처음 키값
        System.out.println("map2.lastEntry() = " + map2.lastEntry());//마지막 데이터 쌍으로 
        System.out.println("map2.lastKey() = " + map2.lastKey());//마지막 키값
        System.out.println("map2.lowerEntry(10) = " + map2.lowerEntry(10));//10보다 작은 데이터 쌍
        System.out.println("map2.higherEntry(10) = " + map2.higherEntry(10));//10보다 큰 데이터 쌍

    }
}

