package element.Static;

import java.io.File;


public class CornerBone extends Bone {
	
	private static File CORNER_BONE = new File(FILE + "bone.png");
	
	public CornerBone() {
		super(CORNER_BONE);
	}
}
