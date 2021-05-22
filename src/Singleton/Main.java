package Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("The value of the memory is the same");
		System.out.println("Position of the object : " + instanceOne);
		System.out.println("Position of the object : " + instanceTwo);
	}
	
}
