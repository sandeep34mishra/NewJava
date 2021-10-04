public class InheritanceWithArgument {
    public static void main(String[] args) {
        livingRoom obj = new livingRoom();
        obj.room();
        obj.room2();
        obj.showroom();
    }
}
class home{
    int sofas;
    void room(){
        sofas=2;
    }
}
class livingRoom extends home{
    int table;
    int sofas;
    void room2(){
        super.sofas=4;
        sofas=3;
        table=2;
    }
    void showroom()
    {
        System.out.println("living room consist of " +sofas+ " Sofas");
        System.out.println("Room consist of "+ super.sofas+" Sofas");
    }
}
