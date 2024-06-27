import java.util.Scanner;
class upper
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        int m=z.nextInt();
        int a[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=z.nextInt();
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i][j]!=0)
                {
                    System.out.print("no");
                    return;
                }
            }
        }
        System.out.print("yes");
    }
}