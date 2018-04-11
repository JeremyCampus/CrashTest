package main.java.heroes.supriseBoxes;

import main.java.heroes.items.attack.*;

import main.java.heroes.*;
import main.java.heroes.items.*;


public class BoxWeapon extends BoxAttack{
	protected Weapon myWeapon= new Weapon();
	
	
	public BoxWeapon(String monNum) {
		myWeapon = new Sword();
		
	}
	
	public String afficher() {
		return "Je suis : Une " + nameEvent + " et Je contiens : " + myWeapon.getName();
	}
	
	public void generateEvent() {
		Dedale.getListeHeroes().get(0).ajouterArmeSpell(myWeapon);
		eventFinished = true;
	}
}
