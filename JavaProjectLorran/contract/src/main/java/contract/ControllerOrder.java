package contract;

/**
 * The Enum ControllerOrder.
 *
 * @author Jean-Aymeric Diet
 */
public enum ControllerOrder {

	UP,
	RIGHT,
	DOWN,
	LEFT,
	UP_LEFT,
	UP_RIGHT,
	DOWN_LEFT,
	DOWN_RIGHT,
	FIRE, 
	NOP;
	

    public static ControllerOrder getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
