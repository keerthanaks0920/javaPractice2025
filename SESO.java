import java.util.*;
public class SESO {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int se=0,so=0;
        while(temp>0)
        {
            int rem=temp%10;
            if(rem%2==0) se+=rem;
            else so+=rem;
            temp=temp/10;
        }
        System.out.println(se+" "+so);
        s.close();
    }
}
