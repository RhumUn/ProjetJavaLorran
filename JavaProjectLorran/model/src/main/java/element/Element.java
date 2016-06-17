package element;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import contract.IElement;

import javax.imageio.ImageIO;

public abstract class Element implements IElement{
	private int x;
	private int y;
	BufferedImage image;
	Interaction interaction;
	protected static String FILE = "C:/Users/asus/git/ProjetJavaLorran/JavaProjectLorran/sprite/";
	private File sprite;
	
	public Element(File SPRITE) {
		this.sprite = SPRITE;
	}

	public void setSprite(File sprite) {
		this.sprite = sprite;
	}

	public Interaction getInteraction() {
		return interaction;
	}

	public void setInteraction(Interaction interaction) {
		this.interaction = interaction;
	}

	public BufferedImage getImage() throws IOException{
		this.image = ImageIO.read(this.sprite);
		return this.image;
	}
}
