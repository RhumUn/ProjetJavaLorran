package dao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Observable;

import contract.IMobile;
import contract.IModel;
import contract.Interaction;
import element.Element;
import element.Static.StaticElements;
import element.mobile.BrokenMutant;
import element.mobile.GrumpyScreamer;
import element.mobile.Lorann;
import element.mobile.Mobile;
import element.mobile.MozzaCrust;
import element.mobile.MulticolorSpell;
import element.mobile.RavagingAssassinTiki;

public class Model extends Observable implements IModel{
	private Element[][] elements;
	private Element element;
	private LorannWorld loadedElement;
	private ResultSet rs;
	private int id;
	private int xDoor;
	private int yDoor;
	private int score = 0;
 	private DAOLorannWorld daoHelloWorld;

	Hashtable<String, IMobile> mobiles;



	public Model() throws IOException {
		this.elements = new Element[21][13];
		this.mobiles = new Hashtable<String, IMobile>();
		this.id = 1;
		this.openDAO();
		//this.generateLevel();
		this.loadLevel();
	}
	

	public void addElement(int x, int y, char textTag){

		switch (textTag) {
		case 'O':
			this.element = StaticElements.CORNER_BONE;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "O"));
			break;
		case '-':
			this.element = StaticElements.HORIZONTAL_BONE;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "-"));
			break;
		case 'I':
			this.element = StaticElements.VERTICAL_BONE;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "I"));			
			break;
		case '1':
			this.element = StaticElements.GOLD;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "1"));			
			break;
		case 'Y':
			this.element = StaticElements.DOOR_CLOSED;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "Y"));
			this.xDoor = x;
			this.yDoor = y;
			break;
		case '@':
			this.mobiles.put("Lorann", new Lorann(x, y));
			this.element = (Element) mobiles.get("Lorann");
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "@"));
			break;
		case '*':
			this.mobiles.put("Spell", new MulticolorSpell(x, y));
			this.elements[x][y] = (Element) mobiles.get("Spell");
			break;
		case 'Q':
			this.element = StaticElements.CRYSTAL_BALL;
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "Q"));
			break;
		case 'A':
			this.mobiles.put("RavagingAssassinTiki", new RavagingAssassinTiki(x, y));
			this.element = (Element) mobiles.get("RavagingAssassinTiki");
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "A"));
			break;

		case 'D':
			this.mobiles.put("GrumpyScreamer", new GrumpyScreamer(x, y));
			this.element = (Element) mobiles.get("GrumpyScreamer");
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "D"));
			break;
		case 'B':
			this.mobiles.put("BrokenMutant", new BrokenMutant(x, y));
			this.element = (Element) mobiles.get("BrokenMutant");
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "B"));
			break;
		case 'C':
			this.mobiles.put("MozzaCrust", new MozzaCrust(x, y));
			this.element = (Element) mobiles.get("MozzaCrust");
			this.elements[x][y] = this.element;
			//this.daoHelloWorld.create(new LorannWorld(0, x, y, id, this.element.getInteraction().toString(), "C"));
		default:
			break;
		}
	}
	
	public void removeElement(int x, int y) {
		this.elements[x][y] = null;
	}

	public void generateLevel() throws IOException {
		char c;
		File f = new File (getClass().getResource("/crypts/salle00" + id + ".txt").getFile());
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
		fr.close();
	}
	
	public void loadLevel(){
		this.rs = this.daoHelloWorld.find(id);
		try {
			while (rs.next() == true){
				loadedElement = new LorannWorld(id, rs.getInt("X"), rs.getInt("Y"), rs.getInt(id), rs.getString("INTERACTION"), rs.getString("LABEL"));
				this.addElement(this.loadedElement.getX(), this.loadedElement.getY(), this.loadedElement.getLabel().toCharArray()[0]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	public boolean isMovePossible(int x, int y, IMobile mobile){
		if (this.getElement(x, y) == null){
			setChanged();
			notifyObservers();
			return true;
		}
		else {
			if (this.getElement(x, y).getInteraction() != Interaction.BLOCKING){
				if(this.getElement(x, y).getInteraction() == Interaction.KILLER ){
					if (this.getElement(x, y).getInteraction() == this.getElement(mobile.getX(), mobile.getY()).getInteraction() ){
						setChanged();
						notifyObservers();
						return false;
					}
					this.setElement(this.mobiles.get("Lorann").getX(), this.mobiles.get("Lorann").getY(), null);
					this.mobiles.get("Lorann").setDead(true);
					this.mobiles.remove("Lorann");
					setChanged();
					notifyObservers();
					return false;
				}
				if(this.getElement(x, y).getInteraction() == Interaction.MONSTER_KILLER){
					if (this.getElement(mobile.getX(), mobile.getY()).getInteraction() == Interaction.VICTIM){
						this.setElement(this.mobiles.get("Spell").getX(), this.mobiles.get("Spell").getY(), null);
						this.mobiles.remove("Spell");
						setChanged();
						notifyObservers();
						return false;
					}
					//((Element) this.mobiles.get(mobile.getName())).setSprite(new File("C:/Users/asus/Desktop/Projet Java/sprite/death.png"));
					this.setElement(mobile.getX(), mobile.getY(), null);
					this.mobiles.remove(mobile.getName());
					setChanged();
					notifyObservers();
					return false;
				}
				else if(this.getElement(x, y).getInteraction() == Interaction.VICTIM ){
					if (this.getElement(mobile.getX(), mobile.getY()).getInteraction() == Interaction.MONSTER_KILLER){
						return false;
					}
					this.setElement(this.mobiles.get("Lorann").getX(), this.mobiles.get("Lorann").getY(), null);
					this.mobiles.get("Lorann").setDead(true);
					setChanged();
					notifyObservers();
				}
				else if (this.getElement(x, y).getInteraction() == Interaction.PICKABLE){
					if (this.getElement(mobile.getX(), mobile.getY()).getInteraction() == Interaction.KILLER || this.getElement(mobile.getX(), mobile.getY()).getInteraction() == Interaction.MONSTER_KILLER){
						return false;
					}
					else if (this.getElement(x, y) == StaticElements.CRYSTAL_BALL){
						this.setElement(this.xDoor, this.yDoor, StaticElements.DOOR_OPEN);
					}
					this.score = score + 150;
					setChanged();
					notifyObservers();
				}
				else if(this.getElement(x, y).getInteraction() == Interaction.END ){
					if (this.getElement(mobile.getX(), mobile.getY()) == this.mobiles.get("Lorann")){
						((Element) this.mobiles.get("Lorann")).setSprite(new File("C:/Users/asus/Desktop/Projet Java/sprite/closed.png"));
						this.mobiles.get("Lorann").setWinning(true);
						setChanged();
						notifyObservers();
						return true;
					}
					return false;
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


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
    
	public void openDAO(){
		try {
			this.daoHelloWorld = new DAOLorannWorld(DBConnection.getInstance().getConnection());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	
}
