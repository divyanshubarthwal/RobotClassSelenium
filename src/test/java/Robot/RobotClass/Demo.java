package Robot.RobotClass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		
		
		//--------------------KEY EVENTS---------------
		//KeyPress() and KeyRelease()
		Robot robot=new Robot();
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//-------------Capturing Screenshots-----------
		//-------------2 ways---------------
		//1.Rectangle
		//2.Screenshot of visible screen
		
		
		//1. Rectangle
		Rectangle rectangle=new Rectangle(50,100,1000,5000);
		BufferedImage scrImage=robot.createScreenCapture(rectangle);
		//to copy the image in Screenshot folder
		ImageIO.write(scrImage, "PNG",new File("./Screenshots/robot.png"));
		
		
		//2. Visible area SS
		
		Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle1=new Rectangle(d);
		BufferedImage scrImage1=robot.createScreenCapture(rectangle1);
		ImageIO.write(scrImage1, "PNG",new File("./Screenshots/robot2.png"));
		
		
		
	
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
