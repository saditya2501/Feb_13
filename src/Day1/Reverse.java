package Day1;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int rev=0;
        while (x1!=0)
        {

            rev=(rev*10)+(x1%10);
            x1=x1/10;
        }
        System.out.println(rev);
    }
}