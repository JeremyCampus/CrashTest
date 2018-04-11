package main.java.heroes.supriseBoxes.diverse;

import main.java.heroes.*;
import main.java.heroes.supriseBoxes.*;
import java.util.ArrayList;
import java.util.List;

public class BoxHealingPotion extends Box {

	public BoxHealingPotion() {
		super();
		nameEvent = "HealingPotion";
	}
	
	public void generateEvent() {
		Dedale.getListeHeroes().get(0).nbHealingPotion++;
		eventFinished = true;
	}

}