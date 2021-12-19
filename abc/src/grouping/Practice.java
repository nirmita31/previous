package grouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	 public static void main(String[] args) {
		

	
	System.setProperty("webdriver.chrome.driver","C:./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sobhanrstech@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("sabiha2019");
	
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
	driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
	driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
	driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
	
	
	//driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click(); 
	//driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click(); 
	//driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click(); 
	//driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click(); 
	Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		dropDown.selectByVisibleText("M");
		
	driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
	driver.findElement(By.xpath("//*[@name='Submit']")).click();
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]")).click();
	driver.findElement(By.xpath("//*[@id='add_to_cart']")).click();
	driver.findElement(By.xpath("//*[@name='Submit']")).click();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]")).click();
	
		
		
	
	
	//driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
	//driver.findElement(By.xpath("//*[@submit='login']")).click();
	//driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	//driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }

}
