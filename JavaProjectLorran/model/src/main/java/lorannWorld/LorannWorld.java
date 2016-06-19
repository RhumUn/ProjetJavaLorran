package lorannWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Observable;

import org.w3c.dom.Entity;

import contract.IElement;
import contract.IMobile;
import contract.IModel;
import contract.Interaction;
import element.Element;
import element.Static.*;
import element.mobile.*;

public class LorannWorld extends Observable implements IModel{
	private static int HEIGHT = 11;
	private static int WIDTH = 20;
	private Element[][] elements;
	private Element element;
	private int xDoor;
	private int yDoor;

	Hashtable<String, IMobile> mobiles;
	private int score = 0;


	public LorannWorld() throws IOException {
		this.elements = new Element[21][13];
		this.mobiles = new Hashtable<String, IMobile>();
		this.generateLevel();
	}
	

	public void addElement(int x, int y, char textTag){
		switch (textTag) {
		case 'O':
			this.elements[x][y] = StaticElements.CORNER_BONE;
			break;
		case '-':
			this.elements[x][y] = StaticElements.HORIZONTAL_BONE;
			break;
		case 'I':
			this.elements[x][y] = StaticElements.VERTICAL_BONE;
			break;
		case '1':
			this.elements[x][y] = StaticElements.GOLD;
			break;
		case 'Y':
			this.elements[x][y] = StaticElements.DOOR_CLOSED;
			this.xDoor = x;
			this.yDoor = y;
			break;
		case '@':
			this.mobiles.put("Lorann", new Lorann(x, y));
			this.elements[x][y] = (Element) mobiles.get("Lorann");
			break;
		case 'Q':
			this.elements[x][y] = StaticElements.CRYSTAL_BALL;
			break;
		case 'A':
			this.mobiles.put("RavagingAssassinTiki", new RavagingAssassinTiki(x, y));
			this.elements[x][y] = (Element) mobiles.get("RavagingAssassinTiki");
			break;

		case 'D':
			this.mobiles.put("GrumpyScreamer", new GrumpyScreamer(x, y));
			this.elements[x][y] = (Element) mobiles.get("GrumpyScreamer");
			break;
		case 'B':
			this.mobiles.put("BrokenMutant", new BrokenMutant(x, y));
			this.elements[x][y] = (Element) mobiles.get("BrokenMutant");
			break;
		case 'C':
			this.mobiles.put("MozzaCrust", new MozzaCrust(x, y));
			this.elements[x][y] = (Element) mobiles.get("MozzaCrust");
		default:
			break;
		}
	}
	
	public void removeElement(int x, int y) {
		this.elements[x][y] = null;
	}

	public void generateLevel() throws IOException {
		char c;

		File f = new File ("C:/Users/asus/Desktop/lorann/cryptes/salle004.txt");
		FileReader fr = new FileReader(f);
		for (int y = 0; y < 13; y++){
			for (int x = 0; x < 21; x++){
				c = (char) fr.read();
				if (c == 13){
					c = (char) fr.read();
				}
				else {
					this.addElement(x, y, c);
				}
			}
		}
	}
	
	
	public void addMobile(int x, int y, Mobile mobile){
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void loadMessage(String key) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isMovePossible(int x, int y){
		if (this.getElement(x, y) == null){
			setChanged();
			notifyObservers();
			return true;
		}
		else {
			if (this.getElement(x, y).getInteraction() != Interaction.BLOCKING){
				if(this.getElement(x, y).getInteraction() == Interaction.KILLER){
					((Element) this.mobiles.get("Lorann")).setSprite(new File("C:/Users/asus/Desktop/Projet Java/sprite/death.png"));
					setChanged();
					notifyObservers();
					return false;
				}
				else if (this.getElement(x, y).getInteraction() == Interaction.PICKABLE){
					if (this.getElement(x, y) == StaticElements.CRYSTAL_BALL){
						this.setElement(this.xDoor, this.yDoor, StaticElements.DOOR_OPEN);
					}
					setChanged();
					notifyObservers();
					this.score = score + 100;
					System.out.println(score);
				}
				return true;
			}
			if(this.getElement(x, y).getInteraction() != Interaction.BLOCKING){
				
			}
		}
		return false;
	}
	
	public void setElements(int x, int y, IMobile element) {
		this.elements[x][y] = (Element) element;
	}

	public Observable getObservable() {
		return this;
	}

	public Element getElement(int x, int y) {
		return this.elements[x][y];
	}

	public Mobile getLorann(IMobile mobile) {
		return (Mobile) this.elements[mobile.getX()][mobile.getY()];
	}

	public IMobile getMobile(IMobile mobile) {
		return (IMobile) this.elements[mobile.getX()][mobile.getY()];
	}

	public Hashtable<String, IMobile> getMobiles() {
		return mobiles;
	}
	
    public void setElement(int x, int y, Element element) {
		this.elements[x][y] = element;
	}
	
}
