package mck2023;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.sql.SQLException;

import static io.restassured.RestAssured.given;

import Files.AddAccounts;
//import Files.AddAccounts;
import Files.CreateMCAP;
import Files.CreateNGP;
import Files.CreateUserBody2;
import Files.EditPayload;
import Files.PortalOkta;
import Files.Template;
import Files.db;

public class CreateUser1 {
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	
	//String certificatesTrustStorePath = "<JAVA HOME>/jre/lib/security/cacerts";
	//System.setProperty("javax.net.ssl.trustStore", certificatesTrustStorePath);
		
		
		//1) create user+get+save user id
				RestAssured.baseURI="https://testwcm.mckesson.com/portal/api/users";
			String response	=	given().log().all().header("authentication","Ua&XVr1A3OPm4ff7")
					.header("Content-Type","application/json")
					.header("Authorization","Bearer da61ba4b-0159-42f9-82a2-005c04b6eed2")
					.header("Cookie","TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; incap_ses_738_1804037=5W34X0+moCIdCve6m+c9Cr/bgmEAAAAAyf8PieTq5tTGcFW5CI47Zw==; incap_ses_744_1804037=JTXbYRg67Vko171DkThTCvxy0WEAAAAAyvFrUMi7ARtQ5m0bUDFv+A==; incap_ses_745_1804037=Mk4yJ4Txe2M+1w0qmcVWChroEV8AAAAAsWvPlYjAPyHlXYZMz0yJ/w==; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; JSESSIONID=3VZ7LObBS22tiJzJFQ1B-Q__.portal01")

				.body(CreateUserBody2.AddUser()).when().post("")
				.then().log().all().assertThat().statusCode(201).body("status", equalTo("Success"))
				.extract().response().asString();
			
			System.out.println("Printing response from portal create user api:-\n");
			System.out.println(response);
			System.out.println();
			JsonPath js = new JsonPath(response);//for parsing json
			//String code=js.getString("respCode");
			//System.out.println(("Ravish User response code  extracted is : "+code));
			String u=js.getString("userID");
			System.out.println(("Ravish User id:> extracted is : "+u));
			
			
			
			//2) okta creation
			RestAssured.baseURI="https://mckb2b2.oktapreview.com/api/v1/users?activate=true";
			String response1	=	given().log().all().header("authentication","mck-portal")
					.header("Content-Type","application/json")
					.header("Authorization","SSWS 00Jw5DeanIT84D0Lty4fjBMKCB8PkpbRIKqPwG2tl4")
					

				.body(PortalOkta.OktaUser(u)).when().post("")
				.then().log().all().assertThat().statusCode(200).body("status", equalTo("ACTIVE"))
				.extract().response().asString();
			
