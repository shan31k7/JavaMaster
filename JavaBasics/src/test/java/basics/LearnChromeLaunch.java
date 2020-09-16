package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/");

		driver.quit();
	}
}