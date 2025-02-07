class Solution {  
    public String freqAlphabets(String s) {  
       
        for (int i = 10; i <= 26; i++) {  
            s = s.replaceAll(i + "#", Character.toString((char) ('a' + (i - 1))));  
        }  
        
        for (int i = 1; i <= 9; i++) {  
            s = s.replaceAll(Integer.toString(i), Character.toString((char) ('a' + (i - 1))));  
        }  
        
        return s;  
    }  
}