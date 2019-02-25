import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.bobcat.com/in/en/index");
		printElement();
	}
public static void printElement() throws InterruptedException
{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div//a//i")).click();
Thread.sleep(1000);
	driver.findElement(By.xpath("//div//ul[@id='main-nav']//li//following-sibling::li//following-sibling::li//a")).click();
Thread.sleep(1000);
System.out.println(driver.findElement(By.xpath("//div//ul[@id='main-nav']//li//following-sibling::li//following-sibling::li//a//following-sibling::div//div//div//div//div[2]//div//div//div//div//div/a//div")).getText());
System.out.println(driver.findElement(By.xpath("//div//ul[@id='main-nav']//li//following-sibling::li//following-sibling::li//a//following-sibling::div//div//div//div//div[2]//div//div//div//div//div[2]/a//div")).getText());
System.out.println(driver.findElement(By.xpath("//div//ul[@id='main-nav']//li//following-sibling::li//following-sibling::li//a//following-sibling::div//div//div//div//div[2]//div//div//div//div//div[3]/a//div")).getText());

	//driver.close();
}
}



