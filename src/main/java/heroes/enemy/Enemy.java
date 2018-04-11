package main.java.heroes.enemy;

import main.java.heroes.*;


public class Enemy extends Event{
	public String nameEnemy = "mechant";
	public int damage = 1;
	public boolean combatGuerrier = false;
	public boolean combatMage = false;
	public int protection = 1;
	protected boolean eventFinished = false;
	
	public Enemy() {
		
	}
	
	public String afficher() {
		return "Je suis : Enemy";
	}
	

}
