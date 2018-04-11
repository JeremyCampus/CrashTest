package main.java.heroes.supriseBoxes;

import main.java.heroes.*;


public class BoxAttack extends Box{
	public String nameEvent = "BoxAttack";
	public int protection = 1;
	
	
	public BoxAttack() {
		
	}
	
	public String afficher() {
		return "Je suis : Une " + nameEvent;
	}
}
