package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\pratise\\div\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://adactin.com/HotelApp/index.php");
		c.findElement(By.id("username")).sendKeys("RahulPushparaj");
		c.findElement(By.id("password")).sendKeys("8015677546");
		c.findElement(By.id("login")).click();
		WebElement f = c.findElement(By.id("location"));
		Select s = new Select(f);
		s.selectByVisibleText("Melbourne");
	}

}
