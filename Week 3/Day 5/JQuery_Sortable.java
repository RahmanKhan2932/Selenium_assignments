package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery_Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/sortable/");

		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']//li[1]"));
		WebElement target = driver.findElement(By.xpath("//ul[@id='sortable']//li[5]"));
		Actions act = new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().perform();
		act.click(source).clickAndHold().moveToElement(target).moveByOffset(0, 10).release().build().perform();
		driver.switchTo().defaultContent();

	}

}
