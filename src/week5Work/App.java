package week5Work;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Problems 9,10,11:
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("There appears to be an error.");
		System.out.println();
		asteriskLogger.error("Welp, that's an error.");
		System.out.println();
		
		spacedLogger.log("Error question mark?");
		System.out.println();
		spacedLogger.error("There appears to be a rather fat error, sir.");
	}

}
