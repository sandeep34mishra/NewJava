class Overload
{
    public static void main(String args[])
    {
        MethodOverloading obj = new MethodOverloading();
        obj.load(1 );
        obj.load(2, 'y');
    }
}
public class MethodOverloading {
    public void load(int num)
    {
        System.out.println("Display Overloading");
    }
    public void load(int num, char c)
    {
        System.out.println("Display Overloading 2" );
    }
}




