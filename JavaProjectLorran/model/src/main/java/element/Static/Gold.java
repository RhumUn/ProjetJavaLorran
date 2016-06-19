package element.Static;

import java.io.File;

import contract.Interaction;

public class Gold extends Interactive {
	
	private static File GOLD = new File(FILE + "purse.png");
	private static Interaction INTERACTION = Interaction.PICKABLE;
	
	public Gold(){
		super(GOLD, INTERACTION);
	}
	

}
