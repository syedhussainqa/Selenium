package RealTimeTestCase;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiritAirlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\MySoftware\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spirit.com/Default.aspx");

		// RadioButtons
		int radioCount = driver.findElements(
				By.xpath("//label[@class='for_check']")).size();
		// checking the radio button without using value attribute
		for (int i = 0; i < radioCount; i++) {

			// driver.findElements(By.xpath("//label[@class='for_check']")).get(i).click();
			String txt = driver
					.findElements(By.xpath("//label[@class='for_check']"))
					.get(i).getAttribute("for");

			if (txt.equals("journeyOneWay")) {
				driver.findElements(By.xpath("//label[@class='for_check']"))
						.get(i).click();
			}
		}

		// Select From and To destination
		Select destinationFrom = new Select(driver.findElement(By
				.id("departCityCodeSelect")));
		destinationFrom.selectByValue("OAK");

		Select destinationTo = new Select(driver.findElement(By
				.id("destCityCodeSelect")));
		destinationTo.selectByValue("LGA");
		
		////Set travel calendar //Setting the date to March 1 2018
		driver.findElement(By.id("departDate")).click();
		
		//Selecting Month
//		Boolean b = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div")).getText().contains("March");
//		
//		//Negation if false becomes true, if true + false = false
//		//While loop will keep executing until it becomes false.
//		while(!b){
//			//This will click on the next button
//			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
//			
//		}
		
		
		//Selecting Date
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));	//creating a list where all the dates are stored
		int datesCount = driver.findElements(By.className("ui-state-default")).size();
		
		for(int i= 0; i<datesCount; i++){
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("20")){
				//If date (i == 1) then the loop stops and it clicks on the "1".
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}

		//Adult - To automate dropdown //Select Class
		Select s = new Select(driver.findElement(By.id("paxAdults")));
		s.selectByValue("2");
		/*
		 * s.selectByIndex(6); s.selectByVisibleText("5 adults");
		 */
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
