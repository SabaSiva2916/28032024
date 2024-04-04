package org.git;

import java.util.ArrayList;
import java.util.List;

//pushing these project from Local to Remote
public class GitPush {

    public static void main(String[] args) {

	System.out.println("Working Directory");
	System.out.println("Stagging");
	System.out.println("Local Git Repository");
	System.out.println("Remote Git Repository");
	// creating List with String type and adding value
	List<String> li = new ArrayList<>();
	// Adding vlaue to list --> add()
	li.add("A");
	li.add("B");
	li.add("C");
	li.add("D");
	li.add("E");

	// Iterating the list value by using for loop
	for (int i = 0; i < li.size(); i++) {
	    System.out.println(li.get(i));
	}
    }

}
