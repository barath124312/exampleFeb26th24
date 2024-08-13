package com.bharath.actitime.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination {
	public static WebDriver bro=null;
	/**
	 * Author:
	 * Step name:I launch the chrome browser
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
	{
		try {
			bro=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I navigate url of the application
	 */
	@And("^I navigate url of the application$")
	public void I_navigate_url_of_the_application()
	{
		try {
			bro.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I navigate url of the application
	 */
	@When("^I Enter the Username and Password in textfield$")
	public void I_Enter_the_Username_and_Password_in_textfield()
	{
		try {
			bro.findElement(By.id("username")).sendKeys("admin");
			bro.findElement(By.name("pwd")).sendKeys("manager");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I click on the login button
	 */
	@And("^I click on the login button$")
	public void I_click_on_the_login_button()
	{
		try {
		bro.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I click on the login button
	 */
	@And("^I minimise flyout window$")
	public void I_minimise_flyout_window()
	{
		try {
			bro.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I find home page
	 */
	@And("^I find home page$")
	public void I_find_home_page()
	{
		try {
			WebElement we=bro.findElement(By.xpath("//td[text()='Enter Time-Track']")).click();
			Assert.assertTrue(we.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I click on the login button
	 */
	@And("^click on logout$")
	public void click_on_logout()
	{
		try {
			bro.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Step name:I click on the login button
	 */
	@And("^I close The application$")
	public void I_close_The_application()
	{
		try {
			bro.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
