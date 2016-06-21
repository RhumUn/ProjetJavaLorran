package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;


public class HorizontalBone extends Bone {
	
	private static File HORIZONTAL_BONE = new File(Model.class.getResource(FILE + "horizontal_bone.png").getFile());
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public HorizontalBone() {
		super(HORIZONTAL_BONE, INTERACTION);
	}


}
