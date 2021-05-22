package Singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton () {
		// empty creator
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void destroyInstance() {
		instance = null;
	}
	
}
