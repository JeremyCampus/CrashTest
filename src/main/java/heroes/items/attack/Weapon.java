package main.java.heroes.items.attack;

import main.java.heroes.items.*;
import java.util.ArrayList;
import java.util.List;

public class Weapon extends AttackItem {
	public static List<Weapon> weaponList = new ArrayList();
	
	public Weapon() {
		super();
		type = "Weapon";
		attackLevel = 1;
		guerrierUser = true;
	}

	public static void generateWeapons() {
		weaponList.add(new Bow());
		weaponList.add(new Mace());
		weaponList.add(new Sword());
	}
}