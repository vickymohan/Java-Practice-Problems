package com.practice.programs;

public class ParanthesisBalancing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParanthesisBalancing bal = new ParanthesisBalancing();
		String exp[] = {"{","[","]","}","("};
        if (bal.balance(exp))
          System.out.println("Balanced ");
        else
          System.out.println("Not Balanced ");  
  
	}
private int top,size;
private String[] arr;
public ParanthesisBalancing(){
	top=1;
	size=100;
	arr=new String[size];
}
public void insert(String a){
	if(!isFull()){
		top++;
		arr[top]=a;
	}else{
	System.out.println("The stack is full"); 
	}
}
public String pop(){
	String element = null; 
	if(!isEmpty()){
		element = arr[top];
		top--;
		System.out.println("the popped element is"+element);
	}
	else{
	System.out.println("the stack is empty");
	}
	return element;
}
public boolean isEmpty(){
	if(top != -1){
		return false;
	}
	return true;
}

public boolean isFull(){
	if(top==(size-1)){
		return true;
	}
	return false;
}
private boolean isMatching(String a,String b){
	if(a.equals("(")&&b.equals(")")){
		return true;
	}
	else if(a.equals("{")&&b.equals("}")){
		return true;
	}
	else if(a.equals("[")&&b.equals("]")){
		return true;
	}
	return false;
}
public boolean balance(String[] s){
	for(int i=0;i<s.length;i++){
		if(s[i].toString().equalsIgnoreCase("{") || s[i].toString().equalsIgnoreCase("(")
				|| s[i].toString().equalsIgnoreCase("[")){
		insert(s[i]);
		}
		if(s[i].toString().equalsIgnoreCase("}") || s[i].toString().equalsIgnoreCase(")")
				|| s[i].toString().equalsIgnoreCase("]")){
			 if(!isMatching(pop(), s[i].toString())){
			return false;
		}
		}
		}
	if(top==1)
	return true;
	else
	return false;

}
}
