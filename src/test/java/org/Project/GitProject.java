package org.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitProject {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver d =new ChromeDriver();
	
	d.get("https://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	d.switchTo().frame("navbar-iframe");
	WebElement textf = d.findElement(By.xpath("//input[@id='b-query']"));
     textf.sendKeys("selenium");
	WebElement search = d.findElement(By.id("b-query-icon"));
	search.click();
	
     d.switchTo().defaultContent();
	
     Thread.sleep(4000);
	WebElement mulselect = d.findElement(By.id("multiselect1"));
    Select sc = new Select(mulselect);
	sc.selectByIndex(1);
	sc.selectByValue("Hyundaix");
	sc.selectByVisibleText("Volvo");
	
	WebElement singleselect = d.findElement(By.id("drop1"));
	Select sc1 = new Select(singleselect);
	sc1.selectByIndex(1);
	
	WebElement preload = d.findElement(By.xpath("//*[@name='fname']"));
    preload.clear();
    preload.sendKeys("driver");
    
    WebElement newlink = d.findElement(By.xpath("//a[text()='SeleniumTutorial']"));
    newlink.click();

}

}
