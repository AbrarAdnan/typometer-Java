package typometer;

public class CharGenerator { 
  
    // function to generate a random string of length n 
    static char getChar() 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        
        int index = (int)(AlphaNumericString.length() * Math.random());
        char A = AlphaNumericString.charAt(index);
  
        return A; 
    } 
} 