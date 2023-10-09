package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomOct9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> phonePrice = new ArrayList<Integer>();
		for(int i=0;i<ele.size();i++) {
			String val = ele.get(i).getText();
			String replaceAll = val.replaceAll(",", "");
			//System.out.println(replaceAll);
			int num = Integer.parseInt(replaceAll);
			phonePrice.add(num);
		}
		System.out.println(phonePrice);
		Collections.sort(phonePrice);
		System.out.println("The least priced phone is "+phonePrice.get(0));
		driver.close();
		

	}

}
