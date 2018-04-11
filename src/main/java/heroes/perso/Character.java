package main.java.heroes.perso;

import java.util.ArrayList;
import java.util.List;

import main.java.heroes.items.*;
import main.java.heroes.items.attack.*;
import main.java.heroes.items.defense.*;

public abstract class Character {
	protected static List<Item> inventory = new ArrayList<Item>();	
	protected String name = "Peasant";
	protected String image  = "X";
	protected int life = 1 + (int)(Math.random() * ((100 - 1) + 1));
	protected int level = 1;
	public int nbHealingPotion = 3;
	protected int FA = 1; 
	protected int damages = FA;
	protected String metier = "Peasant";
	public AttackItem myAttackItem = new AttackItem();
	public DefenseItem myDefenseItem = new DefenseItem();

	
	public Character() {
	}

	
	public void mettreAJour(){
		damages = FA;
	}



	public String getName(){
		return name;
	}

	public String getImage(){
		return image;
	}

	public int getLife(){
		return life;
	}
	
	public int getNbHealingPotion(){
		return nbHealingPotion;
	}


	public int getStrength(){
		return FA;
	}
	
	public int getDamages(){
		return damages;
	}

	//----------------------------

	public void setName(String newNom){
		name = newNom;
	}

	public void setImage(String newImage){
		image = newImage;
	}

	public void setLife(int newLife){
		life = newLife;
	}

	public void setFA(int newFA){
		FA = newFA;
	}

	public String toString() {
		return  "Your Name : " + name 
		+ "Your Image : " + image 
		+"Your Life : " + life +" --- "
		 +"_________________________________________";
	}




	

	public void ajouterArmeSpell(){
	}
	public void ajouterArmeSpell(Weapon myWeapon){
	}
	
	public void ajouterArmeSpell(Spell mySpell){
	}

	public void afficherInventory(){
	}

	public void gestionInventory(){
	}		
	
	public void selectionnerArme(){
	}
	
	public void selectionnerSpell(){
	}
	public String whatItemAttack() {
		return getName() + " utilise actuellement l'arme ";
	}
}