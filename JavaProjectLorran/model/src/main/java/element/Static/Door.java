package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class Door extends Interactive{
	

	private static File DOOR_OPEN = new File(Model.class.getResource(FILE + "gate_open.png").getFile());
	private static File DOOR_CLOSED = new File(Model.class.getResource(FILE + "gate_closed.png").getFile());
	
	private static Interaction INTERACTION_CLOSED = Interaction.KILLER;
	private static Interaction INTERACTION_OPEN = Interaction.END;
	public Door() {
		super(DOOR_CLOSED, INTERACTION_CLOSED);
	}
	
	public Door(boolean open){
		super(DOOR_OPEN, INTERACTION_OPEN);
	}
}
