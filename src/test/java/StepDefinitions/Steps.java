package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Gmail;
import io.cucumber.java.en.*;

public class Steps {
	
	public WebDriver driver;
	
	public Gmail gm;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ACC-152\\eclipse-workspace\\GmailAutomation\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    gm = new Gmail(driver);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		}

	
		
	

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and click on Next")
	public void user_enters_email_as_and_click_on_next(String email) {
	    gm.SetUsername(email);
	    
	}

	@When("Password as {string} and click on Login")
	public void password_as_and_click_on_login(String pwd) throws InterruptedException {
	    gm.SetPassword(pwd);
	}

	
	
	@When("click on Compose and click on To as {string}")
	public void click_on_compose_and_click_on_to_as(String to) throws InterruptedException {
	   gm.compose(to);
	}

	
	//@When("enter ")
	//public void enter() throws InterruptedException {
	//    gm.compose(null);
	//}

	@When("click on Subject and enter Subject as {string}")
	public void click_on_subject_and_enter_subject_as(String sub) throws InterruptedException {
	    gm.Subject(sub);
	}

	@When("click on upload and upload pdf document  and click on Send")
	public void click_on_upload_and_upload_pdf_document_and_click_on_send() {
	   gm.upload();
	}

	@When("Click on Inbox")
	public void click_on_inbox() throws InterruptedException {
	    gm.Inbox();
	}

	@When("Click on AccountLogo and Click on Signout and close Browser")
	public void click_on_account_logo_and_click_on_signout_and_close_browser() throws InterruptedException {
	   gm.Signout();
	}


}
