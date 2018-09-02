import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// Primary number checker
        int checkThisNumber = 17;
        if(checkThisNumber <= 3){
            System.out.println("This number is primary");
        } else {
            boolean isPrimary = true;
            for(int i = 2; i < checkThisNumber; i++){
                if(checkThisNumber % i == 0){
                    isPrimary = false;
                    break;
                }
            }
            if(isPrimary){
                System.out.println("This number is primary.");
            } else {
                System.out.println("This number is not primary.");
            }
        }

    //Eratostenes - finding all primary numbers from 2 - n.
        /*
        int checkAllNumbersUpTo = 1000;
        ArrayList<Integer> listToCheck = new ArrayList<>();
        for(int i = 2; i <= checkAllNumbersUpTo; i ++){
            listToCheck.add(i);
        }



        for(int i = 0; i < listToCheck.size(); i++){
            for(int n = i + 1; n < listToCheck.size(); n++){
                if(listToCheck.get(n) % listToCheck.get(i) == 0){
                    listToCheck.remove(n);
                }
            }
        }

        if(listToCheck.size()<=25){
            System.out.println("Primary numbers in range 2 - " + checkAllNumbersUpTo + ": ");
            System.out.println(listToCheck);
        } else {
            System.out.println("There are: " + listToCheck.size() + " primary numbers between 2 - " + checkAllNumbersUpTo + ".");

        }
        */


        //Check if String is a palindrome - class PalindromeChecker is made.
        /*
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String palindrome = "I lali masoni wydrom w mordy wino, sami lali.";
        System.out.println("Is it a palindrome? " + palindromeChecker.isAPalindrome(palindrome));
        */



        //Perfect numbers - check PerfectNumber class. No point in going over 30.
        /*
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.findPerfectNumbers(30));
        */



    }
}
