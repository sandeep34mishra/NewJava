public class BufferString {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Lingaya's");
        System.out.println("string = " + str);
        str.insert(8, 'p');
        str.append("Vidyapeeth");
        System.out.println(str);
        str.append(1);
        System.out.print("After insertion = ");
        System.out.println(str.toString());
        System.out.println(str);
    }
}
