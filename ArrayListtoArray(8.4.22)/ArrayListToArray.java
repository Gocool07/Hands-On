package excercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	List<String> a=new ArrayList<>();
	public void add()
	{
		a.add("Gokul");
		a.add("Santhosh");
		a.add("Arul");
		System.out.println("Before Change :"+a);
		Object[] o=a.toArray();
		System.out.println("After Change :");
		for(Object y:o)
		{
		
			System.out.println(y +" ");
		}
			
		
	}
	public static void main(String[] args) 
	{
		ArrayListToArray aa=new ArrayListToArray();
		aa.add();
	     
			

	}

}
