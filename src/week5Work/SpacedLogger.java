package week5Work;

public class SpacedLogger implements Logger{

	@Override
	public void log(String st) {
		// TODO Auto-generated method stub
		
		// Problem 6,7:
		
		StringBuilder log = new StringBuilder();
		for (int a = 0; a < st.length(); a++) {
			log.append(st.charAt(a) + " ");
		}
		
		System.out.println(log);
	}
// Problem 8:
	
	@Override
	public void error(String st) {
		// TODO Auto-generated method stub
		
	System.out.println("Error: ");
	log(st);
	}

}
