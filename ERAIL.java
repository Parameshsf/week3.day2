package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERAIL {
	ChromeDriver driver = new ChromeDriver();

	@SuppressWarnings("deprecation")
	public void launchERAIL() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Click the checkbox 'Sort on Date'
		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		// driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']")).click();
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);

		driver.findElement(By.id("txtStationTo")).click();
		driver.findElement(By.id("txtStationTo")).sendKeys("DLI");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		// driver.findElement(By.xpath("//div[@title='Delhi']")).click();

		driver.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(5000);

		List<WebElement> trainName = driver.findElements(By.xpath("//td[@style=';']"));

		List<String> trainList = new ArrayList<String>();

		System.out.println("The Train Names displayed are :");
		for (int i = 0; i < trainName.size(); i++) {
			trainList.add(trainName.get(i).getText());

		}
		Collections.sort(trainList);
		System.out.println(trainList);
		
		Thread.sleep(3000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ERAIL er = new ERAIL();
		er.launchERAIL();

	}

}
