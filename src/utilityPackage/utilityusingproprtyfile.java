package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityusingproprtyfile {
	public static String getdatafrompropertyfile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\manis\\eclipse-workspace0\\11dec -batch B\\myfile.properties");
		
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	public static void getScreenshot(WebDriver driver,int TCID) throws IOException
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\screenshots\\TC"+TCID+"screenshot.png";
		File Dest=new File(path);
		FileHandler.copy(Source, Dest);
	}

}
