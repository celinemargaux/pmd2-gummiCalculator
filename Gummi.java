public class Gummi {
	private String gummiColour;
	private Type type;
	
	String getGummiColour () {
		return gummiColour;
	}
	
	Type getType () {
		return type;
	}
	
	public Gummi(Type type) {
		this.type = type;
		gummiColour = new ColourSetting(type).giveColour();
	}
	
	public String toString () {
		return "[Gummi] " + getGummiColour() + ", " + getType();
	}
}
