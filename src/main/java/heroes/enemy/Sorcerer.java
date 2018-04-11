package main.java.heroes.enemy;

public class Sorcerer extends Enemy{
	
	public Sorcerer(int newDamage){
		super();
		combatMage = true;
		damage = newDamage;
	}
	
	public String afficher() {
		return "Je suis : un Sorcerer";
	}

	public void generateEvent() {
		System.out.println(afficher() + " a été tué.");
		eventFinished = true;
	}
}
