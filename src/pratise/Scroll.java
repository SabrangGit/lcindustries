package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("(//div[@class='widget-title'])[4]"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		WebElement up = driver.findElement(By.xpath("(//div[@class='ult-spacer spacer-5d5c44111689f'])"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}

}
