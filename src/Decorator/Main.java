package Decorator;

public class Main {

	public static void main(String[] args) {
		
		IDecorator firstClass = new DecoratorImplements();
		
		System.out.println("this value represents the first value of decorator");
		System.out.println("value - " + firstClass.Decorate() + "\n");
		
		IDecorator secondClass = new DecoratorValueTwo(firstClass);
		
		System.out.println("this value represents the second value of decorator");
		System.out.println("value - " + secondClass.Decorate() + "\n");
		
	}

}
