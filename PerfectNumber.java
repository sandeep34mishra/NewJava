public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(printFactor(10));
    }
    public static Boolean printFactor(int number) {
        int sum = 0, d = 1;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {


                if (i == 1) {
                    System.out.print(i);
                } else
                    System.out.print(" , " + i);
                sum = sum + i;
            }

        }

        return (sum == number) ? true : false;


    }
}
