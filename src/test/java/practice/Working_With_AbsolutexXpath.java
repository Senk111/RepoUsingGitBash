package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_With_AbsolutexXpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/Spoint/Downloads/Locators%20demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(""))

	}

}
