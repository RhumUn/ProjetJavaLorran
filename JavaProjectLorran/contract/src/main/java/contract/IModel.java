package contract;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Observable;

import contract.IMobile;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel{
	public IElement getElement(int x, int y);
	
	public IMobile getMobile(IMobile mobile);
	
	public boolean isMovePossible(int x, int y);
	
	public void removeElement(int x, int y);
	
	public void addElement(int x, int y, char textTag);
	
	public void setElements(int x, int y, IMobile mobile);
	
	public void generateLevel() throws IOException;
	
	public Hashtable<String, IMobile> getMobiles();

	public Observable getObservable();
}
