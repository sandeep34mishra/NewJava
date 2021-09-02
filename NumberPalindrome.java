public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }
    public static boolean isPalindrome(int number){
        int remaining,palindromeNumber=0,tempNum=number;
        while (tempNum!=0){
        remaining=tempNum%10;
            palindromeNumber = palindromeNumber*10+ remaining;
            System.out.println(palindromeNumber);
            tempNum=tempNum/10;
        }
        System.out.println(number);

        if(number==palindromeNumber){
            return true;
        }
        else{
            return false;

        }
    }
}
