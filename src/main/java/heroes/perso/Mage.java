package main.java.heroes.perso;
import main.java.heroes.items.*;
import main.java.heroes.items.attack.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// import java.util.ListIterator;

public class Mage extends Character{
	protected static List<Item> inventory = new ArrayList<Item>();	
	public Item myAttackItem = new Item();
	public Item myDefenseItem = new Item();
	protected int damages =  FA + myAttackItem.getItemAttackLevel();
	protected boolean shield = false;
	protected String metier = "Mage";
	
	
	public Mage() {
		super();
		inventory.add(myAttackItem);
	}


	public Mage(String myName) {
		super();
		name = myName;
		// inventory.add(myAttackItem);
	}


	public Mage(String myName, String newImage, int newLife, int newStrenght) {
		setName(myName);
		setImage(newImage);
		setLife(newLife);
		setFA(newStrenght);
		// inventory.add(myAttackItem);
		mettreAJour();
	}
	
	
		
	public void mettreAJour(){
		damages = FA + myAttackItem.getItemAttackLevel();
	}



	public void setShield(boolean status){
		shield = status;
	}


	public void attaquer() {
		System.out.println("Vous attaquez votre ennemi.");
		System.out.println("Vous lui avez fait : " + damages + "degats");
	}

	public String toString() {
		return "\n_________________________________________"		
		+"\nYour Name : " + name 
		+"\nYour Profession : " + metier 
		+ "\nYour Image : " + image 
		+"\nYour Life : " + life +" --- "
		 +"\nYour Spell is " + myAttackItem + " who deliver " + myAttackItem.getItemAttackLevel() + " damages."
		 +"\nYour shield : " + shield
		 +"\nYour inventory has " + inventory.size() + " Spells."	
		 +"\n"
		 +"\n_________________________________________";
	}



	public void ajouterArmeSpell(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Une arme ? ");
		myAttackItem = new Item();

		System.out.println("Son nom : ");
		String str1 = sc.nextLine();
		myAttackItem.setName(str1);

		System.out.println("Son niveau de puissance : ");
		int str2 = sc.nextInt();
		myAttackItem.setItemAttackLevel(str2);
		inventory.add(myAttackItem);
	}



	public void afficherInventory(){
		System.out.println("______________||_INVENTAIRE_||______________");
		System.out.println("");
		System.out.println("Your Name : " + name);
		System.out.println("Your inventory has " + inventory.size() + " Spells.");	
		System.out.println("_________________________________________");		
		for(int i = 0; i < inventory.size(); i++){
			System.out.println("");
			System.out.println("");
			System.out.println("Voici l'arme : " + inventory.get(i).getName() + " | Numero : " + i);
			System.out.println("Voici sa Puissance : " + inventory.get(i).getItemAttackLevel());;
		}	

		// System.out.println("Your Spell is " + myAttackItem.getNameItemAttack() + " who deliver " + myAttackItem.getItemAttackLevel() + " damages.");

	}

	public void selectionnerArme()
	{
		Scanner sc = new Scanner(System.in);		
		afficherInventory();
		System.out.println("______________||QUELLE ARME VOULEZ VOUS UTILISER||______________");
		System.out.println("                     (Indiquez son numero)");
		int str2 = sc.nextInt();
		sc.nextLine();
		myAttackItem= inventory.get(str2);
		System.out.println(getName() + " utilise actuellement l'arme : " + myAttackItem.getName());
	}

	public void supprimerArme()
	{
		Scanner sc3 = new Scanner(System.in);		
		afficherInventory();
		System.out.println("______________||QUELLE ARME VOULEZ VOUS SUPPRIMER||______________");
		System.out.println("                     (Indiquez son numero)");
		int str2 = sc3.nextInt();
		sc3.nextLine();
		System.out.println("Etes vous sur de vouloir supprimer " + inventory.remove(str2) + " ?");
		System.out.println("y(Yes), n(No)");
		String validSuppr = sc3.nextLine();
		if(validSuppr == "y" || validSuppr == "Y")
		{
			inventory.remove(str2);
		}
	}

}