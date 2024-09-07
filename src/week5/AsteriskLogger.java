package week5;
public class AsteriskLogger implements Logger {

    public void log(String message) {
        // The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String
        System.out.println("***" + message + "***");
}

	
	  public void error(String message) {
	        // The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR
	        String errorMessage = "ERROR: " + message;
	        String border = "*".repeat(errorMessage.length() + 8); 
	        System.out.println(border);
	        System.out.println("*** " + errorMessage + " ***");
	        System.out.println(border);
	    }
	}