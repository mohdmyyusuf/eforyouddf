package com.eforu.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.eforu.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginUser() {
		
		try {
		driver.findElement(By.xpath(OR.getProperty("account"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(OR.getProperty("inp_username"))).sendKeys("mohdmyyusuf@gmail.com");
			driver.findElement(By.xpath(OR.getProperty("inp_password"))).sendKeys("Iloveask@143");
			driver.findElement(By.xpath(OR.getProperty("btn_login"))).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
