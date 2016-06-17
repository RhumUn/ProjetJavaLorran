package element.Static;

import java.io.File;

public class Door extends Interactive{
	
	private static File DOOR_OPEN = new File(FILE + "gate_open.png");
	private static File DOOR_CLOSED = new File(FILE + "gate_open.png");
	
	public Door() {
		super(DOOR_CLOSED);
	}
	

}
