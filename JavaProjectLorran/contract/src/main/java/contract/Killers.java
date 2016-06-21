package contract;

public enum Killers {

	GrumpyScreamer, MozzaCrust, RavagingAssassinTiki, BrokenMutant, Spell, NOP;
	
	private static Killers[] vals = values();

	public String toString() {
		return super.toString();
	}
	
	public Killers next() {
	    return vals[(this.ordinal()+1) % vals.length];
	}

}
