import java.util.Scanner;
public class printAscii {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        char ch=s.next().charAt(0);
        i=(int)ch;
        System.out.println(i);
        s.close();
    }
}
