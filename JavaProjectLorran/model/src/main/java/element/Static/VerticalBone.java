package element.Static;

import java.io.File;

import contract.Interaction;
import dao.Model;

public class VerticalBone extends Bone {
	
	private static File SPRITE_VBONE = new File(Model.class.getResource(FILE + "vertical_bone.png").getFile());
	private static Interaction INTERACTION = Interaction.BLOCKING;
	
	public VerticalBone() {
		super(SPRITE_VBONE, INTERACTION);
	}
	

}
