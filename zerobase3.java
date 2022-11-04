import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
public class zerobase3 {

	public static void main(String[] args) {
		//1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
		ArrayList l1 = new ArrayList();

//      1-1. add
l1.add(1);
l1.add("Hello");
l1.add(2);
l1.add(3);
l1.add(4);
l1.add("world!");
System.out.println("l1 ="+l1);

l1.add(0,1);//0번째 인덱스에 1의값을 넣는다.
System.out.println("l1 ="+l1);


//      1-2. get
System.out.println(l1.get(0));//l1의 0번째 인덱스의 값을 꺼내온다
System.out.println(l1.get(3));

//      1-3. size
System.out.println(l1.size());//l1에 값이 들어있는 갯수만큼 값이 출력



//      1-4. remove
System.out.println(l1.remove(0));//0번째 인덱스 위치의 값을 지운다
System.out.println("l1 ="+l1);

System.out.println(l1.remove(Integer.valueOf(2)));//리스트내의 2라는 값을 지운다

//      1-5. clear//리스트 내 모든 데이터를 지운다
l1.clear();
System.out.println("l1 ="+l1);


//      1-6. sort 정렬
ArrayList l2 = new ArrayList();
l2.add(5);
l2.add(3);
l2.add(4);
System.out.println("l2 ="+l2);

l2.sort(Comparator.naturalOrder()); //오름차순 정렬
System.out.println("l2 ="+l2);
l2.sort(Comparator.reverseOrder()); //내림차순 정렬
System.out.println("l2 ="+l2);

//      1-7. contains 데이터가 리스트에 들어있는지 체크

System.out.println(l2.contains(1));
System.out.println(l2.contains(3));


//      2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();


//      2-1. put map에 값을 넣어줌 순서는중요하지 않다
map.put("kiwi", 9000);
map.put("apple", 10000);
map.put("mango", 12000);
System.out.println("map ="+map);

//      2-2. get
System.out.println(map.get("mandarine"));//null
System.out.println(map.get("kiwi"));//9000출력


//      2-3. size
System.out.println(map.size());

//      2-4. remove
System.out.println(map.remove("mandarine"));//값이 없기 때문에 null출력 
System.out.println(map.remove("kiwi"));//지우면서 해당하는 값인 9000출력 
System.out.println("map ="+map);

//      2-5. containsKey 해당 키 값이 맵에 있는지
System.out.println(map.containsKey("apple"));//있으면 true
System.out.println(map.containsKey("kiwi"));//없으면 false

//      3. Generics 자료형 제한
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 ="+l3);
        
        ArrayList<String> l4 = new ArrayList<String>();
     //l4.add(1); 문자열만 받기 때문에 오류 
        l4.add("hello");
        System.out.println("l4 ="+l4);
        
        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple",10000);
        System.out.println("map1 ="+map1);
        
        
        
        
        
        HashMap <String,Integer> map2 = new HashMap<>();
        //map2.put(123,"id");문자열과 정수를 받기로 했는데 순서가 바뀌기에 오류
        System.out.println("map2 ="+map2);
        


    }

}
