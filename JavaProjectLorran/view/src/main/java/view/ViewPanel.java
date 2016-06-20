package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.Border;

import contract.IElement;
import contract.IModel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	private int score;
	
	JToolBar scoreBar = new JToolBar();
	JLabel label = new JLabel("Score : ");

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	private IModel world;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *            the view frame
	 * @throws IOException
	 */
	public ViewPanel(final ViewFrame viewFrame, IModel model) throws IOException {
		this.world = model;
		this.setViewFrame(viewFrame);
		this.setSize(700, 520);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		scoreBar.setPreferredSize(new Dimension(700, 20));
		scoreBar.add(label);
        this.add(scoreBar, BorderLayout.SOUTH);
		// System.out.println(world.getElement(1, 1).getImage());
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
	 *            the new view frame
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
		
		try {
			graphics.setColor(Color.BLACK);
			graphics.fillRect(0, 0, 800, 520);
			this.score = this.world.getScore();
			this.label.setText("Score : " + this.score);
			for (int x = 32; x < 672; x = x + 32) {
				for (int y = 32; y < 416; y = y + 32) {
					if (world.getElement((x / 32) - 1, (y / 32) - 1) != null) {
						//graphics.drawImage(ImageIO.read(new File("C:/Users/asus/Desktop/Projet Java/sprite/bone.png")), x, y, this);
						graphics.drawImage(world.getElement((x / 32) - 1, (y / 32) - 1).getImage(), x, y, this);
					}
				}
			}
		} catch (IOException e) {
		}
		// graphics.clearRect(0, 0, this.getWidth(), this.getHeight());

		// graphics.drawString(this.getViewFrame().getModel().getMessage(), 10,
		// 20);
	}
}
