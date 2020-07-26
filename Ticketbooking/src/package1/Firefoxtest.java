package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
	}

}
