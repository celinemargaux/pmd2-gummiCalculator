import java.util.Arrays;

public class Pokemon {
	private String name;
	private Type[] type;
	private int iqLevel;
	
	
	public Pokemon (String name, Type ...type) {
		this.name = name;
		this.type = type;
	}
	
	public Pokemon (String name, int iqLevel, Type... type) {
		this.name = name;
		this.type = type;
		this.iqLevel = iqLevel;
	}
	
	String getName () {
		return name;
	}
	
	Type[] getType () {
		return type;
	}
	
	int getIqLevel () {
		return iqLevel;
	}
	
	public String toString () {
		String types = type[0].getTypeName();
		for (int i = 1; i < type.length; i++) {
			types.concat(", ");
			types.concat(type[i].getTypeName());
		}
		return "[Pokemon] " + getName() + ", " + types;
	}
}
