package algorithm;
//Practice1
//단순 연결 리스트 구현 완성
//중간에서도 추가 가능
class LinkedList2 extends LinkedList{
	LinkedList2(Node node){
	this.head = node;//부모클래스 멤버변수에 할당
	}
	
	//연결리스트 데이터 추가
	//이전 데이터가 없는경우 가장 뒤에 추가
	//이전 데이터 값이 있는 경우 해당 값을 가진 노드 앞에 추가
public void addData(int data,Integer beforeData) {
	if(this.head == null) {
		this.head = new Node(data,null);
	}else if (beforeData == null) {
		Node cur = this.head;
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = new Node(data, null);
		}else {
			Node cur = this.head;
			Node prev =cur;
			while(cur != null) {
				if(cur.data == beforeData) {//이전 데이터 값을 찾은경우
					if(cur == this.head) {
		//헤드에 방금들어온 노드 할당 다음 링크주소는 이전 헤드노드로
						this.head = new Node(data,this.head);	
					}else {//그 외 경우
						//노드 하나 생성 prev의 다음 노드는 cur으로	
						prev.next = new Node(data,cur);
					}
						break;
				}
				prev =cur;//cur의 이전 링크로
				cur = cur.next;//cur은 이동
				
			}
		}
	}
public void removeData(int data) {
	if(this.isEmpty()) {
		System.out.println("link is empty");
		return;
	}
	Node cur = this.head;//지울대상의 노드를 찾을 cur
	Node prev = cur;//하나 앞을 따라다님
	while(cur != null) {//cur 값이 없을 때 까지
		if(cur.data == data) {//찾는 값이 같다면
			if(cur == this.head) {//만약 헤드일 때
				this.head =cur.next;//헤드를 cur의 다음으로
			}else {//헤드가 아닐때
				prev.next = cur.next;//이전 데이터 링크를 자기 자신을 뛰어넘은 다음 노드로
			}
			break;
		}
		prev = cur;//이전 값은 cur의 링크
		cur = cur.next;//cur은
	}
}
}

public class linkPractice {
 public static void main(String[] args) {

//  Test code
   LinkedList2 myList = new LinkedList2(new Node(1, null));
     myList.showData();         // 1

   myList.addData(2);
    myList.addData(3);
     myList.addData(4);
    myList.addData(5);
     myList.showData();         // 1 2 3 4 5

     myList.addData(100, 1);
     myList.addData(200, 2);
     myList.addData(300, 3);
     myList.addData(400, 4);
     myList.addData(500, 5);
     myList.showData();         // 100 1 200 2 300 3 400 4 500 5

     myList.removeData(300);
     myList.removeData(100);
    myList.removeData(500);
     myList.removeData(200);
     myList.removeData(400);
    myList.showData();         // 1 2 3 4 5

   myList.removeData(3);
     myList.removeData(1);
     myList.removeData(5);
     myList.removeData(2);
     myList.removeData(4);
     myList.showData();         // List is empty!
 }
}