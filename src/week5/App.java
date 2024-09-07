package week5;
public class App {

	public static void main(String[] args) {
		

		 // Instantiate AsteriskLogger and SpacedLogger
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger method
        System.out.println("AsteriskLogger - log:");
        asteriskLogger.log("Hello");

        System.out.println("\nAsteriskLogger - error:");
        asteriskLogger.error("Hello");

        // Test SpacedLogger method
        System.out.println("\nSpacedLogger - log:");
        spacedLogger.log("Hello");

        System.out.println("\nSpacedLogger - error:");
        spacedLogger.error("Hello");		
	}

}
