package xl;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GettingLastmodifiedTime {
	public static void main(String args[]) throws IOException {
		
		String path=".\\datafiles\\HealthCheck_27_05_2022.xlsx"; 
		 
		//XLUtility xlutil=new XLUtility (path);
		
		//String lastModifieddate=  "C:\\Users\\SUGKALYA\\OneDrive - Capgemini\\Documents\\workspace-spring-tool-suite-4-4.12.1.RELEASE";
		
		//xlutil.setCellData("Sheet2", 1, 1, lastModified);
		String filePath = "C:\\Users\\SUGKALYA\\OneDrive - Capgemini\\Documents\\workspace-spring-tool-suite-4-4.12.1.RELEASE";
		//Creating the File object
		File file = new File(filePath );
		//File file = new File(filePath);
		//Getting the last modified time
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		XLUtility xlutil=new XLUtility (path);
		//xlutil.setCellData("Sheet2", 1, 1, lastModified);
		System.out.println("Given file was last modified at: ");
		System.out.println(date);}}


