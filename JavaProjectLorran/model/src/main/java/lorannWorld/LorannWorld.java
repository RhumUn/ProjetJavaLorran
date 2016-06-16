package lorannWorld;

import element.Element;
import element.Static.StaticElements;
import element.mobile.Mobile;

public class LorannWorld {
	private static int HEIGHT = 11;
	private static int WIDTH = 20;
	private StaticElements[][] staticElements;
	
	public LorannWorld(){
		
	}
	
	public int getWidth(){
		return this.WIDTH;
	}
	
	public int getHeight(){
		return this.HEIGHT;
	}
	
	public void addStaticElements(int x, int y, StaticElements staticElements){
		this.staticElements[x][y] = staticElements;
		if(staticElements != null){
			staticElements.setLorannWorld(this);
		}
		this.setChanged();
		
	}
	
	public void addMobile(int x, int y, Mobile mobile){
		this.mobiles.add(mobile);
		mobile.setLorannWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
		
	}
	
	
}
