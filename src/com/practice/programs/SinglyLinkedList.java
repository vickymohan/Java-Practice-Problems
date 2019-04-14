package com.practice.programs;

public class SinglyLinkedList {
Node head;
class Node{
	int value;
	Node next;
	public Node(){
		next=null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(2);
		list.insert(4);
		list.insert(10);
		list.insert(4);
		list.insert(21);
		list.insert(13);
		SinglyLinkedList list2=new SinglyLinkedList();
		list2.insert(7);
		list2.insert(67);
		list2.insert(143);
		list2.insert(76);
		list2.insert(290);
		list2.insert(3);
		System.out.println("printing list1");
		list.printAll();
		System.out.println("printing list2");
		list2.printAll();
		/*list.remove(10);
		list.printAll();*/
		list.reverseSinglyLL();
		System.out.println("printing after reversing");
		list.printAll();
		System.out.println("printing Kth Node from last");
		list.printKthNodeFromlast(2);
		System.out.println("after merging alternatively");
		list.merge(list2);
		list.printAll();

	}
	
	private void merge(SinglyLinkedList list2) {
		// TODO Auto-generated method stub
		Node curr_p=head;
		Node curr_q=list2.head;
		Node next_p;
		Node next_q;
		while(curr_p!=null&&curr_q!=null){
			next_p=curr_p.next;
			next_q=curr_q.next;
			
			curr_q.next=next_p;
			curr_p.next=curr_q;
			
			curr_q=next_q;
			curr_p=next_p;
			
		}
		list2.head=curr_q;
	}

	public void printKthNodeFromlast(int k) {
		// TODO Auto-generated method stub
		int count=0;
		Node temp=head;
		while(temp!=null){
			temp=temp.next;
			count++;
			
		}
		if(count<k)
			return;
		temp=head;
		for(int i=1;i<count-k+1;i++)
			temp=temp.next;
		System.out.println(temp.value);
	}

	public void remove(int n){
		Node temp = head;
		Node next = temp.next;
		if (temp.value == n) {
			temp = next;
			return;
		} else {
			while (next.value != n) {
				temp = next;
				next = temp.next;

			}
		}
		temp.next = next.next;
	}
	public void insert(int n){
		Node node=new Node();
		if(head==null){
			head=node;
			head.value=n;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
			node.value=n;
		}
	}
	
	public void printAll(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void reverseSinglyLL(){
		head=reverseLL(head);
	}

	private Node reverseLL(Node head) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}

}
