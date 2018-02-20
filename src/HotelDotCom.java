import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HotelDotCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		
		//Implisit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.hotels.com/");
		driver.findElement(By.id("qf-0q-destination")).sendKeys("nyc");
		driver.findElement(By.id("qf-0q-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("qf-0q-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("qf-0q-localised-check-in")).sendKeys(Keys.ENTER);
		
		//Explicit wait
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='listings']/ol/li[1]/article/div/div[1]/h3/a"))));
		d.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='listings']/ol/li[1]/article/div/div[1]/h3/a"))));
		
		driver.findElement(By.xpath("//*[@id='listings']/ol/li[1]/article/div/div[1]/h3/a")).click();
		

	}

}
