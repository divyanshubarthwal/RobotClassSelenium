package Robot.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoveringMouse {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//Hovering using mouseMove()
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		Robot robot=new Robot();
		robot.mouseMove(280,380);
		//Left click  button1->left click  button3->right click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
			
		robot.delay(2000);
		
	
		driver.quit();
	}

}
