package org.git;

//pushing these project from Local to Remote
public class GitPush {

    public static void main(String[] args) {

	System.out.println("Working Directory");
	System.out.println("Stagging");
	System.out.println("Local Git Repository");
	System.out.println("Remote Git Repository");
	// String Reverse
	String s = "java programm";
	// mmargorp avaj
	String output = "";

	for (int i = s.length() - 1; i >= 0; i--) {
	    char c = s.charAt(i);
	    output = output + c;
	}

	System.out.println("Reverse of given String :" + output);
    }

}
