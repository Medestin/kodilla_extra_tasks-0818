public class PalindromeChecker {

    public String rebuildPalindrome(String originalPalindrome) {
        String result = originalPalindrome.toLowerCase();
        result = result.replaceAll("[^a-zA-Z]", "");
        return result;

    }

    public boolean isAPalindrome(String checkThis){
        String toBeChecked = rebuildPalindrome(checkThis);
        boolean isItReally = true;
        char[] palindromeArray = toBeChecked.toCharArray();
        for(int i = 0; i < (palindromeArray.length/2)+1; i++){
            if(!(palindromeArray[i] == palindromeArray[palindromeArray.length-1-i])){
                isItReally = false;
                break;
            }
        }

        return isItReally;
    }



}
