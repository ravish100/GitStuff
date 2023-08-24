package Files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbtest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub 
		 String dbUrl = "jdbc:oracle:thin:@smowcmite.mckesson.com:1521:l510";					

			//Database Username		
			String username = "vapuser";	
         
			//Database Password		
			String password = "newportal";			
			String NAME = "p00096";	//this value needed when use main

		
         
  	    //Load mysql jdbc driver		
    	   // Class.forName("com.mysql.jdbc.Driver");		
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to Database again...");
    
    		//Create Connection to DB		
     	Connection con = DriverManager.getConnection(dbUrl,username,password);
     	
     	if (con != null) {
             System.out.println("Connected to the Database...");
         }
     	
     	//String NAME2= NAME;
     	NAME=	NAME.toUpperCase();
     	//String NAME1="P00096";
     	System.out.println("u1"+NAME);
     	String query	 = "select * from DCP0.t_iw_user_access where USER_ID like ?";
     	
    // 	String query8     = "select * from DCP0.t_iw_user_access where USER_ID ='"+NAME+"'"; 
      //String query8 = "select * from s_user_account where USER_ID = ?";
     	System.out.println("u2  "+NAME);
		
		PreparedStatement ps= null;
			ps=	 con.prepareStatement(query);
	//	PreparedStatement ps= (PreparedStatement) con.prepareStatement(query);
		ps.setString(1,"%"+NAME+"%");
		//ps.setString(1,NAME);
		System.out.println(query);
 		ResultSet rs= ps.executeQuery();		
 	//	System.out.println(rs);
 		System.out.println("before while  "+NAME);
 	//	System.out.println(query);
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	  //while (rs.next()){
			        		String myName1 = rs.getString(1);								        
	        		String sysid = rs.getString(2);
	        		//String act1 = rs.getString(4);
	        		System.out.println("inside while");
	        		System.out.println(myName1);
                  //  System.out.println("Current account assigned for am2 and rna: "+myName1+','+sysid+','+act1);		
						  }


	}

}
