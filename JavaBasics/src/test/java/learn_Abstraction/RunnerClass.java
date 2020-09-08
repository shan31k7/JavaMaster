package learn_Abstraction;

public class RunnerClass {

	public static void main(String[] args) {
		FullyFunctionalRobot robo = new FullyFunctionalRobot();
		//RobotAI robotai = new RobotAI();
		//ImprovedRobot improvedbot = new ImprovedRobot();
		
		RobotAI refRobo;
		ImprovedRobot refImproRobot;
		
		refRobo = new FullyFunctionalRobot();
		refImproRobot = new FullyFunctionalRobot();
		
				
		robo.dance();
		robo.talk();
		robo.sing();
		robo.drawing();
		
		
		// Automate Chrome
		// Automate Firefox
		// Automate MicroEdge
		
		// RemoteWebDriver driver;
	}
}
