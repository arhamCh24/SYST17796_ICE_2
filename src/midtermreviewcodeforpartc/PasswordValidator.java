/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 * This class has only one job - validating passwords.
 * The class can easily extended without changing in existing code.
 * If we want to change the minimum length from 8 to 10 characters, we only 
 * need to change the minLengthPass variable in the constructor or call setter method from other class.
 * If we need to change the password rule, we only modify this class.
 * @author Muhammad Arham, 2025
 * Student Number: 991807357
 */
public class PasswordValidator {
    private int minLengthPass;
    private boolean requireSpecialChar;
    

    public PasswordValidator() { // Constructor - sets up default password rules
        this.minLengthPass = 8;
        this.requireSpecialChar = true;
    }
    
    public boolean isValid(String password) {
        
        // Check minimum length
        if (password.length() < minLengthPass) {
            return false;
        }
        
        // Check for special character if required
        if (requireSpecialChar) {
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    return true; // found a special character
                }
            }
            return false; // no special character found
        }
        
        return true;
    }
    
    /**        
    * We can easily access and change the password length and set Require Special Char
    * from UnoOnline class with the help of getter and setter
    * This shows how easy it is to change rules
    */
    public int getMinLengthPass() {
        return minLengthPass;
    }

    public void setMinLengthPass(int minLengthPass) {
        this.minLengthPass = minLengthPass;
    }

    public boolean isRequireSpecialChar() {
        return requireSpecialChar;
    }

    public void setRequireSpecialChar(boolean requireSpecialChar) {
        this.requireSpecialChar = requireSpecialChar;
    }
    
    
}
