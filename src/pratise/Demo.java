package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("http://greenstechnologies.in/selenium-training.php");
			WebElement f = d.findElement(By.xpath("(//a[text()='COURSES'])"));
			
			WebElement h = d.findElement(By.xpath("(//span[text()='Oracle DBA Training']"));
			h.click();
			Actions a=new Actions(d);
			a.moveToElement(f).perform();
		
			d.quit();

			
			
			
			
			
			
			
}
}