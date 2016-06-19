package element.Static;

import java.io.File;

import contract.Interaction;

public abstract class Interactive extends Static {
	
	public Interactive(File sprite, Interaction interaction) {
		super(sprite, interaction);
	}
	
	public void interact(Interaction interaction){
		switch (interaction) {
		case PICKABLE:
			
			break;
		case KILLER:
			
			break;
		default:
			break;
		}
		
	}
}
