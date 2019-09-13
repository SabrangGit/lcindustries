package pratise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4work {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("http://www.greenstechnologys.com/selenium-course-content.html");
		 WebElement f = d.findElement(By.xpath("(//strong[text()='Selenium with Appium course syllabus'])"));
	System.out.println(f);
	System.out.println("123");

}
}
