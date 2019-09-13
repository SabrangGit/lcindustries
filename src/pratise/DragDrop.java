package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		WebElement dragt = driver.findElement(By.id("fourth"));
		WebElement dropt = driver.findElement(By.id("amt7"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Actions b=new Actions(driver);
		b.dragAndDrop(dragt, dropt).perform();
	

}}
