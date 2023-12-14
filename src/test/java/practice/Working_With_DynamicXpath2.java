package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_With_DynamicXpath2 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		
		List<WebElement> allAddProduct = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement product : allAddProduct) 
		{
			product.click();
			Thread.sleep(3000);
		}
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		
		
	}

}
