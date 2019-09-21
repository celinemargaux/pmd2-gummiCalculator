class Type {
	private String typeName;
	
	Type (final String typeName) {
		this.typeName = typeName;
	}
	
	String getTypeName () {
		return typeName;
	}
	
	public String toString () {
		return this.getTypeName();
	}
}