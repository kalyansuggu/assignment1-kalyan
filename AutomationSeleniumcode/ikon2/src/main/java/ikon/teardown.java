package ikon;

import okio.ByteString;

public class teardown {
	 private static final String driver = null;
	private static final String Directory = null;

	public static void teardown_()
     {
         // quit driver
         if (driver != null)
             driver.wait();

         // delete all "scoped_dir" temp folders 
         ByteString tempfolder = System.in.Path.GetTempPath();
         ByteString[] tempfiles = Directory.GetDirectories(tempfolder, "scoped_dir*", SearchOption.AllDirectories);
         foreach (string tempfile in tempfiles)
         {
             try
             {
                 System.IO.DirectoryInfo directory = new System.IO.DirectoryInfo(tempfolder);
                 foreach (System.in.DirectoryInfo subDirectory in directory.GetDirectories()) subDirectory.Delete(true);
             }
             catch (Exception ex)
             {
                 writeEx("File '" + tempfile + "' could not be deleted:\r\n" +
                         "Exception: " + ex.Message + ".");
             }
         }
     } 
}
