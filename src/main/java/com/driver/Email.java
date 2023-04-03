package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email() {
    }

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(getPassword().equals(oldPassword)){
            if(newPassword.length()>=8 && checkUpperCase(newPassword) && checkLowerCase(newPassword) && checkDigit(newPassword) && checkSpecial(newPassword)){
                password=newPassword;
            }
        }
    }
    public boolean checkUpperCase(String password){
        for(int i=0;i<password.length();i++){
            if('A'-password.charAt(i)>=0){
                return true;
            }
        }
        return false;
    }

    public boolean checkLowerCase(String password){
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)-'a'>=0){
                return true;
            }
        }
        return false;
    }

    public boolean checkDigit(String password){
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)-'0'>=0 && password.charAt(i)-'0'<=9){
                return true;
            }
        }
        return false;
    }

    public boolean checkSpecial(String password){
        for(int i=0;i<password.length();i++){
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
