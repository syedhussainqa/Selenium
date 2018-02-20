import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
				System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
				
				//Creating a driver object
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://login.salesforce.com/");
				driver.findElement(By.id("username")).sendKeys("sflogin");
				driver.findElement(By.name("pw")).sendKeys("123456");
				//driver.findElement(By.cssSelector("#username")).sendKeys("email");
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				System.out.println(driver.findElement(By.cssSelector("#error")).getText());
				
	}

}
