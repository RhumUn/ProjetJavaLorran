package element;

import java.io.File;

public abstract class Element {
	private int x;
	private int y;
	Interaction interaction;
	private char tag;
	private File sprite;
	
	public Element(File SPRITE, char TEXT_TAG) {
		this.sprite = SPRITE;
		this.tag = TEXT_TAG;
		
	}

	public void setSprite(File sprite) {
		this.sprite = sprite;
	}

	public char getTag() {
		return tag;
	}

	public void setTag(char tag) {
		this.tag = tag;
	}
	
	public Interaction getInteraction() {
		return interaction;
	}

	public void setInteraction(Interaction interaction) {
		this.interaction = interaction;
	}

	public void getImage(){
		
	}
}
