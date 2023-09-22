package automation;

import org.apache.commons.validator.routines.UrlValidator;

//Java program to validate a URL in Java
class Main
{
 public static boolean urlValidator(String url)
 {
     // Get an `UrlValidator` using default schemes
     UrlValidator defaultValidator = new UrlValidator();
     return defaultValidator.isValid(url);
 }

 public static void main(String[] args)
 {
     String url = "https://www.techiedelight.com/";

     // Validate an URL
     if (urlValidator(url)) {
         System.out.print("The url " + url + " is valid");
     }
     else {
         System.out.print("The url " + url + " isn't valid");
     }
 }
}