package element.Static;

import java.io.File;

import contract.Interaction;


public class HorizontalBone extends Bone {
	
	private static File HORIZONTAL_BONE = new File(FILE + "horizontal_bone.png");
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public HorizontalBone() {
		super(HORIZONTAL_BONE, INTERACTION);
	}


}
