import java.util.*;
import static java.lang.System.out;
class abc
{
	public static void main(String args[])
	{
        int arr[];
        out.println("enter the limit of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        out.println("enter elements in array");
         for(int i=0;i<n;i++)
		 {
            arr[i]=sc.nextInt();
		 }
         out.println("enter elements that you want to search");
		 int s=sc.nextInt();
         for(int i=0;i<n;i++)
		 {
			 if(arr[i]==s)
			 {
				 out.println("elemets found at "+(i+1)+"  position");
			 }
			 
		 }
        	
	}
}