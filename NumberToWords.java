public class NumberToWords {
    public static void main(String[] args) {
        //xyz(9876);
        //reverse(6543);
        numberToWords(123);
    }
    public static void xyz(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;

        }
        System.out.println(count);

    }
    public static void reverse(int num){
        int temp=num;
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=10*rev+rem;
            temp/=10;

        }
        System.out.println(rev);
    }
    public static void numberToWords(int number){
        String numString="";
        if(number<0){
            System.out.println("Invalid Value");
        }
        while(number>0){
            number%=10;
            switch (number) {

                case 1:
                    numString += "One ";System.out.println("Invalid Value");
                    break;
                case 2:
                    numString += "Two ";
                    break;
                case 3:
                    numString += "Three ";
                    break;
                case 4:
                    numString += "Four ";
                    break;
                case 5:
                    numString += "Five ";
                    break;
                case 6:
                    numString += "Six ";
                    break;
                case 7:
                    numString += "Seven ";
                    break;
                case 8:
                    numString += "Eight ";
                    break;
                case 9:
                    numString += "Nine";
                    break;
            }

        }
        System.out.println(numString);

    }
}
