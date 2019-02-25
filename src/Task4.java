import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	
	public static void main(String[] args) {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.lifetime.life/");
		
	List<WebElement> head = driver.findElements(By.xpath("//div[@id='headerNav']//nav[@aria-label='Primary Navigation']/ul/li/a"));
	for (int i = 0;i< head.size(); i++) {
		if(i==3)
			break;
		System.out.println(head.get(i).getText());
		head.get(i).click();
List<WebElement> sub = driver.findElements(By.xpath("//div[@class='dropdown-menu']//ul//li//following-sibling::li//a"));
for (int i1 = 0; i1 < sub.size(); i1++) {
System.out.println(sub.get(i1).getText());
}
}
driver.quit();
}

}


