package Utils;

import java.io.FileInputStream;
import java.util.Properties;




public class ConfigFileReader {
	private static Properties properties = null;
	

	public String getReportConfigPath(){
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
	
	
	 public ConfigFileReader()
	   {
	      properties = new Properties();
	      try
	      {
	         properties.load(new FileInputStream(getReportConfigPath()));
	      }
	      catch (Exception e)
	      {
	        // LOG.error("Error while initializing properties file: " + e.getMessage());
	         e.printStackTrace();
	         throw new RuntimeException(e);
	      }
	      assert !properties.isEmpty();
	   }
	
}
