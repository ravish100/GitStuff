package Files;

public class PortalOkta {
	
	public static String OktaUser(String NAME)
	{
		String payload= "{\r\n"
				+ "    \"credentials\": {\r\n"
				+ "        \"password\": {\r\n"
				+ "            \"value\": \"Abcd@123\"\r\n"
				+ "        }\r\n"
				+ "    },\r\n"
				+ "    \"profile\": {\r\n"
				+ "        \"uid\": \""+NAME+"\",\r\n"
				+ "        \"lastName\": \"kk\",\r\n"
				+ "        \"organization\": \"mck\",\r\n"
				+ "        \"email\": \"jj@kk.com\",\r\n"
				+ "        \"mckOrgType\": \"external\",\r\n"
				+ "        \"login\": \""+NAME+"\",\r\n"
				+ "        \"firstName\": \"jj\",\r\n"
				+ "        \"userType\": \"external\"\r\n"
				+ "    }\r\n"
				+ "}";
		return payload;
				
	}

}
