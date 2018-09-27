package ebayapp;

	import java.io.IOException;
	import java.net.URL;
	import org.openqa.selenium.By;
	import org.openqa.selenium.ScreenOrientation;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import io.appium.java_client.android.AndroidDriver;

	public class ebaymodules {

		public static void main(String[] args) throws IOException
		{
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME,"");
			
			// For Higher version
			dc.setCapability("deviceName","47db12770104");
			dc.setCapability("platformName","android");
			dc.setCapability("platformversion","7.0");
			
			// For Lower version
			//dc.setCapability("deviceName","emulator-5554");
			//dc.setCapability("platformName","android");
			//dc.setCapability("platformversion","4.2.2");
			
			//App package and app activity
			dc.setCapability("appPackage","com.ebay.mobile");
			dc.setCapability("appActivity","com.ebay.mobile.activities.MainActivity");
			
			//Start appium server
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
			URL u=new URL("http://0.0.0.0:4723/wd/hub");
			AndroidDriver driver;
			while(2>1)
			{
				try {
					driver=new AndroidDriver(u,dc);
					break;
				}
				catch(Exception ex)
				{
				}}
			//automation
			try
			{
				//get package name
				String p=driver.getCurrentPackage();
				
				//get currentActivity
				String a=driver.currentActivity();
				System.out.println(p+""+a);

				//get path
				String x=driver.getRemoteAddress().getPath();
				System.out.println(x);
				
				//get protocol
				String y=driver.getRemoteAddress().getProtocol();
				System.out.println(y);
				
				//get Port
				int z=driver.getRemoteAddress().getPort();
				System.out.println(z);
				
				//get Host
				String h1=driver.getRemoteAddress().getHost();
				System.out.println(h1);
				
				//mobile date and time using appium
				String x1=driver.getDeviceTime();
				System.out.println(x1);
				
				//get platform name
				String y1=driver.getPlatformName();
				System.out.println(y1);
				
			    //getdisplaydensity
				long i=driver.getDisplayDensity();
				System.out.println(i);
				
				//screen orientation
				System.out.println(driver.getOrientation());
				driver.rotate(ScreenOrientation.PORTRAIT);
				
				WebDriverWait w=new WebDriverWait(driver,30);
				driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
				Thread.sleep(5000);
				//Click Home
				driver.findElement(By.xpath("//*[@text='Home']")).click();
				
				//Search for 65 inch TV
				WebDriverWait t=new WebDriverWait(driver,100);
				t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search for anything']")));
			    driver.findElement(By.xpath("//*[@text='Search for anything']")).sendKeys("65 inch TV");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='led tv 65 inch']")).click(); 
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click(); 
				Thread.sleep(5000);
				
				//click sort for highest price 
				driver.findElement(By.xpath("//*[@text='SORT']")).click(); 
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='Highest Price + Postage']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click(); 
				Thread.sleep(5000);
				
				//Click filter for view tiles
				driver.findElement(By.xpath("//*[@text='FILTER']")).click(); 
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@content-desc='View results as tiles']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='DONE']")).click(); 
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
				Thread.sleep(5000);
				
				//Click Categories
				driver.findElement(By.xpath("//*[@text='Categories']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='Cameras & Optics']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='Telescope']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
				Thread.sleep(5000);
				
				//click Deals
				driver.findElement(By.xpath("//*[@text='Deals']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
				Thread.sleep(5000);
				// close app
				driver.closeApp();
			}
			catch(Exception ex) 
			{
		            System.out.println(ex.toString());
		        }
	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

	}





