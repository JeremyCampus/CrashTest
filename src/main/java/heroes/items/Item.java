package main.java.heroes.items;


public class Item {
	protected String type = "None";
	protected boolean mageUser = false;
	protected boolean guerrierUser = false;
	
	public Item() {
	}	

	public String toString() {
		return type;
	}
	
	public String getName() {
		return type;
	}
	
	public void setName(String newName) {
		type = newName;
	}

	public int getItemAttackLevel(){
		return 0;
	}
	
	public void setItemAttackLevel(int newAttackLevel){
	}
}
