package pratise;




import java.io.File;




import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\pratise\\div\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.com");
TakesScreenshot tk = (TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Screenshot\\amazon.jpeg");
FileUtils.copyFile(src,des);
	}

}
