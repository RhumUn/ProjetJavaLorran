package element.Static;

import java.io.File;

import contract.Interaction;


public class CornerBone extends Bone {
	
	private static File CORNER_BONE = new File(FILE + "bone.png");
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public CornerBone() {
		super(CORNER_BONE, INTERACTION);
	}
}
