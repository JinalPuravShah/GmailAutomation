package PageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Gmail {
	 public  WebDriver ldriver;
	  
		
		public Gmail(WebDriver rdriver)
		{
			ldriver =rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
	
		
   @FindBy(xpath="//input[@class=\"whsOnd zHQkBf\" and @type=\"email\"]")
   WebElement Email;

   
   @FindBy(xpath="//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")
   WebElement Next;
   
   
   @FindBy(xpath="//input[@name=\"Passwd\"]")
   WebElement Password;
   
   
   @FindBy(xpath="//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")
   WebElement Login;
   
	   
   
   @FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
   WebElement Compose;
   
   @FindBy(xpath="//*[@id=\":cb\"]")
   WebElement To;
   
   @FindBy(xpath="//div[@class=\"Am Al editable LW-avf tS-tW\"]")
   WebElement Editor;
   
   
   @FindBy(xpath="//*[@id=\":8g\"]")
   WebElement Subject;
   
   @FindBy(xpath="//div[@class=\"a1 aaA aMZ\"]")
   WebElement Upload;

   @FindBy(xpath="//*[@id=\":86\"]")
   WebElement Send;
   
   @FindBy(xpath="//span[@class=\"nU n1\"]")
   WebElement Inbox;
   
   @FindBy(xpath="//img[@class=\"gb_Ba gbii\"]")
   WebElement AccountLogo;

   @FindBy(xpath="//a[@class=\"CeKP0c BvDXcd OtBgcb\"]")
   WebElement SignOut;


   
   public void SetUsername(String Uname) {
	   Email.clear();
	   Email.sendKeys(Uname);
	   Next.click();
   }
   
   
   public void SetPassword(String pwd) throws InterruptedException {
	   Thread.sleep(4000);
	   Password.clear();
	   Password.sendKeys(pwd);
	   Login.click();
   }
   
   
   
   public void compose(String to ) throws InterruptedException {
	   Thread.sleep(4000);
	   Compose.click();
	   Thread.sleep(4000);
	   To.click();
	   To.sendKeys(to);
	   Editor.click();
   }
   
   public void Subject(String sub) throws InterruptedException {
	  
	
       Subject.click();
	   Subject.sendKeys(sub);
   }
   
   public void upload() {
	  // Upload.click();
	 //String ProjectPath = System.getProperty("user.dir");
	  //Upload.sendKeys(ProjectPath+"\\Document\\Jinal Shah Resume.pdf");
	   Send.click();
   }
   
   public void Inbox() throws InterruptedException {
	   Thread.sleep(1000);
	   Inbox.click();
	   
   }
   
   public void Signout() throws InterruptedException {
	   AccountLogo.click();
	   Thread.sleep(2000);
	   //SignOut.click();
	  
   }
}
