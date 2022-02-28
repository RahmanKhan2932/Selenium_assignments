package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		option.addArguments("--disable-notification--");
		driver.get("https://www.snapdeal.com/");

		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.linkText("Men's Fashion"));
		act.moveToElement(ele).perform();

		driver.findElement(By.linkText("Sports Shoes")).click();
		String shoe_count = driver.findElement(By.xpath("//div[@class='sub-cat-count ']")).getText();
		System.out.println("Shoe Count : " + shoe_count);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.className("sort-selected")).click();

		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("900");

		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");

		driver.findElement(By.xpath("//div[@class='filter-inner']/div[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Navy']/..")).click();
		
		WebElement image = driver.findElement(By.xpath("//img[@class='product-image wooble'][1]"));
		//Thread.sleep(3000);
		act.moveToElement(image).perform();
		driver.findElement(By.xpath("//div[@pogid='636403746951']")).click();

	}

}
