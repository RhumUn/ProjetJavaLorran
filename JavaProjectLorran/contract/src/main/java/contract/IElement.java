package contract;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public interface IElement {
	public BufferedImage getImage() throws IOException;
	
	public Interaction getInteraction();
}
