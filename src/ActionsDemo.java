import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Maximise the window
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Test").doubleClick().build().perform();
		
		//move to an element on the page	//built is ready to execute, perform execute
		a.moveToElement(move).contextClick().build().perform();
		

	}

}
