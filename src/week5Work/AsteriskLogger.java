package week5Work;

public class AsteriskLogger implements Logger {

	@Override
	//Problem 4:
	public void log(String st) {
		// TODO Auto-generated method stub
		System.out.println("***" + st + "***");
	}

	
	//Problem 5:
	@Override
	public void error(String st) {
		// TODO Auto-generated method stub
		String error = "Error: " + st;
		int length = error.length() + 6;
		StringBuilder line = new StringBuilder();
		for (int a = 1; a <= length; a++) {
			line.append('*');
		}
		System.out.println(line.toString());
		
		log(error);
		
		System.out.println(line.toString());
	}

}
