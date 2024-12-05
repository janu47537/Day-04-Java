import java.util.*;
public class primeornot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0)
            {
                c+=1;
                if(i*i!=n)
                {
                    c+=1;
                }
            }
        }
        if(c==n)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}