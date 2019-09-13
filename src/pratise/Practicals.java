package pratise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicals {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
WebElement f = d.findElement(By.xpath("//button[text()='Try it']"));
f.click();
Thread.sleep(5000);
Alert a = d.switchTo().alert();
a.accept();
String t = f.getText();
System.out.println(t);
TakesScreenshot tk=(TakesScreenshot)d;
File s = tk.getScreenshotAs(OutputType.FILE);
File de = new File("C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\image.png");
FileUtils.copyFile(s, de);




}
}
