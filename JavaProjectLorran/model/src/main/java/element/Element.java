package element;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.IElement;
import contract.Interaction;

public abstract class Element implements IElement{
	
	BufferedImage image;
	Interaction interaction;
	protected static String FILE = "/sprites/";
	private File sprite;
	
	public Element(File SPRITE, Interaction INTERACTION) {
		this.sprite = SPRITE;
		this.interaction = INTERACTION;
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
