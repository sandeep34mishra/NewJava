public class SumOfIntegersDivisibleBySenen {
    public static void main(String[] args) {
        String numberStr = "" ;
        int sumOfAllNum = 0;
        int count=0;
        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0){
//                if(numberStr == ""){
//                    numberStr = String.valueOf(i);
//                }
//                else{
                    numberStr = numberStr+ " , " + i ;
                    sumOfAllNum = sumOfAllNum+i;
                    count=count+1;
//                }

            }

        }
        System.out.println("No. Integers Divisible by Seven are - "+count);
        System.out.println("Integers Divisible by Seven are - " + numberStr);
        System.out.println("Sum is -  " + sumOfAllNum);
    }
}


