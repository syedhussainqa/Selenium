import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReddifRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("test");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Test pwd");
		driver.findElement(By.xpath("//input[contains(@title, 'Sign')]")).click();

	}

}
