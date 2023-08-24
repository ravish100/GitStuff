package mck2023;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteDemo extends ReadingNotepadData{

			
	
		 //   public static void main(String[] args) throws IOException
	public static String ReadwriteUser(String NAME) throws IOException{
		    {
		        // Open the file.
		    	
		    	
		       
		        FileWriter fw = new FileWriter("C:\\Users\\e3ph06j\\eclipse-workspace\\mck23\\userdata2.txt",  true);
		        
		        PrintWriter out = new PrintWriter(fw); // Step 2
		        
		        
		        // Write the name of four oceans to the file
		        //out.println("Atlantic");   // Step 3
		       // String version = "n0001";
		        //String newVersion = version + (Integer.parseInt(version.substring(1,version.length()))+1);
		       String u1="",newVersion="z0001";
		       u1=ReadingNotepadData.ReadUser(u1);
		      //  ReadingNotepadData.ReadUser(String u1);
		        System.out.println("printing u1="+u1);
		        newVersion = "z000" + (Integer.parseInt(u1.substring(1,u1.length()))+1);
		        if(u1.equalsIgnoreCase(newVersion))
		        	{newVersion=u1;
		        	 newVersion = "z000" + (Integer.parseInt(newVersion.substring(1,newVersion.length()))+1);
			    System.out.println(newVersion);
		        	}
			 out.println(newVersion);
		        // Close the file.
			 out.close();  // Step 4
		        return u1;
		    }
		   
	}
	 
}
	

	
