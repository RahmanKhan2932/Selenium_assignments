package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification--");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.nykaa.com/");
		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.linkText("BRANDS"));
		act.moveToElement(ele).perform();

		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();

		String c = driver.getTitle();
		System.err.println(c);

		driver.findElement(By.className("sort-name")).click();
		// driver.findElement(By.xpath("//input[@id='radio_name_undefined']")).click();
		driver.findElement(By.xpath("//ul[@class='css-z5o5ca']/div[4]")).click();

		WebElement ele1 = driver.findElement(By.xpath("//a[text()='hair']"));
		act.moveToElement(ele1).perform();

		driver.findElement(By.linkText("Shampoo")).click();

		driver.findElement(By.xpath("//span[text()='Concern']")).click();
//		Thread.sleep(3000);
//		driver.quit();
//		

	}

}
