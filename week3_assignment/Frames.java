package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input")).sendKeys("Pet Animals");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("animals")).click();
		driver.findElement(By.xpath("//option[text()='Baby Cat']")).click();
		driver.switchTo().defaultContent();

	}

}
