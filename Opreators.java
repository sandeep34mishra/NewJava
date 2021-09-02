public class Opreators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int firstResult = (a << 2) + (b >> 2);
        System.out.println("Program 1 " + firstResult );
        System.out.println("Program 2 " + (b > 0));
        System.out.println("Program 3 " + ((a + b * 100) / 10));
        int fourthResult = (a & b);
        System.out.println("Program 4 " + fourthResult);
    }
}
