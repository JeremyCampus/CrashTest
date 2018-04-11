package main.java.heroes.items;

import java.util.ArrayList;
import java.util.List;

public class DefenseItem extends Item{
	protected int DefenseLevel = 2;
	
	public DefenseItem() {
		type = "DefenseItem";
	}

	//GETTER SETTER attackLevel
	public int getItemDefenseLevel(){
		return DefenseLevel;
	}
	public void setItemDefenseLevel(int newAttackLevel){
		DefenseLevel = newAttackLevel;
	}
	
	
}
