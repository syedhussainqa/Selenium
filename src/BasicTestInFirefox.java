import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicTestInFirefox {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.gecko.driver", "C:\\MySoftware\\geckodriver.exe");
		
		//Creating a driver object
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		

	}

}
