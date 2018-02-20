import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//div[@class= 'lst-c']/div/div[2]/div/input")).sendKeys("Test");
		
		//div[@class= 'lst-c']/div/div[2]/div/input

	}

}
