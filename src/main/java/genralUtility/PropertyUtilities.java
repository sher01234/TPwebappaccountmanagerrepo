package genralUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtilities 

{
	public String getProperttFiles(String key) throws Throwable
	
	{
		FileInputStream fis=new FileInputStream("./data/CommonFiles.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}

}
