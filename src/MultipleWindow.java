import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;


public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		System.out.println("Before switching");
		
		
		//to get the ids of all the windows open
		Set<String> ids = driver.getWindowHandles();
		
		//to iterate to next wildow handle
		java.util.Iterator<String> it = ids.iterator();
		String parentId = it.next();	//to get the first window id
		String childId = it.next();		//this will go to the next window
		
		//to switch to another window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		//switching back to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());

	}

}
