package Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsClass {
	public static WebDriver driver;
public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("Title is : "+driver.getTitle());
	System.out.println("Welcome to world");
	driver.quit();
	
}

}
