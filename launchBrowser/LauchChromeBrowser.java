package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchChromeBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/amitkumar/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

	}

}
