package edu.buffalostate.cis425.sp16.exercises.kuntz;
import java.io.*;
import java.util.Scanner;

public class CyberStudent {
	
	public int State = 1;
	public int Substate = 0;
	String Name;
	
	 private final int awake = 0;
	 private final int sleep = 1;
	 public final int eating = 0;
	 public final int working = 1;
	 public final int dreaming = 0;
	 public final int snoring = 1;
	 
	public CyberStudent(String name){
		Name = name;
	}
	
	boolean Awake(int subs)
	{
		if(Substate==0||Substate==1){
			State = awake;
			Substate = subs;
			return true;
			
		}
		
		return false;
	}
	
	boolean Sleep(int subs)
	{
		
		if(Substate==0||Substate==1){
			State = sleep;
			Substate = subs;
			return true;
		}
	
			return false;
	}
	
	public String getState(){
	{
		String currStateStr;
		
		if(State==0){
			if(Substate==0){
				currStateStr = "Awake and Eating";
			}
			else if(Substate==1){
				currStateStr = "Awake and Working";
			}
			else{
				currStateStr = "Unknown State";
			}
		}
		
		else if(State==1){
			if(Substate==0){
				currStateStr = "Sleeping and Dreaming";
			}
			else if(Substate==1){
			    currStateStr = "Sleeping and Snoring";
			}
			else{
				currStateStr = "Unknown State";
			}
			
		}
		
		else{
			currStateStr = "Unknown State";
		}
		
		return currStateStr;
	}
	}
	
	public String getName(){
		String studentName = Name;
		return studentName;
	}
	
	public boolean Dream(){
		if (State == sleep){
			Substate = dreaming;
			return true;
		}
		return false;
	}
	
	public boolean Snore(){
		if (State == sleep){
			Substate = snoring;
			return true;
		}
		return false;
	}
	
	public boolean Work(){
		if (State == awake){
			Substate = working;
			return true;
		}
		return false;
	}
	
	public boolean Eat(){
		if (State == awake){
			Substate = eating;
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		
		CyberStudent myStudent = new CyberStudent("Bill");
		System.out.println("Student's name is: " + myStudent.getName());
		System.out.println("Student is initially: " + myStudent.getState());
		myStudent.Sleep(myStudent.snoring);
		System.out.println("Student is now: " + myStudent.getState());
		myStudent.Awake(myStudent.eating);
		System.out.println("Student is now: " + myStudent.getState());
		myStudent.Awake(myStudent.working);
		System.out.println("Student is now: " + myStudent.getState());
		
		return;
	}
}
