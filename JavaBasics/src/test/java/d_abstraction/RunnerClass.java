package d_abstraction;

public class RunnerClass {

	public static void main(String[] args) {

		// creating reference
		Robot_Interface robotai;
		// ImprovedRobot improvedbot; // never object for this class
		FullyFunctionalRobot robo;

		// creating object

		// RobotAI robotai = new RobotAI();
		// ImprovedRobot improvedbot = new ImprovedRobot();
		robo = new FullyFunctionalRobot();
		robotai = new FullyFunctionalRobot();

		robo.dance();
		robo.talk();
		robo.sing();
		robo.drawing(); // interface
		Robot_Interface.printSomething(); // interface

		robotai.dance();
		robotai.talk();
		robotai.sing();
		robotai.drawing();

		// Automate Chrome
		// Automate Firefox
		// Automate MicroEdge

		// RemoteWebDriver driver;
	}
}
