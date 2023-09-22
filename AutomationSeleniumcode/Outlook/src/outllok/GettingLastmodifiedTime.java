package outllok;



import java.io.File;
import java.util.Date;
public class GettingLastmodifiedTime {
public static void main(String args[]) {
String filePath = "C:\\Users\\SUGKALYA\\OneDrive - Capgemini\\Documents\\workspace-spring-tool-suite-4-4.12.1.RELEASE";
//Creating the File object
File file = new File(filePath);
//Getting the last modified time
long lastModified = file.lastModified();
Date date = new Date(lastModified);
System.out.println("Given file was last modified at: ");
System.out.println(date);}}



	
	
	

