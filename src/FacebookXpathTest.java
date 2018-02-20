import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookXpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
				
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Syed");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Syed");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
		

	}

}
