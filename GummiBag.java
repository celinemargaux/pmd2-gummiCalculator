import java.util.ArrayList;
import java.util.List;

class GummiBag {
	private List <Gummi> gummis;
	private String bagName;
	private int totalIQpoints;
	
	GummiBag (String bagName) {
		this.bagName = bagName;
		gummis = new ArrayList <>();
		totalIQpoints = 0;
	}
	
	String getBagName () {
		return bagName;
	}
	
	void addGummi (Gummi gummi) {
		gummis.add(gummi);
	}
	
	List <Gummi> getGummis () {
		return gummis;
	}
	
	public String toString () {
		StringBuilder gummiList   = new StringBuilder();
		for (Gummi g : gummis) {
			gummiList.append("\t").append(g.toString()).append("\n");
		}
		return "[GummiBag] of: " + this.getBagName() + ", contents:\n" + gummiList
			   + "\ttotal IQ points: " + totalIQpoints;
	}
	
	void addIQpoints (int totalIQpoints) {
		this.totalIQpoints += totalIQpoints;
	}
}
