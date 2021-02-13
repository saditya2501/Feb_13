package Day1;
import java.util.*;

public class GCD {


        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int N1=sc.nextInt();
            int N2=sc.nextInt();
            int hcf=0;
            int Min=Math.min(N1,N2);
            for(int i=1;i<=Min;i++)
            {
                if((N1%i==0) && (N2%i ==0))
                {
                    hcf=i;
                }
            }
            System.out.println(hcf);


        }
    }

