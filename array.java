package excercises;

public class array {

	int a[]=new int[]{34,76,98,10};
	int max=a[0];
	int min=a[0];
	public void max()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Largest Value in Given Array"+max);
	}
	
	public void min()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
				min=a[i];
		}
		System.out.println("Smallest Value in Given Array"+min);
	}
		public static void main(String[] args) 
	{
			array b=new array();
			b.max();
			b.min();
					
			
		  }  
	}


