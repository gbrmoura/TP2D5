package Builder;

public class Main {

	public static void main(String[] args) {
		
		Builder example = Builder.Build()
				.setPropertyOne("Not Found")
				.setPropertyTwo(404);
	
		System.out.println("object --- ");
		System.out.println(" Property One - " + example.getPropertyOne());
		System.out.println(" Property Two - " + example.getPropertyTwo());
		
		// The constructor method is private
		// "new Builder();" can't exist because
		// we use the design pattern build to
		// encapsulate the logic of the construction
	}

}
