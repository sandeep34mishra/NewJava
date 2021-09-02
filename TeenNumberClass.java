public class TeenNumberClass {
    public static void main(String[] args) {
        System.out.println(hasTeen(15,16,18));
        System.out.println(isTeen(11));
    }

    public static boolean hasTeen(int first,int second, int third){
        return (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19);
    }
    public static boolean isTeen(int one){
        return one >= 13 && one <= 19;
    }
}
