package UdemyContd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class V152HowToWriteGlobalParametersWithJavaCode 
{
	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Project\\src\\main\\java\\Global.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\Project\\src\\main\\java\\Global.properties");
		prop.store(fos, null);
		
		
	}

}
