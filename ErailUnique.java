package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {
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

		
		for (int i = 0; i < trainName.size(); i++) {
			trainList.add(trainName.get(i).getText());

		}
		int listSize = trainList.size();
		System.out.println("The Train Names in List size is "+listSize);
		Collections.sort(trainList);
		System.out.println("The Train Names displayed from LIST are :");
		System.out.println(trainList);
		
		Set<String> trainSet = new HashSet<String>();
		for (int i = 0; i < trainList.size(); i++) {
			trainSet.add(trainList.get(i));
			
		}
		System.out.println("The size of Train Names from SET is "+trainSet.size());
		System.out.println("The train list from the SET ");
		System.out.println(trainSet);
		
		Thread.sleep(3000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ErailUnique er = new ErailUnique();
		er.launchERAIL();

	}

}
