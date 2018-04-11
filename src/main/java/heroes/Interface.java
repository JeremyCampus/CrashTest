package main.java.heroes;

import main.java.heroes.items.*;
import main.java.heroes.items.attack.*;
import main.java.heroes.enemy.*;
import main.java.heroes.supriseBoxes.*;
import java.util.Scanner;

public abstract class Interface extends Dedale{
	public static int machin = 0;
	private static Scanner sc = new Scanner(System.in);

	public static void clearZone()
	{
		System.out.print("\033[H\033[2J");  //CLEAR TERMINAL
		System.out.flush();					//CLEAR TERMINAL
		machin = machin +1;
	}
	
	public static void menuPrincipal() {
		
		if(!Dedale.monDonjon.get(mySquare).eventFinished)
		{
			if(Dedale.monDonjon.get(mySquare) instanceof Enemy) {
				System.out.println("---");
				System.out.println("Vous etes chez un ennemi, prudence... : " + Dedale.monDonjon.get(mySquare).afficher());
			}
			if(Dedale.monDonjon.get(mySquare) instanceof Box) {
				System.out.println("---");
				System.out.println("Vous appercevez un étrange coffre au loin ! " + Dedale.monDonjon.get(mySquare).afficher());
			}
		}else {
			System.out.println("Evenement terminé, continuez d'avancer ! ");
		}
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		System.out.println("-VOUS ETES SUR LA CASE N " + getmySquare() + " -");
		System.out.println("---");
		System.out.println("Afficher le personnages ? = 1");
		System.out.println("Selectionner un personnage ? = 2");
		System.out.println("Vous soigner ? ( " + listeHeroes.get(0).getNbHealingPotion() + " potions restante(s)");
		
		if(Dedale.monDonjon.get(mySquare).getClass().equals(Event.class)||Dedale.monDonjon.get(mySquare).eventFinished)
		{
			System.out.println("Vous deplacer ? = 4");
		}else {
			System.out.println("Vous entrer dans la salle ? = 4");
		}
		System.out.println("Quitter = 5");
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
	}
	
	public static void menuGestionHero() {
		System.out.println("");
		System.out.println("Gestion du hero : " + listeHeroes.get(0).getName());
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		System.out.println("---");
		System.out.println("Afficher toutes ses infos ? = 1");
		System.out.println("Afficher son inventaire ? = 2");		
		System.out.println("Gestion de son inventaire ? = 3");		
		System.out.println("Quitter  = 4");
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		System.out.println("");		  		
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
	}
	
	
	public static void menuGestionInventory() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||| INVENTAIRE DE "+ listeHeroes.get(0).getName() +" ||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		System.out.println("-VOUS ETES SUR LA CASE N " + getmySquare() + " -");
		System.out.println("Afficher l'Inventaire? = 1");
		System.out.println("Quel arme utilise le Hero actuellement ? = 2");
		System.out.println("Changer l'arme qu'utilise le hero ? = 3");
		System.out.println("Quitter = 4");
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		
	}
	
	public static void menuCheatCode(){
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||| CHEAT CODE CONSOLE ||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		System.out.println("---");
		System.out.println("Changer Case ? = 1");
		System.out.println("Afficher tout = 2");
		System.out.println("//Ajouter Arme Hero ? = 3");
		System.out.println("Ajouter Potion ? = 4 ==> "+ listeHeroes.get(0).getNbHealingPotion() + " potions restante(s)");
		System.out.println("Quitter = 5");
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
			}
	
	protected static String menuListWeapon()
	{
		System.out.println("Commencer avec :"
				+ " Bow = 1 "
				+ " Mace = 2 "
				+ " Sword = 3");
		String newWeapon = "";
		newWeapon = sc.nextLine();
		return newWeapon;
	}
	
}
