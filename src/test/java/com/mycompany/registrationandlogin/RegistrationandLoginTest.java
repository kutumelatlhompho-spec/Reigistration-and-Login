/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandlogin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kutum
 */
public class RegistrationandLoginTest {

    public RegistrationandLoginTest() {
    }

    @Test
    public void RegistrationandLogin() {
       String username = "user_"; //valid: <= 5 chars and contain "_"
       String password = "Passw0rd!"; //valid: >= 8 chars, has capital, number and special char&& password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*].*)";
       String cellphonenumber = "+27725612545"; //valid: +27 and 12 digits
    
       boolean validUsername = username.length() <=5 && username.contains("_");
       boolean validPassword = password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^*()_.,?{}|<>].*");
       boolean validCellphonenumber = cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12 && cellphonenumber.matches("\\+27\\d{9}");
    
    assertTrue(validUsername && validPassword && validCellphonenumber, "Account should register successfully");
    
    //Login with same details
       String loginUsername = "user_"; 
       String loginPassword = "Passw0rd!"; 
       String loginCellphonenumber = "+27725612545";
    
       assertTrue(loginUsername.equals(username) && loginPassword.equals(password) && loginCellphonenumber.equals(cellphonenumber), "Login should succeed");
    }
    
    @Test
    void testInvalidRegistration() {
       String username = "user"; //invalid: no underscore
       String password = "abc"; //invalid: too short
       String cellphonenumber = "0725612545"; //invalid: missing +27
       
       boolean validUsername = username.length() <=5 && username.contains("_");
       boolean validPassword = password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^*()_.,?{}|<>].*");
       boolean validCellphonenumber = cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12 && cellphonenumber.matches("\\+27\\d{9}");
    
       assertFalse(validUsername && validPassword && validCellphonenumber, "Account should fail registration");
    }
    
    @Test
    void LoginFailsWithWrongDetails() {
       String username = "user_";
       String password = "Passw0rd!";
       String cellphonenumber = "+27725612545";
       
       boolean validUsername = username.length() <=5 && username.contains("_");
       boolean validPassword = password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^*()_.,?{}|<>].*");
       boolean validCellphonenumber = cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12 && cellphonenumber.matches("\\+27\\d{9}");
       
       assertTrue(validUsername && validPassword && validCellphonenumber, "Account should register successfully");
       
       //Wrong login details
       String loginUsername = "wrong_";
       String loginPassword = "WrongPass1!";
       String loginCellphonenumber = "+27725662545";
       
       assertFalse(loginUsername.equals(username) && loginPassword.equals(password) && loginCellphonenumber.equals(cellphonenumber), "Login should fail");
    }
}
