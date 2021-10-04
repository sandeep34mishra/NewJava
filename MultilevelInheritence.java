import java.util.Scanner;

public class MultilevelInheritence {
    public static void main(String args[])
    {
        VegBurger obj=new VegBurger();
    }
}
class Restaurant{
    int price=20;
    public Restaurant()
    {
        System.out.println("Class Restaurant");
    }
}
class Burger extends Restaurant{
    public Burger()
    {
        System.out.println("Burger Method called ");
    }
}
 class VegBurger extends Burger {
    public VegBurger() {
        System.out.println("VegBurger Method called");
        System.out.println("Burger Price is "+price);
        System.out.println("Enter Quantity  ");
        Scanner obj=new Scanner(System.in);
        int item=obj.nextInt();
        System.out.println("Total Price is "+price*item);
    }
}
