package Test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int []c=new int[6];
		int i;
		int n=0;
		for( i=0;i<a.length;i++)
		{
			
			c[n]=a[i];
			n=n+2;
		
		}
		int j=1;
			for( i=0;i<b.length;i++)
			{
				c[j]=b[i];
				j=j+2;
					
				
			}
			for( i=0;i<c.length;i++)
			{
				System.out.println(c[i]);
			}
			
			
		}
		
	}


