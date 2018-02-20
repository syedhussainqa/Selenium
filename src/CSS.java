import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[id='Login']")).click();

	}

}
