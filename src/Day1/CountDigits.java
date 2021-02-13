package Day1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=sc.nextInt();
    int count=0,n1;
    while (n != 0)
    {
        n1=n%10;
        if(n1==s)
            count++;
        n /= 10;

    }
    System.out.println(count);
}
}
