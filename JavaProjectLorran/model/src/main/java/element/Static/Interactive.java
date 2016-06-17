package element.Static;

import java.io.File;

import element.Interaction;

public abstract class Interactive extends Static {
	
	public Interactive(File sprite) {
		super(sprite);
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
