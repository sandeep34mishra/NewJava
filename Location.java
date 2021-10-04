public class Location {
    public static void main(String[] args) {
// TODO Auto-generated method stub

        String name="Sandeep Mishra";
        int i,  count=0;
        System.out.println("length of name is : " +name.length());
        for( i=0;i<13;i++)
        {
            if(name.charAt(i)=='a')
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("'a' number of times present :"+count);
    }

}
