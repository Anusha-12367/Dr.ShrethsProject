package Test;

import org.testng.annotations.Test;

import Baseclass.BaseUrl;
import Page.Captcha;

public class CaptchaPage extends BaseUrl{
	
	@Test
	
	public void test() throws InterruptedException
	{
		Captcha cp=new Captcha(dr);
		cp.captchatest();
	}

}
