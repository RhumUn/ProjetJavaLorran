package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class Gold extends Interactive {
	
	private static File GOLD = new File(Model.class.getResource(FILE + "purse.png").getFile());
	private static Interaction INTERACTION = Interaction.PICKABLE;
	
	public Gold(){
		super(GOLD, INTERACTION);
	}
	

}
