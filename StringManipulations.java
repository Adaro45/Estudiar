public class StringManipulations implements InnerStringManipulations {
    private Character[] vowels = {'a','A','e','E','i','I','u','U','o','O'}; 
    public Integer CountVowels(String str){
        int cantvowels = 0;
        for(int i = 0; i<str.length();i++){
            for (int j = 0; j < vowels.length; j++) {
                if(str.charAt(i) == vowels[j]){
                    cantvowels++;
                }
            }
        }

        return cantvowels;
    }
    public String invertCapitalize(String str){
        String lowerCase = str, upperCase=str;
        lowerCase = lowerCase.toLowerCase();
        upperCase = upperCase.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(lowerCase.charAt(i)== str.charAt(i)){
                result.append(upperCase.charAt(i));
            }else{
                result.append(lowerCase.charAt(i));
            }
        }

        return result.toString();
    }
    public Boolean isPalindrome(String str){
            for(int i = 0; i<(str.length()/2);i++){
                if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                    return false;
                }
            }
        
        return true;
    }
}
