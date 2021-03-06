package argorism;

import java.io.InputStream;
import java.util.Scanner;

public class Stack {
	private int top;
	private int maxSize;
	private Object[] stackArray;

	//스택 생성, 스택의 최대 크기로 생성
	public Stack(int maxSize){
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1; //top은 -1로 초기화
	}

	//스택이 비어있는지 체크
	public boolean empty(){
		return (top == -1);
	}

	//스택이 꽉 찼는지 체크
	public boolean full(){
		return (top == maxSize-1);
	}

	// 스택에 item 입력
	public boolean push(Object item){
		if(full()){    
			System.out.println("Stack is FULL!!");
			return false;
		}    
		stackArray[++top] = item;
		return true;
	}

	// 스택의 가장 위의 데이터 제거
	public Object pop(){
		if(empty()){
			System.out.println("Stack is empty!!");
			return null;
		}else{
			Object item = stackArray[top];
			stackArray[top] = null;
			top--;
			return item;
		}
	}

	//스택 출력
	public void printStack(Stack stack){
		if(top != -1){
			for(int i = top; i<=top; i-- ){
				if(i == -1)
					break;
				System.out.println("| "+ stack.stackArray[i] +" |");
				System.out.println("------");            
			}        
		}else{
			System.out.println("스택 비어있음!");
		}    
	}

	public static void main(String[] args) {

		InputStream a = System.in;
		Scanner sc = new Scanner(a);

		System.out.println("스택 SIZE 입력 : ");
		int size = sc.nextInt();
		Stack arrayStack = new Stack(size); //create stack

		boolean flag = true;

		while(flag){
			menu();
			String s = sc.next();

			switch(s){
			case "1":
				System.out.print("PUSH : ");
				String data = sc.next();
				arrayStack.push(data);
				break;
			case "2":
				System.out.println("POP : " + arrayStack.pop());
				break;
			case "3":
				arrayStack.printStack(arrayStack);
				break;
			case "q":
			case "Q":
				flag = false;
				break;
			}
		}
	}
	public static void menu(){
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. STACK");
		System.out.println("Q. 종료");
	}
}




