package step_definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void capturess(WebDriver driver, String screenShotname) {
		
		TakesScreenshot screenshot=(TakesScreenshot)driver; 
		File sourec=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourec,new File("./Screenshot/"+screenShotname+".png"));
		} catch (IOException e) {
		System.out.println("Exception from the screensort: "+e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("ScreenShot taken.");
	}

}
