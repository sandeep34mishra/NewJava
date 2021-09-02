public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int firstNum,int secondNum){
            int firstRight = firstNum % 10;
            System.out.println(firstRight);
            int secondRight = secondNum % 10;
            System.out.println(secondRight);
            int firstLeft=firstNum/=10;
            System.out.println(firstLeft);
            int secondLeft=secondNum/=10;
            System.out.println(secondLeft);
            if (firstLeft == secondLeft || firstLeft == secondRight || firstRight == secondLeft || firstRight == secondRight) {
                return true;
            }
      else  if (firstLeft == secondLeft || firstLeft == secondRight || firstRight == secondLeft || firstRight == secondRight){

    }
        return true;
    }
}
