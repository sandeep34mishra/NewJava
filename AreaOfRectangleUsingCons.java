//class Rectangle;

    class Rectangle
    {
        int area,length,breadth;
        Rectangle()
        {
            length=20;
            breadth=10;
        }
        Rectangle(int l, int b)
        {
            length=l;
            breadth=b;
        }
        void area( )
        {
            area=length*breadth;
            System.out.println(" "+area);
        }
    }
public class AreaOfRectangleUsingCons {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area of rectangle is: ");
        r1.area();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("Area of rectangle using parameterized constructor : ");
        r2.area();
    }
}

