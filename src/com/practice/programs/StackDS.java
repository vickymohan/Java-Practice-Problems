package com.practice.programs;

public class StackDS {
	int top;
	int size;
	int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDS s=new StackDS();
		s.insert(2);
		s.insert(4);
		s.insert(10);
		s.printAll();
		s.pop();
		s.printAll();

	}
	private void printAll() {
		// TODO Auto-generated method stub
		for(int i=top;i>=0;i--){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public StackDS(){
		top=-1;
		size=100;
		arr=new int[size];
	}
	
	public void insert(int n){
		if(!isFull()){
			top++;
			arr[top]=n;
		}else{
			System.out.println("The Stack is full");
		}
	}
	
	public int pop(){
		int element=0;
		if(!isempty()){
		element=arr[top];
		top--;
		}else{
			System.out.println("the stack is empty");
		}
		return element;
	}
	private boolean isempty() {
		// TODO Auto-generated method stub
		if(top<=-1)
			return true;
		return false;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		if(top>=size)
		return true;
		
		return false;
	}

}