			System.out.println("Printing response from create okta api:-\n");
			System.out.println(response1);
			/*
			//3) ngo creation
			RestAssured.baseURI="https://uat-bconnect.mckesson.com/mckessonwebservices/v2/mckesson-us-pharma/users/wsintegrationuser/create-or-update";
			String response3	=	given().log().all()
					.header("Content-Type","application/json")
					.header("Authorization","bearer fb9e00b1-923f-46f7-bebc-568bd7df7679")
					.header("Cookie","TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; visid_incap_924315=BKT6zbUHQHa5viM+HNYdzfP4MmMAAAAAQUIPAAAAAABC0HiebyFZUFjUoyIa17W2")

				.body(CreateNGP.AddNGPUser(u)).when().post("")
				.then().log().all().assertThat().statusCode(201).body("created", equalTo(true))
				.extract().response().asString();
			
			System.out.println("Printing response from create ngo api:-\n");
			System.out.println(response3);
			
			//4) mcap creation
			RestAssured.baseURI="https://fqa.mckesson.com/mcap/mcap_umeadm/addUser";
			String response4	=	given().log().all()
					.header("Content-Type","application/json")
					.header("Authorization","Bearer m7cik8jn-gdsg-73d3-26j7-0075c04b2gs52")
					.header("Cookie","TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; visid_incap_924315=BKT6zbUHQHa5viM+HNYdzfP4MmMAAAAAQUIPAAAAAABC0HiebyFZUFjUoyIa17W2")

				.body(CreateMCAP.AddMCAPUser(u)).when().post("")
				.then().log().all().assertThat().statusCode(200).body("users[0].status", equalTo("success"))
				.extract().response().asString();
			
			System.out.println("Printing response from create mcap api:-\n");
			System.out.println(response4);
			
			//5) add act
			RestAssured.baseURI="https://uat-bconnect.mckesson.com/mckessonwebservices/v2/mckesson-us-pharma/users/wsintegrationuser/create-or-update";
			String response5	=	given().log().all()
					.header("Content-Type","application/json")
					.header("Authorization","bearer fb9e00b1-923f-46f7-bebc-568bd7df7679")
					.header("Cookie","JSESSIONID=86DC707D3F536CE3D8494F73CEB653EC.backoffice_1; TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; incap_ses_738_1804037=LxRnEO2ys1YRaDcDT+g9Cs75MmMAAAAAchSpjUlDjSsa9uNT/rAl0w==; incap_ses_738_924315=qAJABtUnXSCfTzcDT+g9Cqr5MmMAAAAAQCjgR48Jor2M5TDcSqfa8w==; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; visid_incap_924315=BKT6zbUHQHa5viM+HNYdzfP4MmMAAAAAQUIPAAAAAABC0HiebyFZUFjUoyIa17W2; BIGipServeruat-bconnect.mckesson.com_9010=1259671818.12835.0000")

				.body(AddAccounts.AddNGPAccount(u)).when().post("")
				.then().log().all().assertThat().statusCode(200).body("error", equalTo(false))
				.extract().response().asString();
			
			System.out.println("Printing response from create add accounts api:-\n");
			System.out.println(response5);
			
			//6) create template user+get+save user id
			RestAssured.baseURI="https://testwcm.mckesson.com/portal/api/users";
		String response6	=	given().log().all().header("authentication","Ua&XVr1A3OPm4ff7")
				.header("Content-Type","application/json")
				.header("Authorization","Bearer da61ba4b-0159-42f9-82a2-005c04b6eed2")
				.header("Cookie","TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; incap_ses_738_1804037=5W34X0+moCIdCve6m+c9Cr/bgmEAAAAAyf8PieTq5tTGcFW5CI47Zw==; incap_ses_744_1804037=JTXbYRg67Vko171DkThTCvxy0WEAAAAAyvFrUMi7ARtQ5m0bUDFv+A==; incap_ses_745_1804037=Mk4yJ4Txe2M+1w0qmcVWChroEV8AAAAAsWvPlYjAPyHlXYZMz0yJ/w==; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; JSESSIONID=3VZ7LObBS22tiJzJFQ1B-Q__.portal01")

			.body(Template.AddTemplateUser(u)).when().post("")
			.then().assertThat().statusCode(201).body("status", equalTo("Success"))
			.extract().response().asString();
		
		System.out.println("Printing response from portal create template user api:-\n");
		System.out.println(response6);
		System.out.println();
			
		*/
			db.dbase(u);
			
			
			
			//verify portal login and ordering accounts
			PortalLogin.LoginWithUser(u);
			
			RNAVerificaiton.RNAUser(u);
			
			
			
			//7) edit user+get+save user id
			RestAssured.baseURI="https://testwcm.mckesson.com/portal/api/users";
		String response16	=	given().log().all().header("authentication","Ua&XVr1A3OPm4ff7")
				.header("Content-Type","application/json")
				//.header("Authorization","Bearer da61ba4b-0159-42f9-82a2-005c04b6eed2")
				.header("Cookie","TLTSID=6FAD4AC4520910520B10A1A1F84DF17F; TLTUID=6FAD4AC4520910520B10A1A1F84DF17F; incap_ses_738_1804037=5W34X0+moCIdCve6m+c9Cr/bgmEAAAAAyf8PieTq5tTGcFW5CI47Zw==; incap_ses_744_1804037=JTXbYRg67Vko171DkThTCvxy0WEAAAAAyvFrUMi7ARtQ5m0bUDFv+A==; incap_ses_745_1804037=Mk4yJ4Txe2M+1w0qmcVWChroEV8AAAAAsWvPlYjAPyHlXYZMz0yJ/w==; visid_incap_1804037=mBvFE2BBQZ6ThYiJC1D8tqjUgmEAAAAAQUIPAAAAAABRKKJGR2e02iOxgPFs9oR5; JSESSIONID=3VZ7LObBS22tiJzJFQ1B-Q__.portal01")

			.body(EditPayload.EditUser(u)).when().patch("")
			.then().log().all().assertThat().statusCode(200).body("status", equalTo("Success"))
			.extract().response().asString();
		
		System.out.println("Printing response from portal edit user api:-\n");
		System.out.println(response16);
		System.out.println();
		JsonPath js6 = new JsonPath(response);//for parsing json
	//	String code6=js6.getString("respCode");
	//	System.out.println(("Ravish User edit response code  extracted is : "+code6));
		String m6=js6.getString("message");
		System.out.println(("Ravish User API update message : "+m6));
			
		db.dbase(u);
		
		
		
		db.dbase2(u);
			System.out.println();
			System.out.println("ALL STEPS COMPLETED SUCCESSFULLY");
			System.out.println("adhoc gp update pending");
			System.out.println("Act update in ord rna am2 pending");
		
			
	}

}





