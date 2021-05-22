package Decorator;

public class DecoratorValueTwo extends Decorator {

	public DecoratorValueTwo(IDecorator decorator) {
		super(decorator);
	}
	
	public String Value() {
		return "adding new value";
	}
	
	public String Decorate() {
		return super.Decorate() + this.Value();
	}

}
