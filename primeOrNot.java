import java.util.Scanner;
public class primeOrNot{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("Prime");
        s.close();
    }
}