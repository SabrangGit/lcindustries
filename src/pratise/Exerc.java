package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exerc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement g = d.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement f = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a=new Actions(d);
		a.dragAndDrop(g, f).perform();
		
	

}
}
