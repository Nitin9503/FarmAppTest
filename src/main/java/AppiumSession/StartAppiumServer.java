package AppiumSession;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartAppiumServer {
	
	public static void  startServer() throws IOException, InterruptedException {
		
		// C:\Users\Sachin\Desktop>startappium.bat
			
	//  for window machine bellow is the command for launch termninal
	         Process p1 = Runtime.getRuntime().exec("cmd.exe /c start cd \"Desktop\\startappium.bat");
		    // System.out.println("Launched CMD window");
		
		Thread.sleep(500);
		
		//runtime.exec("cmd / c start C:\\Users\\Sachin\\Desktop\\startappium.bat");
	
		
		
		
		
		
		
	/*	System.out.println("start server1");
		CommandLine cmd = new CommandLine("C:\\Program Files (x86)\\Appium\\node.exe");
		cmd.addArgument("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\Appium.js");
		cmd.addArgument("--address");
		cmd.addArgument("0.0.0.0");
		cmd.addArgument("--port");
		cmd.addArgument("4723");
		System.out.println("start server2");
		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(cmd, handler);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("start server3");
	}

	public static void stopServer() throws InterruptedException {
		System.out.println("stop server1");
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("stop server2");
		Thread.sleep(7000);
	}*/
		

}
}
