package TestBase;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemalathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("hemalathak");
		driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("maveric@1");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input")).click();
		Thread.sleep(2000);
		WebElement Welcome = driver.findElement(By.xpath("//a[text()='Welcome (Hemalatha Kalliappan)']/parent::li"));
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout ']"));
		Actions d1 =new Actions(driver);
		d1.moveToElement(Welcome).click(logout).build().perform();;
		driver.close();
	}
	@Test
	public void method() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemalathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("hemalathak");
		driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("maveric@1");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input")).click();
		Thread.sleep(2000);
		WebElement Welcome = driver.findElement(By.xpath("//a[text()='Welcome (Hemalatha Kalliappan)']/parent::li"));
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout ']"));
		Actions d1 =new Actions(driver);
		d1.moveToElement(Welcome).click(logout).build().perform();;
		driver.close();
	}
	
	@Test
	public void method1() throws InterruptedException {
	 int ar[] = {1, 2, 3, 4, 5}; 
     for (int i=0; i<=ar.length; i++) 
       System.out.println(ar[i]); 
	}
	
	@Test
	public void method3() throws InterruptedException {
		int d = 0;
	      int n = 20;
	      int fraction = n/d;
	     System.out.println("End Of Main");
	}
	
	}
