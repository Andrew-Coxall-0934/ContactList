// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: May 14, 2020
// List of list of imputed contacts and there information

import java.util.Scanner;

public class ContactList {
    
	public static void main(String[] args){
		// comment
		
		Scanner scan = new Scanner(System.in);
		
		int placeHolder = 0	;
		
		//Decide the number of contacts 
		System.out.print("Enter how many contacts you have: ");
		int numOfContacts = Integer.parseInt(scan.nextLine());
		
		//Name of contacts
		String arrayOfNames[] = new String[numOfContacts];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of of contact " + (i+1) + " : ");
		    arrayOfNames[i] = scan.nextLine();
		}
		
		//Phone number of contacts
		String arrayOfPhoneNum[] = new String[numOfContacts];
		for (int i = 0; i < arrayOfPhoneNum.length; i++) {
		    System.out.print("Enter the phone number of contact " + (i+1) + " : ");
		    arrayOfPhoneNum[i] = scan.nextLine();
		        
		    //System.out.print(arrayOfPhoneNum[i]); 
		}
		
		//Email of contacts
		String arrayOfEmails[] = new String[numOfContacts];
		for (int i = 0; i < arrayOfEmails.length; i++) {
		    System.out.print("Enter the email of contact " + (i+1) + " : ");
		        arrayOfEmails[i] = scan.nextLine();
		}
		
		//Home address of contacts
		String arrayOfHomeAddress[] = new String[numOfContacts];
		for (int i = 0; i < arrayOfHomeAddress.length; i++) {
		    System.out.print("Enter the address of contact " + (i+1) + " : ");
		        arrayOfHomeAddress[i] = scan.nextLine();
		        
		} 
		
		System.out.println();
		System.out.print("What contact would you like to see information about: ");
		
		String nameOfPerosnTheyWantToSee = scan.nextLine();
		//System.out.println(nameOfPerosnTheyWantToSee);
		
		for (int i = 0; i < arrayOfNames.length; i++) {
			//System.out.print(i + "\n");
			//System.out.print(arrayOfNames[i] + "\n");
			//System.out.print(arrayOfHomeAddress[i] + "\n");
			//System.out.println();
			
			if (arrayOfNames[i].equals(nameOfPerosnTheyWantToSee)) {
				System.out.print(arrayOfNames[i] + "\n");
				System.out.print(arrayOfPhoneNum[i] + "\n");
				System.out.print(arrayOfEmails[i] + "\n");
				System.out.print(arrayOfHomeAddress[i] + "\n");

			}
		}
	}
}
