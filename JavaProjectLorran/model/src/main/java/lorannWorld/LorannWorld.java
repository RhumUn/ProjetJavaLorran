package lorannWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Observable;

import org.w3c.dom.Entity;

import contract.IModel;
import element.Element;
import element.Static.CornerBone;
import element.Static.HorizontalBone;
import element.Static.VerticalBone;
import element.mobile.Mobile;

public class LorannWorld extends Observable implements IModel{
	private static int HEIGHT = 11;
	private static int WIDTH = 20;
	private Element[][] elements;
	private Element element;


	public LorannWorld() throws IOException {
		this.elements = new Element[21][13];
		this.generateLevel();
	}
	
	public void addElement(int x, int y, char textTag){
		switch (textTag) {
		case 'O':
			this.elements[x][y] = new CornerBone();
			break;
		case '-':
			this.elements[x][y] = new HorizontalBone();
			break;
		case 'I':
			this.elements[x][y] = new VerticalBone();
			break;
		
		default:
			
			break;
		}
	}
	
	
	public void generateLevel() throws IOException {
		char c;

		File f = new File ("C:/Users/asus/Desktop/lorann/cryptes/salle011.txt");
		FileReader fr = new FileReader(f);
		for (int y = 0; y < 13; y++){
			for (int x = 0; x < 21; x++){
				c = (char) fr.read();
				if (c == 13){
					c = (char) fr.read();
				}
				else {
					addElement(x, y, c);
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

	public Observable getObservable() {
		return this;
	}

	public Element getElement(int x, int y) {
		return this.elements[x][y];
	}
}
