package main.java.heroes.items.attack;

import main.java.heroes.items.*;
import java.util.ArrayList;
import java.util.List;

public class Bow extends Weapon {

	public Bow() {
		super();
		type = "Bow";
		attackLevel = 1;
		int idWeapon = 0;
	}
	
	public String toString() {
		return type;
	}
}