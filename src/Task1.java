import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.guru99.com/");

WebElement element = driver.findElement(By.xpath("//div[@class='col-md-3']//div//h4//b"));
WebElement element2 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::h4//b"));
WebElement element3 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::h4//following-sibling::h4//b"));
WebElement element4 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//h4//b"));
WebElement element5 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//h4//following-sibling::h4//b"));
WebElement element6 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//h4//following-sibling::h4//following-sibling::h4/b"));
WebElement element7 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//following-sibling::div//h4//b"));
WebElement element8 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//following-sibling::div//h4//following-sibling::h4//b"));
WebElement element9 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//following-sibling::div//h4//following-sibling::h4//following-sibling::h4//b"));
WebElement element10 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//following-sibling::div//following-sibling::div//h4//b"));
WebElement element11 = driver.findElement(By.xpath("//div[@class='col-md-3']//following-sibling::div//following-sibling::div//following-sibling::div//h4//following-sibling::h4//b"));

System.out.println(element.getText());
System.out.println(element2.getText());
System.out.println(element3.getText());
System.out.println(element4.getText());
System.out.println(element5.getText());
System.out.println(element6.getText());
System.out.println(element7.getText());
System.out.println(element8.getText());
System.out.println(element9.getText());
System.out.println(element10.getText());
System.out.println(element11.getText());

	}

}
