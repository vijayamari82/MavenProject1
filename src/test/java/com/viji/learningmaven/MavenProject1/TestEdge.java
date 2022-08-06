package com.viji.learningmaven.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEdge {
	
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Driver\\Edge Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
		String titleOFThePage = driver.getTitle();
		System.out.println("Title of the page is =" + titleOFThePage);
		Assert.assertEquals(titleOFThePage, "Walmart.com | Save Money. Live Better", "Title not matching");
	}

	@AfterMethod

	public void tearDown() {
		driver.close();

	}


}
