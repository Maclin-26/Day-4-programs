import java.util.Scanner;
class max
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

        for(int i=0;i<m;i++)
        {
            int max=a[i][0];
            for(int j=0;j<n;j++)
                if(max<a[i][j])
                {
                    max=a[i][j];
                }
            System.out.println(max);
        }


    }
}