package Decorator;

public class DecoratorImplements implements IDecorator {
	
	public DecoratorImplements() {
		// Empty creator
	}
	
	@Override
	public String Decorate() {
		return "First Value ";
	}
}
