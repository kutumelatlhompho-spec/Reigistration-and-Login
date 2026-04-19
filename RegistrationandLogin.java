/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin ;
import java.util.Scanner; 

/**
 *
 * @author kutum
 */
public class RegistrationandLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstname;
        String lastname;
        String username;
        String password;
        String cellphonenumber;
        
        //Registration
        System.out.println("\n---------Create an account-------------");
        
        System.out.print("Enter your First name: ");
        firstname = input.nextLine();
        
        System.out.print("Enter your Last name: ");
        lastname = input.nextLine();
        
        System.out.print("Enter your username: ");
        username = input.nextLine();
        
        //Check length and underscore
        if (username.length() <=5 && username.contains("_") && username.equals(username) ) {
            System.out.println("Username successfully captured");
       } else {
            System.out.println("Username is not correctly formatted, please insure username contains and underscore and is no more than 5 characters in length.");
        }
        
        System.out.print("Enter your Password: ");
        password = input.nextLine();
       
        
        // Check length, a Capital letter, a number and a special character
         if (password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) { 
            System.out.println("Password successfully captured");
        } else {
            System.out.println("Password is not correctly formatted, please insure password contains at least eight characters, a capital letter, a number and a special character(@).");
        }
        
        System.out.print("Enter your Cellphone number(include your country code): ");
        cellphonenumber = input.nextLine();
        
        //Check if it starts with International country code(+27) and 12 characters total (+27 + 9 digits)
        String regex = "^\\+27\\d{9}$";
        if (cellphonenumber.matches(regex)) {
            System.out.println("Cellphone number successfully added");
        } else {
            System.out.println("Cellpnone number incorrectly formatted or does not contain international code");
        }
       
         boolean validUsername = username.length() <= 5 && username.contains("_");
         boolean validPassword = password.length() >= 8 &&  password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
         boolean validCellphonenumber = cellphonenumber.matches(regex);
         
         if (validUsername && validPassword && validCellphonenumber) {
            System.out.println("\nAccount created successfully.");
          
                 //Login 
                  //Calling the login class
         Login login = new Login();
         System.out.println("\n-------Login--------");
         
         System.out.println("Enter your username: ");
         String loginUsername = input.nextLine();
         
         System.out.println("Enter your password: ");
         String loginPassword = input.nextLine();
         
         //Compare login details with registration details
         if (loginUsername.equals(username) && loginPassword.equals(password) ) {
             System.out.println("\nLogin Successful!.\nWelcome " + firstname + " " + lastname + "," + " " + "it is great to see you again!");
         } else {
             System.out.println("\nLogin failed, please enter correct username and password.");
         }
         
         } else {
             System.out.println("\nAccount not registered, please ensure you create your account with correct username, password and cellphone number.");
         } 
        }
    }


     