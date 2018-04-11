package main.java.heroes.supriseBoxes;

import main.java.heroes.*;


public class Box extends Event{
	public String nameEvent = "Surpise";
	public int protection = 1;
	protected boolean eventFinished = false;
	
	public Box() {
		
	}
	
	public String afficher() {
		return "Je suis : Une " + nameEvent;
	}
	
	public void generateEvent() {
		eventFinished = true;
	}
}
