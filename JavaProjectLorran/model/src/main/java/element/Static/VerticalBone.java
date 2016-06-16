package element.Static;

import java.io.File;

public class VerticalBone extends Bone {
	
	private static File SPRITE_VBONE = new File("C:/Users/asus/git/ProjetJavaLorran/JavaProjectLorran/sprite/vertical_bone.png");
	private static char TEXT_TAG = 'I';
	
	public VerticalBone() {
		super(SPRITE_VBONE, TEXT_TAG);
	}
	

}
