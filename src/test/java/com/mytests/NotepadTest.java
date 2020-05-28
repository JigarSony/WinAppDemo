package com.mytests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.windows.WindowsDriver;

public class NotepadTest {
	
	public  WindowsDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("plateform", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
		
		
		try {
			driver = new WindowsDriver(new URL("http://127.0.0.1:4273"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
		setUp();
	}

	
	@Test(priority=1)
	public void checkHelpAboutNowTest() {
		
		driver.findElementByName("Help").click();
		driver.findElementByName("About Notepad").click();
		driver.findElementByName("OK").click();
	}
	
	@Test(priority=2)
	public void sendTextTest() {
		driver.findElementByName("Text Editor").sendKeys("This is Notepad automating by Jigar "
				+ "\n This is my 1st Desktop Automation");
		driver.findElementByName("Text Editor").clear();
	}
	
	@Test(priority=3)
	public void getTimeAndDate() {
		driver.findElementByName("Edit").click();
		//driver.findElementByName("Time/Date").click();
		driver.findElementByAccessibilityId("26").click();
		//driver.findElementByName("Text Editor").clear();
		String value = driver.findElementByName("Text Editor").getAttribute("Value.Value");
		System.out.println(value);
		Assert.assertTrue(value.contains("27-05-2020"));
	}
}
