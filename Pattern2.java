public class Pattern2{
    public static void main(String[] args) {
        int n=5,k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(' ');
            }
            while(k!=(2*i-1))
            {
                if((k==0) || (k==2*i-2))
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
                k++;
            }
            k=0;
            System.out.println();
        }
        n--;
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(' ');
            }
            k=0;
            while(k!=(2*i-1))
            {
                if((k==0) || (k==2*i-2))
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
                k++;
            }
            System.out.println();
        }
    }
}