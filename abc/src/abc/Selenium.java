package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
		driver.get("https://www.yahoo.com");
       
		driver.getTitle();
		System.out.println("driver.getTitle()");
		driver.findElement(By.xpath("//*[@class='_yb_s3ern']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("nirmita.b@yahoo.com");
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		driver.findElement(By.xpath("//*[@class='password']")).sendKeys("yahoobn123456");
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		//driver.manage().window().maximize();
		//driver.close();
		//driver.manage().deleteAllCookies();
		//driver.findElement()
	}

}
