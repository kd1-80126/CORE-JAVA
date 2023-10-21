package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Assignment13_Q3main {

	public static void main(String[] args) {
       try(FileWriter fw = new FileWriter("abc.txt"))
        {
	      try (BufferedWriter bw = new BufferedWriter (fw))
	      {
	    	  Scanner sc = new Scanner (System.in);
	    	  for(int i = 0;i<4;i++)
	    	  {
	    		  System.out.println("Enter Line");
	    		  String line = sc.nextLine();
	    		  bw.write(line);
	    		  bw.newLine();
	    	  }
	      }
        }
       catch(Exception e)
       {
    	   e.getStackTrace();
       }
	}

}
