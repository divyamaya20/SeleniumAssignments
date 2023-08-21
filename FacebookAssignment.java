package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {
	
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dhivya");
		
		driver.findElement(By.name("lastname")).sendKeys("Marimuthu");
		
		driver.findElement(By.name("reg_email__")).sendKeys("+917598784987");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("divyamaya@123");
		
		WebElement drop1 = driver.findElement(By.id("month"));
		
		Select month =new Select(drop1);
		
		month.selectByIndex(1);
		
		WebElement drop2= driver.findElement(By.id("day"));
		
		Select day =new Select(drop2);
		
		day.selectByIndex(13);
		
       WebElement drop3= driver.findElement(By.id("year"));
		
		Select year =new Select(drop3);
		
		year.selectByIndex(34);
		
		driver.findElement(By.className("_58mt")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	

}
