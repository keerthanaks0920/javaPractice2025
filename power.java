import java.util.*;
public class power {
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int power=s.nextInt();
    int result=1;
    for(int i=0;i<power;i++)
    {
      result*=n;
    }
    System.out.println(result);
    s.close();
 }  
}
