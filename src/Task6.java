import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.netflix.com/in/login");
Thread.sleep(1000);
	driver.findElement(By.xpath("//div/div/div[3]/div/div/div/form/div/div/div/label/input")).sendKeys("kartyuu");
	driver.findElement(By.xpath("//div/div/div[3]/div/div/div/form/div[2]/div/div/label/input")).sendKeys("12345689");
	driver.findElement(By.xpath("//div/div/div[3]/div/div/div/form/button")).click();
	
	System.out.println(driver.findElement(By.xpath("//div[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]")).getText());
	
	}

}


