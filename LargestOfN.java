import java.util.Scanner;
public class LargestOfN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int num=s.nextInt();
            if(num>l)
            {
                l=num;
            }
        }
        System.out.println(l);
        s.close();
    }
}
