package com.search;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String path = sc.nextLine();
		String fileName = sc.nextLine();
          try {
                  System.out.println("Please Enter the path-");
                  BufferedReader filePathReader = new BufferedReader(
                                  new InputStreamReader(System.in));
                  path = filePathReader.readLine();
                  System.out.println("Please Enter file Name-");
                  BufferedReader fileNameReader = new BufferedReader(
                                  new InputStreamReader(System.in));
                  fileName = fileNameReader.readLine();

                  File directory = new File(path);
                  File[] listOfFiles = directory.listFiles();
                  for (File file : listOfFiles) {
                          String name = file.getName();
                          if (name.equals(fileName)) {
                                  System.out.println(name);
//                                  if(Desktop.isDesktopSupported()){
//                                          Desktop.getDesktop().edit(file);
//                                  }
                                  return;
                          }
                  }
                  System.out
                                  .println(fileName + " not found in " + path + " directory");

          } catch (IOException e) {
                  e.printStackTrace();
          }
		
		
		
		
//		 File dir = new File("D:\\");
//	      String[] children = dir.list();
//	      
//	      if (children == null) {
//	         System.out.println("does not exist or is not a directory");
//	      } else {
//	         for (int i = 0; i < children.length; i++) {
//	            String filename = children[i];
//	            System.out.println(filename);
//	         }
//	      }
	}
}
