import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.guru99.com/");
		
	
	List<WebElement> sub = driver.findElements(By.xpath("//div[@class='col-md-3']//div//h4//following-sibling::ul//li"));
for (int j = 0; j < sub.size(); j++) {
	

	System.out.println(sub.get(j).getText());
}


driver.quit();
	}

}

