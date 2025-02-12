import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n ;i++)
        {
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(a+" ");
        }
        s.close();
    }
}
