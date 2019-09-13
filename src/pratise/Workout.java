package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.amazon.in");
		WebElement f = d.findElement(By.xpath("(//span[text()='Shop by'])"));
		f.click();
		WebElement g = d.findElement(By.xpath("(//a[text()='All Mobile Accessories'])"));
		g.click();
		WebElement h = d.findElement(By.xpath("(//span[text()='Power Banks'])[3]"));
		h.click();
		WebElement i = d.findElement(By.xpath("(//div[@class='a-row layer backGround'])"));
		i.click();
		WebElement j = d.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		j.click();
		WebElement k = d.findElement(By.xpath("(//input[@id='add-to-cart-button'])"));
		k.click();
		Actions a=new Actions(d);
		a.moveToElement(g).perform();
		a.moveToElement(h).perform();
		a.moveToElement(i).perform();
		a.moveToElement(j).perform();
		Thread.sleep(5000);
	}

}
