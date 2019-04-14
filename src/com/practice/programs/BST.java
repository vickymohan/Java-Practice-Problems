package com.practice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BST {
	TreeNode parent;
	Queue<TreeNode> q=new LinkedList<TreeNode>();
	Queue<QItem> queue=new LinkedList<QItem>();
	int maxlevelRight=0;
	int maxlevelLeft=0;
		
	class TreeNode{
		int value;
		TreeNode leftchild;
		TreeNode RightChild;
		
		public TreeNode(){
			this.leftchild=null;
			this.RightChild=null;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST bst=new BST();
		bst.insert(4);
		bst.insert(2);
		bst.insert(10);
		bst.insert(5);
		bst.insert(12);
		bst.insert(3);
		bst.insert(1);
		System.out.println("Printing level Order");
		bst.levelOrder();
		/*bst.delete(4);
		bst.levelOrder();*/
		System.out.println("printing Bottom View");
		bst.bottomView();
		System.out.println("printing top view");
		bst.printTopView();
		System.out.println("printing right view");
		bst.rightView();
		System.out.println("printing left view");
		bst.leftView();
	}
	public void delete(int n){
		parent=deleteRec(parent,n);
	}
	private TreeNode deleteRec(TreeNode parent, int n) {
		// TODO Auto-generated method stub
		TreeNode root=parent;
		if(root==null){
			return root;
		}
		else if(n<root.value)
			root.leftchild=deleteRec(root.leftchild, n);
		else if(n>root.value)
			root.RightChild=deleteRec(root.RightChild, n);
		else{
			if(root.RightChild==null)
				return root.leftchild;
			if(root.leftchild==null)
				return root.RightChild;
			else{
			int data=findMin(root.RightChild);
			root.RightChild=deleteRec(root.RightChild, data);
			}
			
		}
		return root;
	}
	private int findMin(TreeNode rightChild) {
		// TODO Auto-generated method stub
		int key=rightChild.value;
		while(rightChild.leftchild!=null){
			key=rightChild.leftchild.value;
			rightChild=rightChild.leftchild;
		}
		return key;
	}
	public void insert(int n){
		parent=insertRec(parent,n);
	}
	private TreeNode insertRec(TreeNode parent,int n){
		TreeNode root=new TreeNode();
		if(parent==null){
			parent=root;
			parent.value=n;
			return parent;
		}
		if(n<parent.value)
			parent.leftchild=insertRec(parent.leftchild,n);
		if(n>parent.value)
			parent.RightChild=insertRec(parent.RightChild, n);
		
		return parent;
	}
	
	public void levelOrder(){
		q.add(parent);
		while(!q.isEmpty()){
			TreeNode n=q.poll();
			System.out.println(n.value);
			if(n.leftchild!=null)
				q.add(n.leftchild);
			if(n.RightChild!=null)
				q.add(n.RightChild);
		}
	}
	class QItem{
		private TreeNode node;
		private int hd;
		public QItem(TreeNode node,int hd){
			this.node=node;
			this.hd=hd;
		}
	}
	public void printTopView(){
		Set<Integer> set=new HashSet<Integer>();
		queue.add(new QItem(parent,0));
		while(!queue.isEmpty()){
		QItem qitem=queue.poll();
		TreeNode n=qitem.node;
		int hd=qitem.hd;
		if(!set.contains(hd)){
			set.add(hd);
			System.out.println(n.value);
		}
		if(n.leftchild!=null)
			queue.add(new QItem(n.leftchild,-1));
		if(n.RightChild!=null)
			queue.add(new QItem(n.RightChild,1));
		}
	}
	
	public void bottomView(){
		Map<Integer,TreeNode> map=new HashMap<Integer,TreeNode>();
		queue.add(new QItem(parent,0));
		while(!queue.isEmpty()){
			QItem qitem=queue.poll();
			TreeNode n=qitem.node;
			int hd=qitem.hd;
			map.put(hd, n);
			if(n.leftchild!=null)
				queue.add(new QItem(n.leftchild,-1));
			if(n.RightChild!=null)
				queue.add(new QItem(n.RightChild,1));
		}
		for(Map.Entry<Integer, TreeNode> entry:map.entrySet()){
			System.out.println(entry.getValue().value);
		}
	}
	
	public void rightView(){
		printRightView(parent,1);
	}
	private void printRightView(TreeNode parent, int level) {
		// TODO Auto-generated method stub
		if(parent==null)
			return;
		if(maxlevelRight<level){
			System.out.println(parent.value);
			maxlevelRight=level;
		}
		printRightView(parent.RightChild ,level+1);
		printRightView(parent.leftchild,level+1);
		
	}
	
	public void leftView(){
		printLeftView(parent,1);
	}
	private void printLeftView(TreeNode parent, int level) {
		// TODO Auto-generated method stub
		if(parent==null)
			return;
		if(maxlevelLeft<level){
			System.out.println(parent.value);
			maxlevelLeft=level;
		}
		printLeftView(parent.leftchild,level+1);
		printLeftView(parent.RightChild ,level+1);
		
	}

}
