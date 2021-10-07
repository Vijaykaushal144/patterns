import java.util.Scanner;

public class Pattern6 {
    public static <row> void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row first after column=");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int i,j;
        for (i=1;i<=row;i++)
        {
            int k = 1;
            for (j=1;j<=column;j++)
            {
                if (j>=(row+1)-i && j<=(row-1)+i)
                {
                    System.out.print(k);

                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
