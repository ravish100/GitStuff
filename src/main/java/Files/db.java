package Files;

import  java.sql.*;	
	//import  java.sql.Connection;		
//	import  java.sql.Statement;		
	//import  java.sql.ResultSet;		
	//import  java.sql.DriverManager;		
	//import  java.sql.SQLException;		
	public class  db {				
	    	//public static void  main(String[] args) throws  ClassNotFoundException, SQLException {		
		public static void dbase(String NAME) throws ClassNotFoundException, SQLException {
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:oracle:thin:@smowcmite.mckesson.com:1521:l510";					

					//Database Username		
					String username = "vapuser";	
	                
					//Database Password		
					String password = "newportal";			
					//String NAME = "p00063";	//this value needed when use main

				
	                
	         	    //Load mysql jdbc driver		
	           	   // Class.forName("com.mysql.jdbc.Driver");		
					//Class.forName("oracle.jdbc.driver.OracleDriver");
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
	                            
	                    		
					if(ip.equals("Y"))
						 System.out.println("Code successfully converted YES value to Y in Legacy DB for CHK_IP_IND");
					System.out.println("Set ip indicator back to N for login :-");	
					
					
					//Code to update db value
					
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
					}
					
					
					//query again to get updated value
String query5 = "select *  from users where user_name = ?";	
					
					PreparedStatement ps5= (PreparedStatement) con.prepareStatement(query5);
					ps5.setString(1,NAME);
							
	       
	       			// Execute the SQL Query. Store results in ResultSet		
	         		ResultSet rs5= ps5.executeQuery();		
	         		
	         		while (rs5.next()){								        
                       String ip1 = rs5.getString(35);
                       ResultSetMetaData rsmd = rs5.getMetaData();
                       String name5 = rsmd.getColumnName(35);
                       System.out.println(name5);
                       
                        System. out.println("CHK_IP_IND updated value:"+"  "+ip1);
                        System. out.println("appl_feature_access_cds value:"+"  "+rs5.getString(49));
                        System. out.println("sgmnt_cd:"+"  "+rs5.getString(44));
                        System. out.println("hq_access_ind value:"+"  "+rs5.getString(59));
                        System. out.println("mod_prfl_ind value:"+"  "+rs5.getString(42));
                        System. out.println("password_mod_flag value:"+"  "+rs5.getString(65));
                        System. out.println("force_e_mail_update_flag value:"+"  "+rs5.getString(70));
                        System. out.println("rna_type_cd value:"+"  "+rs5.getString(57));
                        System. out.println("rna_valu value:"+"  "+rs5.getString(58));
                        System. out.println("loginAsOverride value:"+"  "+rs5.getString(68));
                        
                        System. out.println("Checking groups assigned to user::::::::::::::");
                        
                        String query6 = "select NAME,USER_NAME from users u, usergroups ug, usergroupmembership ugm where ugm.user_uid = u.unique_id and UG.UNIQUE_ID = ugm.group_uid and u.user_name =  ?";	
    					
    					PreparedStatement ps6= (PreparedStatement) con.prepareStatement(query6);
    					ps6.setString(1,NAME);
    							
    	       
    	       			// Execute the SQL Query. Store results in ResultSet		
    	         		ResultSet rs6= ps6.executeQuery();		
    	         		
    	         		while (rs6.next()){								        
                           String gp = rs6.getString(1);
                          
                          
                           
                            System. out.println("gps assigned:"+"  "+gp);
                            
                            
                                                 
					}
    	         		
    	         		
       System. out.println("Checking ip assigned to user::::::::::::::");
                        
                        String query7 = "select * from s_ip_range where user_id =  (select USER_id from users where user_name =  ?)";	
    					
    					PreparedStatement ps7= (PreparedStatement) con.prepareStatement(query7);
    					ps7.setString(1,NAME);
    							
    	       
    	       			// Execute the SQL Query. Store results in ResultSet		
    	         		ResultSet rs7= ps7.executeQuery();		
    	         		
    	         		while (rs7.next()){								        
                           String ip = rs7.getString(3);
                           String ip5 = rs7.getString(4);
                          
                          
                           
                            System. out.println("IP assigned:"+"  "+ip+":"+ip5);
    	         		}
					
	         		}
					
					
	      			 // closing DB Connection		
	      			con.close();			
			}
		
		
		
		public static void dbase2(String NAME) throws ClassNotFoundException, SQLException {
			//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
            String dbUrl = "jdbc:oracle:thin:@smowcmite.mckesson.com:1521:l510";					

			//Database Username		
			String username = "vapuser";	
            
			//Database Password		
			String password = "newportal";			
			//String NAME = "p00063";	//this value needed when use main

		
            
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
        	
        //	String user = request.getParameter(NAME);
        	String query = "select * from s_user_account where USER_ID = ?";	
			
			PreparedStatement ps= (PreparedStatement) con.prepareStatement(query);
			ps.setString(1,NAME);
					
     		ResultSet rs= ps.executeQuery();		
     			
			while (rs.next()){
		        								        
                       String act = rs.getString(2);
                     
                        System.out.println("Current ordering account assigned: "+act);		
							  }
			
			//checking am2 n rna acts in table
			
	    	String query8 = "select * from s_iw_user_access where USER_ID like UPPER(?)";	
			
				PreparedStatement ps8= (PreparedStatement) con.prepareStatement(query8);
				ps8.setString(1,"%"+NAME+"%");
				// ps.setString(1,"%"+NAME+"%");
						
	     		ResultSet rs8= ps8.executeQuery();		
	     		
	     		//System.out.println("before while");
	     		// While Loop to iterate through all data and print results		
				while (rs8.next()){
			        		String myName1 = rs8.getString(1);								        
			        		String sysid = rs8.getString(2);
			        		String act1 = rs8.getString(4);
			        		String flag = rs8.getString(12);
			        	//	System.out.println("inside while");
			        	//	System.out.println(myName1);
	                        System.out.println("Current acct assigned for am2 & rna(tracibility flag): "+myName1+','+sysid+','+act1+"::"+flag);		
								  }
				
				
				
				//checking updated rna func code in table
				
		    	String query9 = "select * from s_user_func where USER_ID like UPPER(?)";	
				
					PreparedStatement ps9= (PreparedStatement) con.prepareStatement(query9);
					ps9.setString(1,"%"+NAME+"%");					
		     		ResultSet rs9= ps9.executeQuery();		
		     		
		     		// While Loop to iterate through all data and print results		
					while (rs9.next()){
				        		String myName1 = rs9.getString(1);								        
				        		String fc = rs9.getString(2);
				        		
				        	
		                        System.out.println("Current updated r&A func codes: "+myName1+','+fc);		
									  }
					con.close();
				
		}
		
		
	}