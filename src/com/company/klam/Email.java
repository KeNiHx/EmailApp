package com.company.klam;

import java.util.Scanner;

public class Email {
    //Want to encapsulate
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 101;
    private String alternateEmail;

    // Constructor to receive first name and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);


        //Call a method asking for the department = return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice == 1){
            return "sales";
        }
        else if(deptChoice == 2){
            return "dev";
        }
        else if(deptChoice == 3){
            return "acct";
        }else{
            return "";
        }
    }

    //Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }
    //Set the mailbox capacity

    //Set the alternate email

    //Change the password



}
