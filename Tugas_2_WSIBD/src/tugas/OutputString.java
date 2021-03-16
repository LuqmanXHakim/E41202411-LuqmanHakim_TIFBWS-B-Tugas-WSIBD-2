
package tugas;

public class OutputString {
    public static void main(String[] args) {
        
        String s1 = "LUQ";
        String s2 = new String("MAN");
        String s3 = "LU" + "Q";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3 == s1);
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.equals(s1));
        
    }
}
