package Robot.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	
		
		//-----Scroll Page with mouseWheel()----------
		//robot.delay(1000) is similar to thread.sleep()
		
		Robot robot=new Robot();
		robot.mouseWheel(15);
		robot.delay(3000);
		robot.mouseWheel(-5);
		
		
		
		
	}

}
