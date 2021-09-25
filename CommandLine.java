public class CommandLine {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        int n=364,mod;
        System.out.print("Individual digits of 3 digit no are: ");
        while(n!=0)
        {
            mod=n%10;
            n=n/10;
            System.out.print(mod+ "\t");
        }
    }

}
