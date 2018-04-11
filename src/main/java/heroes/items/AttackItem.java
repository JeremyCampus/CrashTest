package main.java.heroes.items;

import java.util.ArrayList;
import java.util.List;

public class AttackItem extends Item{
	protected int attackLevel = 25;
	
	public AttackItem() {
		type = "AttackItem";
	}

	//GETTER SETTER attackLevel
	public int getItemAttackLevel(){
		return attackLevel;
	}
	public void setItemAttackLevel(int newAttackLevel){
		attackLevel = newAttackLevel;
	}
	
	
}
