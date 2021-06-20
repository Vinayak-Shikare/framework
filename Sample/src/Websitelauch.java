import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websitelauch {

	public static void main(String[] args) {
		System.out.println("Welcome to flipkart Bro");
		System.setProperty("webdriver.chrome.driver","C:/Users/vshikare/Downloads/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 String title= driver.getTitle();
		 System.out.println(title);
		 driver. quit();
		
		
		

	}
}
