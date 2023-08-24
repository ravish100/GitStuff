package Files;


import java.io.IOException;

import mck2023.FileWriteDemo;

public class Template {
	
	
	public static String AddTemplateUser(String NAME) throws IOException
	{
		//String  nm = "";
		//nm=FileWriteDemo.ReadwriteUser(nm);
		String  nm = NAME.concat("t");
		
		return "{\r\n"
				+ "    \"hostName\": \"0:0:0:0:0:0:0:1\",\r\n"
				+ "    \"createdBy\": \"pingcust\",\r\n"
				+ "    \"templateId\": \"joyes061\",\r\n"
				+ "    \"id\": \""+nm+"\",\r\n"
				+ "    \"firstName\": \"jj\",\r\n"
				+ "    \"lastName\": \"kk\",\r\n"
				+ "    \"email\": \"jj@kk.com\",\r\n"
				+ "    \"employer\": \"MCK\",\r\n"
				+ "    \"type\": \"E\",\r\n"
				+ "    \"userTemplate\": \"YES\",\r\n"
				+ "    \"templateTypeID\": \"3\",\r\n"
				+ "    \"applFeatureAccessCds\": \"2-1,2-10,5-1499,5-1502,5-1451,5-1456,5-1480,5-14\r\n"
				+ "86\",\r\n"
				+ "    \"chkIpInd\": \"YES\",\r\n"
				+ "    \"loginAsOverride\": \"1\",\r\n"
				+ "    \"groups\": [\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"ISMC Owner\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"Orders\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"OrdersNgp\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"Reports and analysis 6.0\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"Account Management 2.0\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"SMO Data Exchange\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"RxPak\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				

				
				
				+ "     \"orderingAccounts\": [\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"000078\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"096206\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"241654\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"553183\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				
				+ "        {\r\n"
				+ "            \"accountNumber\": \"283044\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"878586\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "\r\n"
				+ "    \"mcapAccounts\": [\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"000072\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"accountNumber\": \"000303\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "\"rnaAccounts\":    [\r\n"
				+ "    {\r\n"
				+ "        \"accessRoldCd\":\"CID\",\r\n"
				+ "        \"lvl1Value\":\"000048\",\r\n"
				+ "        \"lvl2Value\":\"\",\r\n"
				+ "        \"lvl3Value\":\"\",\r\n"
				+ "        \"lvl4Value\":\"\",\r\n"
				+ "        \"lvl5Value\":\"\",\r\n"
				+ "        \"traceAbilityFlag\":\"Y\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "        \"accessRoldCd\":\"CID\",\r\n"
				+ "        \"lvl1Value\":\"000148\",\r\n"
				+ "        \"lvl2Value\":\"\",\r\n"
				+ "        \"lvl3Value\":\"\",\r\n"
				+ "        \"lvl4Value\":\"\",\r\n"
				+ "        \"lvl5Value\":\"\",\r\n"
				+ "        \"traceAbilityFlag\":\"Y\",\r\n"
				+ "             \"action\":\"add\"\r\n"
				+ "    }\r\n"
				+ "],\r\n"
			
				
				
				+ "    \"identityData\": {\r\n"
				+ "        \"cust_typ_cd\": \"31\",\r\n"
			
				+ "        \"sgmnt_cd\": \"30\",\r\n"
				+ "        \"sgmnt_role_cd\": \"30-12\"\r\n"
				+ "    },\r\n"
				+ "    \"locationData\": {\r\n"
				+ "        \"dc_ids\": \"8130,8148\",\r\n"
				+ "        \"dc_dlvry_rte_stop_hier\": \"8106,8106-016-016\",\r\n"
				+ "        \"dc_terr_hier\": \"8106-0011,8106-0061\",\r\n"
				+ "        \"acct_st_cds\": \"CA,IN,MD\",\r\n"
				+ "        \"acct_zip_cds\": \"11111,22221,22323\"\r\n"
				+ "    },\r\n"
				+ "    \"membershipData\": {\r\n"
				+ "        \"natl_grp_hier\": \"0230-000500-000004-000001,0230-000500-000009-000004\",\r\n"
				+ "        \"chn_cds\": \"322,865\",\r\n"
				
				+ "        \"adhoc_grp_cds\": \"144,313\",\r\n"
				+ "        \"pgm_mbrsh_cds\": \"pgm_012,pgm_048\"\r\n"
				+ "    },\r\n"
				+ "    \"otherData\": {\r\n"
				+ "        \"rna_type_cd\": \"1\",\r\n"
				+ "        \"rna_valu\": \"0a76a4d7dbbb0110VgnVCM10000075040d0a____\",\r\n"
				
				+ "        \"hq_access_ind\": \"YES\",\r\n"
				+ "        \"mod_prfl_ind\": \"NO\",\r\n"
				+ "        \"password_mod_flag\": \"YES\",\r\n"
				+ "        \"force_e_mail_update_flag\": \"YES\",\r\n"
				+ "        \"prfr_rply_meth_cd\": \"02\",\r\n"
				+ "        \"mfg_type\": \"Brand,CPG\"\r\n"
				+ "    },\r\n"
				+ "    \"ipRange\": [\r\n"
				+ "        {\r\n"
				+ "            \"startIp\": \"192.168.5.1\",\r\n"
				+ "            \"stopIp\": \"192.168.5.100\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"startIp\": \"192.168.6.1\",\r\n"
				+ "            \"stopIp\": \"192.168.6.100\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"rnaFunctionCodes\": [\r\n"
				+ "        {\r\n"
				+ "            \"functionCode\": \"3\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"functionCode\": \"2\",\r\n"
				+ "            \"action\": \"add\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
	}


}
//newz1 today10

