package com.singtel.designapp;

public class Animal {
	void walk() {
		System.out.println("I am walking");
	}
	
	public void sound(){
		System.out.println("Cannot Fly");
	}
	
	public void swim(){
		System.out.println("Cannot Swim");
	}
	
	public String sing(){
		System.out.println("Cannot sing");
		return "Cannot sing";
	}
	
	public void fly(){
		System.out.println("Cannot fly");
	}
}
