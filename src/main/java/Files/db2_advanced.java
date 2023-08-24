package Files;

//import java.sql.*;

//import  java.sql.Connection;		
//	import  java.sql.Statement;		
//import  java.sql.ResultSet;		
//import  java.sql.DriverManager;		
//import  java.sql.SQLException;	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class db2_advanced {
	// public static void main(String[] args) throws ClassNotFoundException,
	// SQLException {
	public static void dbase(String NAME) throws ClassNotFoundException, SQLException, InterruptedException {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		String dbUrl = "jdbc:oracle:thin:@smowcmite.mckesson.com:1521:l510";
		String username = "vapuser";
		String password = "newportal";
	//	 String NAME = "p00063"; //this value needed when use main

		System.out.println("printname1:" + NAME);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Connecting to Database...");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		if (con != null) {
			System.out.println("Connected to the Database...");
		}
		
		Thread.sleep(9000);
		try
		{
		
String query1 = "UPDATE users SET CHK_IP_IND='N' where user_name = ?";	
		
		PreparedStatement ps1= (PreparedStatement) con.prepareStatement(query1);
		ps1.setString(1,NAME);
		
		int rs1=ps1.executeUpdate();
		
		if(rs1 > 0)

		{

		System.out.println("FLAG updated");

		}

		else

		{

		System.out.println("FLAG update failed");
		}
		}
		catch(Exception e)

		{

		System.out.println(e.getMessage());

		}
		
		
		
	
		// String user = request.getParameter(NAME);
		String query = "select *  from users where user_name = ?";
		

		PreparedStatement ps= (PreparedStatement) con.prepareStatement(query);
		
		
		ps.setString(1,NAME);
	//	System.out.println(query);
		System.out.println("printname2:" + NAME);

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = ps.executeQuery();
		System.out.println("printname3:" + NAME);

		// While Loop to iterate through all data and print results
	
//		
		while (rs.next()){
    		String myName = rs.getString(3);								        
        String ip = rs.getString(35);
      
         System.out.println("Current value of ip indicator flag for "+ myName +" user :"+"  "+ip);	
         
         
 		System.out.println("userid in db while loop:  " +NAME);

}
		//	 query again to get updated value
			String query5 = "select *  from users where user_name = ?";

			PreparedStatement ps5 = (PreparedStatement) con.prepareStatement(query5);
			ps5.setString(1, NAME);

			System.out.println("printname5:" + NAME);
			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs5 = ps5.executeQuery();

			while (rs5.next()) {
				String ip1 = rs5.getString(35);
				ResultSetMetaData rsmd = rs5.getMetaData();
				String name5 = rsmd.getColumnName(35);
				System.out.println(name5);

				System.out.println("CHK_IP_IND updated value:" + "  " + ip1);
				System.out.println("appl_feature_access_cds value:" + "  " + rs5.getString(49));
				System.out.println("sgmnt_cd:" + "  " + rs5.getString(44));
				System.out.println("hq_access_ind value:" + "  " + rs5.getString(59));
				System.out.println("mod_prfl_ind value:" + "  " + rs5.getString(42));
				System.out.println("password_mod_flag value:" + "  " + rs5.getString(65));
				System.out.println("force_e_mail_update_flag value:" + "  " + rs5.getString(70));
				System.out.println("rna_type_cd value:" + "  " + rs5.getString(57));
				System.out.println("rna_valu value:" + "  " + rs5.getString(58));
				System.out.println("loginAsOverride value:" + "  " + rs5.getString(68));

				System.out.println("Checking groups assigned to user::::::::::::::");

				String query6 = "select NAME,USER_NAME from users u, usergroups ug, usergroupmembership ugm where ugm.user_uid = u.unique_id and UG.UNIQUE_ID = ugm.group_uid and u.user_name =  ?";

				PreparedStatement ps6 = (PreparedStatement) con.prepareStatement(query6);
				ps6.setString(1, NAME);

				// Execute the SQL Query. Store results in ResultSet
				ResultSet rs6 = ps6.executeQuery();

				while (rs6.next()) {
					String gp = rs6.getString(1);

					System.out.println("gps assigned:" + "  " + gp);

				}

  	         		

				//}

			}

			// closing DB Connection
			con.close();
		}
	 }
	

