package Decorator;

public class Decorator implements IDecorator {
	
	private IDecorator decorator;
	
	public Decorator(IDecorator decorator) {
		this.decorator = decorator;
	}
	
	@Override
	public String Decorate() {
		return decorator.Decorate();
	}

}
