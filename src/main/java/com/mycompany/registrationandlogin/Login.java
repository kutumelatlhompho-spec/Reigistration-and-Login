/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin;

/**
 *
 * @author kutum
 */
public class Login {
    public Login() {
        
    }
   
    String username;
    String password;
    String cellphonenumber;
    
    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
        return true;
        } else {
            return false;
        }
    }
    public boolean checkPassword(String password) {
        if (password.length() >=8 & password.matches(".*[A-Z].*") & password.matches(".*\\d.*") & password.matches(".*[!@#$%^&*(),.?\":{}|<>].*") & password.equals(password)) { 
        return true;
        } else {
           return false; 
        }
    }
    public boolean checkCellphonenumber(String cellphonenumber) {
        if (cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12 && cellphonenumber.matches("\\+27\\d{9}")) {
        return true;
        } else {
            return false;
        } 
    }
    public String registerUser(String username, String password, String cellphonenumber) {
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPassword(password);
        boolean validCellphonenumber = checkCellphonenumber(cellphonenumber);
        
        if (validUsername == true && validPassword == true && validCellphonenumber == true) {
        return "Account registered Successfully";
        } else {
            return "Account registration failed";
        }
    }
    
    public boolean LoginUser(String username, String password) {
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPassword(password);
     
    if (validUsername == true && validPassword == true) {
        return true;
    } else {
        return false;
    }
    }
    
    public String returnLoginStatus(String username, String password) {
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPassword(password);
        
        if (validUsername == true && validPassword == true) {
            return "Login successful.\n Welecome " ;
        } else {
            return "Login unsuccessful\n username or password incorrect, please try again";
        }
    }
}
    

    


