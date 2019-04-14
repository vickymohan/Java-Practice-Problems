package com.elevator.interview;

public class Floor {
	ElevatorManager elevatorManager=new ElevatorManager();
	class Request{
		public Request(int currentFloor,int destinationFloor,String direction){
			this.currentFloor=currentFloor;
			this.destinationFloor=destinationFloor;
			this.direction=direction;
		}
	int currentFloor,destinationFloor;
	String direction;
	}
public void goUp(){
	elevatorManager.requestQueue.offer(new Request(3,5,"Up"));
}
public void goDown(){
	elevatorManager.requestQueue.offer(new Request(6,2,"Down"));
}
}
