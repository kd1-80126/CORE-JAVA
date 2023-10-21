package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Assignment13_Q4main {

	public static void main(String[] args) {
       try(FileReader fr = new FileReader("/home/sunbeam/AkshayWorkspaceSTS/Day 15/Assignment13_Q3/abc.txt"))
        {
	      try (BufferedReader br = new BufferedReader (fr))
	      {
	    	  String line;
	    	  while((line = br.readLine())!=null)
	    	  {
	    		  System.out.println(line);
	    	  }
	      }
        }
       catch(Exception e)
       {
    	   e.getStackTrace();
       }
	}

}
