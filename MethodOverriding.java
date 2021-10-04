public class MethodOverriding {
    public static void main(String args[]){
        Laptop obj= new Laptop();
        obj.screen();
    }
}
class Desktop
{
    void display(){
        System.out.println("Desktop");
    }
}
class Laptop extends Desktop
{
    void display(){
        System.out.println("Laptop");
    }
    void screen(){
        display();
        super.display();
    }
}
