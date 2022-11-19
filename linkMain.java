package algorithm;
//선형 자료구조 - 배열
// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드
class Node {
 int data; //값을 담을거
 Node next;//링크 관리 
 
 Node() {}
 Node(int data,Node next){
	 this.data = data;
	 this.next = next;
  }
}

class LinkedList {
    Node head;//헤드
    LinkedList(){}
    LinkedList(Node node){
    	this.head = node;
    }


    //  연결 리스트 비어있는지 확인
public boolean isEmpty() {
    if(this.head == null ) {
	return true;//null일경우
	}
	return false;//그외 경우
}

    //  연결 리스트의 맨 뒤에 데이터 추가
public void addData(int data) {
	if(this.head == null) {//노드가 null일경우
//헤드 쪽에 노드 생성 후 방금 들어온 데이터,다음링크는 아무것도 없으니까 null
		this.head = new Node(data,null);
	}else {//노드가 있으면
		Node cur = this.head;//cur이 헤드 데이터를 가르키게 함
		//헤드로 부터 노드들 순회하면서 끝까지
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = new Node(data, null);//방금 들어온 링크 연결
	}
}

    //  연결 리스트의 맨 뒤의 데이터 삭제
public void removeData() {
	if(this.isEmpty()) {//노드가 없으면
		System.out.println("list is empty");//출력
		return;
	}
	Node cur = this.head;
	Node prev = cur;//cur이전의 링크를 따라다닐 변수
	
	while(cur.next != null) {//cur로 이동
		prev = cur;//이전의 cur을 prev가 받음
		cur = cur.next;//next로 이동
	}
	if(cur == this.head) {//결과가 아무것도 없으면 널
		this.head = null;
	}else {//아니면 이전 값을 널로
		prev.next = null;
	}
	
	
}

    //  연결 리스트에서 데이터 찾기
public void findData(int data) {
	if(this.isEmpty()) {//없으면 없다 출력
		System.out.println("list is empty");
		return;
	}
	Node cur = this.head;
	while(cur != null) {//리스트 순회하면서 찾고자 하는 부분 있는지 탐색
		if(cur.data == data) {
			System.out.println("Data exist");
			return;
		}
		cur = cur.next;
	}
	System.out.println("data not found");
}

    //  연결 리스트의 모든 데이터 출력
public void showData() {
	if(this.isEmpty()) {//없으면 없다 출력
		System.out.println("list is empty");
		return;
	}
	Node cur = this.head;
	while(cur !=null) {
		System.out.println(cur.data +" ");
		cur =cur.next;
		}
      System.out.println();
	}
}


public class linkMain {

    public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));//헤드로 데이터 1을 가진 노드 생성
       myList.showData();      // 1

        myList.addData(2);//데이터 더해서 연결
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();//끝에서부터 지움
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2
//
        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty

    }

}
