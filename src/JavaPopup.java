import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		//To get alert text
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();  //clicking ok on the alert
		//for cancel/NO driver.switch().dismiss()
		//if there is edit box in popup - .alert().sendKeys

	}

}
