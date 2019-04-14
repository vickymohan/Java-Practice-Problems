package com.elevator.interview;

import java.util.PriorityQueue;
import java.util.Queue;

public class Elevator {
	public Elevator(int currentFloor,String direction){
		this.currentFloor=currentFloor;
		this.direction=direction;
	}
	public Elevator(){
		
	}
String direction;
Queue<Integer> floors=new PriorityQueue<Integer>();
int currentFloor;
public void moveUp(){
	this.currentFloor+=currentFloor;
}
public void moveDown(){
	this.currentFloor-=currentFloor;
}
public void operate(){
	while(floors.peek()!=null){
		int destinationFloor=floors.peek();
		if(this.currentFloor!=destinationFloor){
			if(this.direction.equalsIgnoreCase("Up"))
				moveUp();
			else
				moveDown();
		}
		floors.poll();
	}
	this.direction="idle";
}
}
