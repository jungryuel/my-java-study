package algorithm;
//Practice2
//양방향 연결 리스트 (Doubly Linked List) 구현

class NodeBi {
	int data;
	NodeBi next;
	NodeBi prev;
	
	NodeBi(int data ,NodeBi next, NodeBi prev){
		this.data =data;
		this.next =next;
		this.prev =prev;
	}
}
class DoublyLinkedList extends LinkedList{
NodeBi head;
NodeBi tail;

DoublyLinkedList(NodeBi node){
	this.head = node;
	this.tail = node;
	}
public boolean isEmpty() {
	if(this.head == null) {
		return true;
	}
	return false;
}
public void addData(int data ,Integer beforeData) {
	if(this.head == null){
		this.head = new NodeBi(data,null,null);
		this.tail = this.head;
	}else if(beforeData == null) {
		this.tail.next = new NodeBi(data,null,null);
		this.tail = this.tail.next;
	}else {
		NodeBi cur = this.head;//찾을대상 cur로
		NodeBi pre = cur;//이전대상 찾기
		while(cur != null) {//반복문
			if(cur.data == beforeData) {//찾았을 때
				if(cur == this.head) {//헤드라면
					this.head = new NodeBi(data,this.head,null);//기존 헤드는 새로운 노드
					this.head.next.prev = this.head;//새로만든 헤드와 전 헤드를 양방향으로 가르킬수 있게
				}else {
					pre.next = new NodeBi(data,cur,pre);
					cur.prev = pre.next;
				}
				break;
			}
			pre = cur;
			cur = cur.next;
		}
	}
}


public void removeData(int data) {
	if(this.isEmpty()) {
		System.out.println("empty");
		return;
	}
	NodeBi cur = this.head;
	NodeBi pre = cur;
	while(cur != null) {
		if(cur.data == data) {
	if(cur == this.head && cur == this.tail) {//지우려는 대상이 헤드거나 테일 일 경우
		this.head = null;
		this.tail = null;
	}else if(cur == this.head) {//헤드인 경우
		this.head = cur.next;//헤드는 다음으로
		this.head.prev = null;//이전은 널==삭제
	}else if(cur == this.tail) {
		this.tail = this.tail.prev;//테일은 이전 테일로
		this.tail.next =null;//삭제
	}else {//중간노드 삭제
		pre.next = cur.next;
		cur.next.prev =pre;//찾은 값 이전은 중간노드 자동삭제
	}
	break;
}
pre = cur;
cur =cur.next;

		}
	}

public void showData() {
	if(this.isEmpty()) {
		System.out.println("empty");
		return;
	}
	NodeBi cur = this.head;
	while(cur != null) {
		System.out.print(cur.data);
		cur = cur.next;
	}
	System.out.println();
}
public void showDataFromTail() {
	if(this.isEmpty()) {
		System.out.println("empty");
		return;
	}
	NodeBi cur = this.tail;
	while(cur != null) {
		System.out.print(cur.data);
		cur = cur.prev;
	}
	System.out.println();
}


public class linkMain2 {
 public static void main(String[] args) {

//   Test code
     DoublyLinkedList myList = new DoublyLinkedList(new NodeBi(1, null, null));
     myList.showData();          // 1

     myList.addData(2, null);
     myList.addData(3, null);
     myList.addData(4, null);
     myList.addData(5, null);
     myList.showData();          // 1 2 3 4 5
     myList.showDataFromTail();  // 5 4 3 2 1

     myList.addData(100, 1);
     myList.addData(200, 2);
     myList.addData(300, 3);
     myList.addData(400, 4);
     myList.addData(500, 5);
     myList.showData();          // 100 1 200 2 300 3 400 4 500 5
     myList.showDataFromTail();  // 5 500 4 400 3 300 2 200 1 100

     myList.removeData(300);
     myList.removeData(100);
    myList.removeData(500);
     myList.removeData(200);
   myList.removeData(400);
     myList.showData();          // 1 2 3 4 5
     myList.showDataFromTail();  // 5 4 3 2 1

     myList.removeData(3);
    myList.removeData(1);
    myList.removeData(5);
     myList.removeData(2);
    myList.removeData(4);
    myList.showData();          // List is empty!
    myList.showDataFromTail();  // List is empty!
 		}
	}
}

