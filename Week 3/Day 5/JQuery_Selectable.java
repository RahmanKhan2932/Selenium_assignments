package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery_Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/selectable/");

		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//ol[@id='selectable']//li[2]"));
		WebElement b = driver.findElement(By.xpath("//ol[@id='selectable']//li[3]"));
		WebElement c = driver.findElement(By.xpath("//ol[@id='selectable']//li[6]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='selectable']//li[7]"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(a).click(b).click(c).click(d).perform();
		driver.switchTo().defaultContent();
		driver.close();

	}

}
