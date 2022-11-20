package Stack;
//Practice2
//괄호 짝 검사
//열고 닫을 때 짝이 맞을시 패스

//입출력 예시)
//입력: "("
//출력: Fail

//입력: ")"
//출력: Fail

//입력: "()"
//출력: Pass

import java.util.Stack;

public class Practice2 {
 public static void checkParenthesis(String str) {
Stack stack = new Stack();
boolean check = true;

for(String s : str.split("")){
		if(s.equals("(")) {
			stack.push(s);
		}else {
			if(stack.isEmpty()) {
		check = false;
		break;
			}else
				stack.pop();
		}
}
 
 if(check && stack.isEmpty()) {
	 System.out.println("pass");
	 
 }else {
	 System.out.println("fail");
 }
	 
 }

 public static void main(String[] args) {
     // Test code
     checkParenthesis("(");          // FAIL!
     checkParenthesis(")");          // FAIL!
     checkParenthesis("()");         // PASS!
     checkParenthesis("()()()");     // PASS!
     checkParenthesis("(())()");     // PASS!
     checkParenthesis("(((()))");    // FAIL!
 }
}
