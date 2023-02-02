package week5;

import a.AsteriskLogger;
import b.SpacedLogger;

public class App {

	public static void main(String[] args) {
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger1.log("macaroni and cheese");
		logger1.error("nuggets");
		
		logger2.log("corn on the cob");
		logger2.error("ice cream");

	}

}
