package Builder;

public class Builder {
	
	private String propertyOne;
	private int propertyTwo;
	
	private Builder() {
		// empty creator
	}
	
	public static Builder Build() {
		return new Builder();
	}

	public String getPropertyOne() {
		return propertyOne;
	}

	public Builder setPropertyOne(String propertyOne) {
		this.propertyOne = propertyOne;
		return this;
	}
	
	public int getPropertyTwo() {
		return propertyTwo;
	}

	public Builder setPropertyTwo(int propertyTwo) {
		this.propertyTwo = propertyTwo;
		return this;
	}

}
