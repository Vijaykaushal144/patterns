import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int number=sc.nextInt();
        int i,j;
        for (i=1;i<=number;i++)
        {
            for (j=1;j<=number;j++)
            {
                if (j>=(number+1)-i)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
