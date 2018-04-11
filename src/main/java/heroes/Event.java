package main.java.heroes;

import main.java.heroes.enemy.*;

public class Event {
	protected static int type = 0;
	protected static int typeEnnemi = 0;
	protected static int typeCaisse = 0;
	protected boolean eventFinished = false;

	public Event() {
		
	}
	
	
	

	public String afficher() {
		return "Je suis : Event";
	}
	
	public void generateEvent() {
		eventFinished = true;
	}
}
