final class TypeTable {
	private final double[][] effectivity = new double[17][17];
	/*
	 *  0: normal
	 *  1: fire
	 *  2: water
	 *  3: electric
	 *  4: grass
	 *  5: ice
	 *  6: fighting
	 *  7: poison
	 *  8: ground
	 *  9: flying
	 * 10: psychic
	 * 11: bug
	 * 12: rock
	 * 13: ghost
	 * 14: dragon
	 * 15: dark
	 * 16: steel
	 *
	 * 		1 		== 		normal
	 * 		2 		== 		strong
	 * 		0.5 	== 		weak
	 * 		0 		== 		no Effect
	 */
	
	TypeTable () {
		effectivity[0] = new double[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 0.5};
		effectivity[1] = new double[] {1, 0.5, 0.5, 1, 2, 2, 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2};
		effectivity[2] = new double[] {1, 2, 0.5, 1, 0.5, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 1};
		effectivity[3] = new double[] {1, 1, 2, 0.5, 0.5, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5, 1, 1};
		effectivity[4] = new double[] {1, 0.5, 2, 1, 0.5, 1, 1, 0.5, 2, 0.5, 1, 0.5, 2, 1, 0.5, 1, 0.5};
		effectivity[5] = new double[] {1, 0.5, 0.5, 1, 2, 0.5, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5};
		effectivity[6] = new double[] {2, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 0.5, 2, 0, 1, 2, 2};
		effectivity[7] = new double[] {1, 1, 1, 1, 2, 1, 1, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 1, 1, 0};
		effectivity[8] = new double[] {1, 2, 1, 2, 0.5, 1, 1, 2, 1, 0, 1, 0.5, 2, 1, 1, 1, 2};
		effectivity[9] = new double[] {1, 1, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0.5};
		effectivity[10] = new double[] {1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 1, 1, 1, 0, 0.5};
		effectivity[11] = new double[] {1, 0.5, 1, 1, 2, 1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 0.5, 1, 2, 0.5};
		effectivity[12] = new double[] {1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 0.5};
		effectivity[13] = new double[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 0.5};
		effectivity[14] = new double[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5};
		effectivity[15] = new double[] {1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 0.5};
		effectivity[16] = new double[] {1, 0.5, 0.5, 0.5, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5};
	}
	
	double getEffectivity (Type gummiType, Type pokemonType) {
		int attackPosition = translate(gummiType);
		int defendPosition = translate(pokemonType);
		return effectivity[attackPosition][defendPosition];
	}
	
	int getPoints (Type gummiType, Type pokemonType) {
		int points = 0;
		
		if (gummiType.getTypeName().equals(pokemonType.getTypeName())) {
			points = 5;
		} else if (gummiType.getTypeName().equals("wonder")) {
			points = 5;
		} else {
			String effectivityPoints = String.valueOf(getEffectivity(gummiType, pokemonType));
			switch (effectivityPoints) {
				case "0" : {
					points = 1;
					break;
				}
				case "0.5": {
					points = 2;
					break;
				}
				case "1.0": {
					points = 3;
					break;
				}
				case "2.0": {
					points = 4;
					break;
				}
			}
		}
		return points;
	}
	
	private int translate (Type type) {
		int number = 100;
		
		switch (type.getTypeName()) {
			case "normal": {
				number = 0;
				break;
			}
			case "fire": {
				number = 1;
				break;
			}
			case "water": {
				number = 2;
				break;
			}
			case "electric": {
				number = 3;
				break;
			}
			case "grass": {
				number = 4;
				break;
			}
			case "ice": {
				number = 5;
				break;
			}
			case "fighting": {
				number = 6;
				break;
			}
			case "poison": {
				number = 7;
				break;
			}
			case "ground": {
				number = 8;
				break;
			}
			case "flying": {
				number = 9;
				break;
			}
			case "psychic": {
				number = 10;
				break;
			}
			case "bug": {
				number = 11;
				break;
			}
			case "rock": {
				number = 12;
				break;
			}
			case "ghost": {
				number = 13;
				break;
			}
			case "dragon": {
				number = 14;
				break;
			}
			case "dark": {
				number = 15;
				break;
			}
			case "steel": {
				number = 16;
				break;
			}
		}
		return number;
	}
}