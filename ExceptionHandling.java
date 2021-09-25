public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            int a[]= {1,2,3,4,5};

            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        System.out.println("Something went wrong");
    }
}
