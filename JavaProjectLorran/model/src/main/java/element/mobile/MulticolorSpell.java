package element.mobile;

import java.io.File;

import contract.ControllerOrder;
import contract.Interaction;
import dao.Model;

public class MulticolorSpell extends Killer {
	
	private static File FIREBALL = new File(Model.class.getResource(FILE + "fireball.gif").getFile());
	private static Interaction INTERACTION = Interaction.MONSTER_KILLER;
	private int directionX = 99;
	private int directionY = 99;
	private int lorannX;
	private int lorannY;
	

	public ControllerOrder IA(int x, int y) {
		if (this.directionX == 99 && this.directionY == 99){
			this.lorannX = x;
			this.lorannY = y;
			if (this.getX() != this.getSavedX()){
				if (this.getX() <= lorannX && this.getY() == lorannY){
					this.savePosition();
					this.directionX = getSavedX();
					this.directionY = getSavedY();
					return ControllerOrder.LEFT;
				}
			}
		}
		else{
			if (this.getX() != this.getSavedX()){
				if (this.getX() <= lorannX && this.getY() == lorannY){
					this.savePosition();
					this.directionX = getSavedX();
					this.directionY = getSavedY();
					return ControllerOrder.LEFT;
				}
			
			}
		}

		this.savePosition();
		return ControllerOrder.NOP;
	}
	
	public MulticolorSpell(int x, int y) {
		super(FIREBALL, x, y, INTERACTION);
		this.setName("Spell");
	}

}
