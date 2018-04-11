package main.java.heroes.items.defense;

import main.java.heroes.items.*;
import java.util.ArrayList;
import java.util.List;

public class Shield extends DefenseItem {

	public Shield(int level) {
		super();
		type = "Shield";
		DefenseLevel = level;
		guerrierUser = true;
	}


}