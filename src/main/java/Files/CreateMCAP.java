package Files;

public class CreateMCAP {
	
	public static String AddMCAPUser(String NAME)
	{
		String payload= "{\"users\":[{\"uid\":\""+NAME+"\",\"refuser\":\"FSCM_REF0\",\"email\":\"jj@kk.com\",\"functionCodeEnabled\":[],\"canUpdateNotificationPreferences\":\"yes\",\"billApprovalLevel\":\"0\",\"customers\":[{\"customerKey\":\"000007\"}]}]}";
	
	
		return payload;
	}
	
	

}
