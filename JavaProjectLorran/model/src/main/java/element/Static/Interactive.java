package element.Static;

import element.Interaction;

public abstract class Interactive extends Static {
	
	public Interactive() {
		super(null, null);
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
