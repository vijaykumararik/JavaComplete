package com;

import java.io.FileReader;


public class FilenotfoundException {
public static void main(String[] args) {
	
	try {
		FileReader f=new FileReader( demo.txt);
	} catch (Exception e) {
		System.out.println("file not found");
	}
}
}
