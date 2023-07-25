package Page;

import org.openqa.selenium.WebDriver;
import Baseclass.BaseUrl;

public class Captcha extends BaseUrl {
	
	//WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(20));
	//WebElement we1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")));
	
	//By submit=By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/input[2]");
	
	public Captcha(WebDriver dr) {
	
		BaseUrl.dr=dr;
		
	}
	public void captchatest() throws InterruptedException
	{
		
		     Thread.sleep(2000);
	        //dr.findElement(submit).click();
	}
	

}
