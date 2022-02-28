package week3_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery_Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.navigate().to("https://jqueryui.com/resizable/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement resizeElement = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

		Actions actionsResize = new Actions(driver);

		// provide the x and y offset values
		actionsResize.dragAndDropBy(resizeElement, 100, 150).perform();
	}

}
