package element.Static;

import java.io.File;

import contract.Interaction;

public class Door extends Interactive{
	
	private static File DOOR_OPEN = new File(FILE + "gate_open.png");
	private static File DOOR_CLOSED = new File(FILE + "gate_closed.png");
	private static boolean isDoorOpen;
	private static Interaction INTERACTION = Interaction.KILLER;
	private File DOOR = DOOR_CLOSED;
	
	public Door() {
		super(DOOR_CLOSED, INTERACTION);
	}
	
	public Door(boolean open){
		super(DOOR_OPEN, INTERACTION);
	}
}
