package com.elevator.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.elevator.interview.Floor.Request;

public class ElevatorManager {
	static Floor f=new Floor();
	static Elevator e=new Elevator();
	static Queue<Floor.Request> requestQueue=new PriorityQueue<Floor.Request>();
	private static List<Elevator> elevators=new ArrayList<Elevator>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		elevators.add(new Elevator(3,"Up"));
		elevators.add(new Elevator(5,"Down"));
		elevators.add(new Elevator(7,"idle"));
		
		System.out.println("Enter up or down");
		String input=scan.nextLine();
		if(input.equalsIgnoreCase("Up"))
			f.goUp();
		else if(input.equals("Down"))
			f.goDown();
		
		delegate();
		e.operate();
			
		
		
	}
	
public static void delegate(){
	
	Elevator idleElevator=null;
	Elevator elevatorMovingInSameDirection = null;
	while(true){
		if(requestQueue.peek()!=null){
		Request req=requestQueue.peek();
		boolean startAgain=false;
		
		for(Elevator elevator:elevators){
			if(elevator.currentFloor==req.currentFloor && elevator.direction==req.direction){
				elevator.floors.offer(req.destinationFloor);
				requestQueue.poll();
				
				startAgain=true;
				break;
			}
			if(elevator.direction.equalsIgnoreCase("Idle")){
				idleElevator=elevator;
			}
			
			if(elevator.direction==req.direction){
				if(elevator.direction.equalsIgnoreCase("Up") && req.currentFloor-elevator.currentFloor>0)
					elevatorMovingInSameDirection=elevator;
				else if(elevator.direction.equalsIgnoreCase("Down") && req.currentFloor-elevator.currentFloor<0)
					elevatorMovingInSameDirection=elevator;
			}
		}
		if(!startAgain && idleElevator!=null){
			idleElevator.floors.offer(req.destinationFloor);
			requestQueue.poll();
		}
		if(!startAgain && elevatorMovingInSameDirection!=null){
			elevatorMovingInSameDirection.floors.offer(req.destinationFloor);
			requestQueue.poll();		}
		
		}
	}
}
}
