package RealTimeTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String BeforeClicking = null;
		String AfterClicking;
		
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ebay.com/");
		
		//Count of link present on entire page, for link the tag is 'a'
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Links present in the page: " + size);
		
		//Count of links in the footer Section of the page
		WebElement footer = driver.findElement(By.xpath("//*[@id='hlGlobalFooter']"));
		int footerLinks = footer.findElements(By.tagName("a")).size();
		System.out.println("Links in the footer page: " + footerLinks);
		
		//Get the links count on the sell column
		WebElement columnLinks = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		int columnLinkCount = columnLinks.findElements(By.tagName("a")).size();
		System.out.println("Column links count: " + columnLinkCount);
		
		//Column links to be displayed on the output
		for(int i=0; i<columnLinkCount; i++){
			
			String Link = columnLinks.findElements(By.tagName("a")).get(i).getText();
			System.out.println(i + " - " + Link);
			
			//Click on a link without knowing the location
			if (Link.contains("Site map")) {
				System.out.println("Original page link: " + driver.getTitle());		//Getting the original page title
				BeforeClicking = driver.getTitle();
				
				columnLinks.findElements(By.tagName("a")).get(i).click();
				break; 		//if task is completed this will come out of the loop
				
			}
			
			
		}
		//Since control is already on the second page, retriving page title from there
		System.out.println("New page link: " + driver.getTitle());
		AfterClicking = driver.getTitle();
		
		//Now comparing both page link to validate they are not the same
		if (BeforeClicking != AfterClicking) {
			
			boolean textDisplayed = driver.getPageSource().contains("Sitemap"); //driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed();
			//driver.getPageSource().contains("Sitemap");
			if (textDisplayed == true) {
				System.out.println("Title is changed after clicking - Validation Pass");
				
			}
		}else {
			System.out.println("Title does not changed after clicking- Validation Fail");
		}
		
		
		

	}

}
