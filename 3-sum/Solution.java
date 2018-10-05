import java.util.* ;
public class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in) ;
        int n,i;
        System.out.println("enter size of an array:");
         n = sc.nextInt() ;
        int a[] = new int[n] ;
        System.out.println("enter elements into array:");
        for(i=0;i<n;i++)
            a[i] = sc.nextInt() ;
		Arrays.sort(a) ;
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ") ;
		for(i=0;i<n;i++)
		{
		int j=i+1;
		int k=a.length-1;
		while(j<k)
		{
		if((a[i]+a[j]+a[k])==0)
		{
		System.out.println("true");
            return;
		}
		else if((a[i]+a[j]+a[k])>0)
		{
		k--;
		}
		else if((a[i]+a[j]+a[k])<0)
		{
		j++;
		}
		sc.close();
		}
        }
            System.out.println("false");
        }
		}
