import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        int m=z.nextInt();
        int n=z.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=z.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            int max=a[0][i];
            for(int j=0;j<m;j++)
                if(max<a[j][i])
                {
                    max=a[j][i];
                }
            System.out.println(max);
        }

    }
}