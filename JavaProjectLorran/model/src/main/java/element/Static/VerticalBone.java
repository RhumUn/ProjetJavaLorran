package element.Static;

import java.io.File;

import contract.Interaction;

public class VerticalBone extends Bone {
	
	private static File SPRITE_VBONE = new File(FILE + "vertical_bone.png");
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public VerticalBone() {
		super(SPRITE_VBONE, INTERACTION);
	}
	

}
