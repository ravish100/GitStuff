package Files;

public class CreateNGP {
	
	public static String AddNGPUser(String NAME)
	{
		String payload= "{\r\n"
				+ "    \"uid\": \""+NAME+"\",\r\n"
				+ "    \"firstName\": \"jj\",\r\n"
				+ "    \"lastName\": \"kk\",\r\n"
				+ "    \"userType\": \"EXTERNAL\",\r\n"
				+ "    \"email\": \"jj@kk.com\",\r\n"
				+ "    \"active\": true,\r\n"
				+ "    \"mobileNum\": \"\",\r\n"
				+ "    \"dayPhoneNum\": \"\",\r\n"
				+ "    \"employer\": \"MCK\",\r\n"
				+ "    \"lastLoginDatetime\": \"\",\r\n"
				+ "    \"portalUserType\": \"User\",\r\n"
				+ "    \"csosPreferences\": {\r\n"
				+ "        \"notifyNewOrderSigNeeded\": false,\r\n"
				+ "        \"sendEmailRejected\": false,\r\n"
				+ "        \"sendEmailAwaitingReceiving\": false,\r\n"
				+ "        \"sendTextRejected\": false,\r\n"
				+ "        \"sendTextAwaitingReceiving\": false,\r\n"
				+ "        \"sendTextAwaitingSignature\": false\r\n"
				+ "    },\r\n"
				+ "    \"functionCodesEnabled\": [\r\n"
				+ "        \"USER_ORDER_CREATE_MANAGE_ORDERS_ENABLED\",\r\n"
				+ "        \"USER_MINI_CART_ENABLED\",\r\n"
				+ "        \"USER_RETURN_CREATE_MANAGE_ENABLED\"\r\n"
				+ "    ],\r\n"
				+ "    \"ordersEnabled\": true\r\n"
				+ "}";
				return payload;
	}

}
