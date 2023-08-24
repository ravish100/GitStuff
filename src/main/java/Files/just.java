package Files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class just {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String dbUrl = "jdbc:oracle:thin:@smowcmite.mckesson.com:1521:l510";					

			//Database Username		
			String username = "vapuser";	
         
			//Database Password		
			String password = "newportal";			
			String NAME = "p00063";	//this value needed when use main		
       
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to Database...");
    
    		//Create Connection to DB		
     	Connection con = DriverManager.getConnection(dbUrl,username,password);
     	
     	if (con != null) {
             System.out.println("Connected to the Database...");
         }
     	
     //	String user = request.getParameter(NAME);
     	String query = "select *  from users where user_name = ?";	
			
			PreparedStatement ps= (PreparedStatement) con.prepareStatement(query);
			ps.setString(1,NAME);
			// System.out.println(query);
   
   		//Create Statement Object		
 	  // Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
  		ResultSet rs= ps.executeQuery();		
  		
  	
  		// While Loop to iterate through all data and print results		
			while (rs.next()){
		        		String myName = rs.getString(3);								        
                    String ip = rs.getString(35);
                  
                     System.out.println("Current value of ip indicator flag for "+ myName +" user :"+"  "+ip);	
                     
                     
             		System.out.println("userid in db while loop:  " +NAME);

	}
	}
}

