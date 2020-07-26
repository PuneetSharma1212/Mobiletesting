package package1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jetairways {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.findElement(By.className("select_CTXT")).click();
		// driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		// driver.findElement(By.cssSelector("#searchDropdownBox")).click();

		// driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']")).click();

		// driver.findElement(By.cssSelector("[class='icp-nav-flag
		// icp-nav-flag-us']")).click();

		// System.out.println(driver.findElement(By.linkText("Amazon's response to
		// COVID-19")));

		// driver.findElement(By.cssSelector("span.'icp-nav-flag
		// icp-nav-flag-us'")).click();
		// driver.findElement(By.cssSelector("span[class='icp-nav-flag
		// icp-nav-flag-us']")).click();

		// driver.findElement(By.xpath("//a[contains(@class,'nav-swm-text')]")).click();
		// -> Xpath Regular expression

		// driver.findElement(By.xpath("//div[@class='search-icon']/parent::div[@id='fakebox']/parent::div[@id='fakebox-container']")).click();

		// Select s = new
		// Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		// s.selectByValue("USD");

		// Select s = new
		// Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		// s.selectByIndex(4);

		

		String[] items = { "Cucumber", "Beetroot" };
		List itemslist = Arrays.asList(items);
		List<WebElement> s = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < s.size(); i++) {
            
			String[] formatedname = s.get(i).getText().split("-");
			String formatedname2 = formatedname[0].trim();
			
			
			String name = s.get(i).getText();

			
			if (itemslist.contains(formatedname2))

			{
				
				driver.findElements(By.xpath("//buttom[text()='ADD TO CART']")).get(i).click();
				
			}

		}

	}

}