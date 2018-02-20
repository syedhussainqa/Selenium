import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//we have landed to the correct URL
		System.out.println(driver.getCurrentUrl());
		
		//Get page source
		System.out.println(driver.getPageSource());
		
		//Navigate to new URL and go back
		driver.get("http://yahoo.com");
		driver.navigate().back();
		
		//close the browser
		driver.close();  //closes the current browser
		driver.quit();		//closes all the browser and all child browser
		*/
		
		driver.get("http://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("Sample code");
		
		driver.findElement(By.linkText("Forgot account?")).click();
*/
		/*driver.findElement(By.className("inputtext")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();*/
		
		
	}

}
