import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Spice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		//RadioButtons
		//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		int radioCount = driver.findElements(By.xpath("//input[@type='radio']")).size();
		//checking the radio button without using value attribute
		for(int i=0; i<radioCount; i++){
			
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			
		}
		
		
		
		//dropdown
		/*driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();*/
		
		//Check Box
		//Checking for is selected
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());	//validation false
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());	//validation true

	}

}
