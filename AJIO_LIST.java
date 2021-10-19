package week3.day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AJIO_LIST {
	
	ChromeDriver driver = new ChromeDriver();
	
	@SuppressWarnings("deprecation")
	public void launchAjio() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);//To press Enter key
		
		//Gender Checkbox for Men selected
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(3000);
		//Fashion Bags checkbox selected
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		
		//Print the No. of items counts displayed on the screen
		WebElement itemsCount = driver.findElement(By.xpath("(//div[@class='filter']/div)[1]"));
		System.out.println("The number of items count displayed on the screen is "+"'"+itemsCount.getText()+"'");

		//Print the brand names displayed on the screen
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("The displayed brands are ");
		for (int i = 0; i < brand.size(); i++) {
			System.out.println(brand.get(i).getText());
			
		}
		
		//Print the bag names displayed on the screen
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("The Bag Names Displayed on the screen are ");
		for (int i = 0; i < bagName.size(); i++) {
			System.out.println(bagName.get(i).getText());
			
		}
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		AJIO_LIST aj = new AJIO_LIST();
		aj.launchAjio();

	}

}
