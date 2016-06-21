package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;


public class CornerBone extends Bone {
	
	private static File CORNER_BONE = new File(Model.class.getResource(FILE + "bone.png").getFile());
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public CornerBone() {
		super(CORNER_BONE, INTERACTION);
	}
}
