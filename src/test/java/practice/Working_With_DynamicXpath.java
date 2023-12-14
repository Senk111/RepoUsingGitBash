package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_DynamicXpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		
		for (int i = 0; i < 6; i++) 
		{
			WebElement dropDown = driver.findElement(By.id("products-orderby"));	
			Select s = new Select(dropDown);
			s.selectByIndex(i);
			String firstProduct = driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]//a")).getText();
			System.out.println(firstProduct);
			if (i==6) {
				break;
			}
			
		}
		driver.close();

	}

}
