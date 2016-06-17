package contract;

import java.io.IOException;
import java.util.Observable;

import org.w3c.dom.Entity;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel{
	public IElement getElement(int x, int y);
	
	public void addElement(int x, int y, char textTag);
	
	public void generateLevel() throws IOException;

	public Observable getObservable();
}
