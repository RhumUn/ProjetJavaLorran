package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	private static String FILE = "C:/Users/asus/git/ProjetJavaLorran/JavaProjectLorran/sprite/horizontal_bone.png";
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		
		this.setViewFrame(viewFrame);
		this.setSize(700, 400);
		this.setBackground(Color.BLACK);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		
		BufferedImage img = null;
		try {
			graphics.setColor(Color.BLACK);
			graphics.fillRect(0, 0, 800, 400);
		    img = ImageIO.read(new File(FILE));
		    for (int x = 32; x < 640; x = x+ 32){
		    	for (int y = 32; y < 352; y = y + 32){
		    		graphics.drawImage(img, x, y, this);
		    	}
		    }
		} catch (IOException e) {
		}
		//graphics.clearRect(0, 0, this.getWidth(), this.getHeight());

		
		//graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
	}
}
