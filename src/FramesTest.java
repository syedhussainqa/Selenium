import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		//To find how many frames are present in the page
		driver.findElement(By.tagName("iframe"));
		
		//Switching to frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		driver.findElement(By.id("draggable")).click();
		
		//Declaring web elements
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		
		//Get out of the frame
		driver.switchTo().defaultContent();

	}

}
