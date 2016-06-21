package contract;

public interface IMobile {
	
	public void moveUp();
	
	public void moveLeft();
	
	public void moveDown();
	
	public void moveRight();
	
	public int getX();

	public void setX(int x);

	public int getY();
	
	public void setY(int y);
	
	public void savePosition();
	
	public int getSavedX();
	
	public int getSavedY();
	
	public boolean isWinning();

	public void setWinning(boolean winning);
	
	public boolean isDead();

	public void setDead(boolean dead);
	
	public String getName();
}
