package mck2023;

public class test {

	public static void main(String[] args) {
		
	String version = "n00012";
	    String newVersion = "n000" + (Integer.parseInt(version.substring(1,version.length()))+1);
    System.out.println(newVersion);
	      
		

	}
}
