package main.java.heroes.enemy;

public class Troll extends Enemy{
	public int age =  1;
	
	public Troll(int newAge){
		super();
		combatGuerrier = true;
		combatMage = true;
		age = newAge;
		damage = age;
	}
	
	public String afficher() {
		return "Je suis : un Troll";
	}	
	
	public void generateEvent() {
		System.out.println(afficher() + " a été tué.");
		eventFinished = true;
	}
}
