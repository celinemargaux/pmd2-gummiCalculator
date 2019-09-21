public class ColourSetting {
	private Type type;
	private String colour;
	
	public ColourSetting (Type type) {
		this.type = type;
	}
	
	String giveColour () {
		setColour();
		return colour;
	}
	
	private void setColour () {
		switch (type.getTypeName()) {
			case "normal": {
				colour = "white";
				break;
			}
			case "fire": {
				colour = "red";
				break;
			}
			case "water": {
				colour = "blue";
				break;
			}
			case "grass": {
				colour = "grass";
				break;
			}
			case "electric": {
				colour = "yellow";
				break;
			}
			case "ice": {
				colour = "clear";
				break;
			}
			case "fighting": {
				colour = "orange";
				break;
			}
			case "ground": {
				colour = "brown";
				break;
			}
			case "poison": {
				colour = "pink";
				break;
			}
			case "flying": {
				colour = "sky";
				break;
			}
			case "psychic": {
				colour = "gold";
				break;
			}
			case "bug": {
				colour = "green";
				break;
			}
			case "rock": {
				colour = "grey";
				break;
			}
			case "ghost": {
				colour = "purple";
				break;
			}
			case "dragon": {
				colour = "royal";
				break;
			}
			case "dark": {
				colour = "black";
				break;
			}
			case "steel": {
				colour = "silver";
				break;
			}
			case "wonder": {
				colour = "wonder";
				break;
			}
		}
	}
}