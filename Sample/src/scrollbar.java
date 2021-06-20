
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollbar {
	@Test
	public void calculateloanEMI() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Sample\\lib\\seleniumjars\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");

		Actions actions = new Actions(driver);

		WebElement Loanslidercircle = driver.findElement(By.cssSelector("#loanamountslider>span"));
		WebElement interestslidercircle = driver.findElement(By.cssSelector("#loaninterestslider>span"));
		WebElement tenureslidercircle = driver.findElement(By.cssSelector("#loantermslider>span"));
		Thread.sleep(2000);
		actions.dragAndDropBy(Loanslidercircle, 83, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(interestslidercircle, 88, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(tenureslidercircle, -111, 0).build().perform();
		Thread.sleep(2000);

		WebElement loanEMIElement = driver.findElement(By.cssSelector("#emiamount>p>span"));

		String loanEMIText = loanEMIElement.getText();
 //Small changes
		// Assert.assertEquals("80,439",loanEMIText);
		// Thread.sleep(1000);
		System.out.println(loanEMIText);

		driver.get("https://www.google.com/");

		WebElement value = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		value.sendKeys(loanEMIText);
		Thread.sleep(5000);
		driver.quit();

	}

}
