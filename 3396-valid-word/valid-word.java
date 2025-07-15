class Solution {
    public boolean isValid(String word) {
      if(word.length()<3){
        return false;
      }
      boolean vowel=false;
      boolean consonent=false;

      for(char ch:word.toCharArray()){
        if(!Character.isLetterOrDigit(ch)){
            return false;
        }
        if(Character.isLetter(ch)){
            char lowerCase = Character.toLowerCase(ch);
            if(lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u' ){
                vowel=true;
            }
            else{
                consonent=true;
            }
        }
      }
      return vowel && consonent;
        
    }
}