public class Inheritance {
    public static void main(String[] args) {
        BedRoom obj = new BedRoom();
        obj.bed();
        obj.sofas();
    }
}
class Room{
    void sofas()
    {
        System.out.println("Room consists of sofas");
    }
}
class BedRoom extends Room{
    void bed()
    {
        System.out.println("Bed Room consist of bed");
    }
}
