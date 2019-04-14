package com.practice.programs;

public class Q {
	int top,rear,size;
	int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q s=new Q();
		s.insert(2);
		s.insert(4);
		s.insert(10);
		s.printAll();
		s.pop();
		s.printAll();

	}
private void printAll() {
		// TODO Auto-generated method stub
	for(int i=top;i>=rear;i--)
		System.out.print(arr[i]);
	
	System.out.println();
		
	}
public Q(){
	top=-1;
	rear=0;
	size=100;
	arr=new int[size];
}
public void insert(int n){
	if(!isFull()){
		top++;
		arr[top]=n;
	}else{
		System.out.println("The queue is full");
	}
}
public int pop(){
	int element=0;
	if(!isempty()){
		element=arr[rear];
		rear++;
	}else{
		System.out.println("The Queue is empty");
	}
	return element;
}
private boolean isempty() {
	// TODO Auto-generated method stub
	if(rear>top)
	return true;
	
	return false;
}
private boolean isFull() {
	// TODO Auto-generated method stub
	if(top<=size)
	return false;
	
	return true;
}
}
