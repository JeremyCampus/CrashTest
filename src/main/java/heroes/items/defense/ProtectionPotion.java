package main.java.heroes.items.defense;

import main.java.heroes.items.*;
import java.util.ArrayList;
import java.util.List;

public class ProtectionPotion extends DefenseItem {

	public ProtectionPotion(int level) {
		super();
		type = "ProtectionPotion";
		DefenseLevel = level;
		mageUser = true;
	}


}