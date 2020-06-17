package JavaSamples;

public class usingArrayCopying {

	public static void main(String[] args)
	{
		//clone() demo
//		int[] a= {10,20,30};
//		int[] b;
//		b=a.clone();
//		for(int i : b)
//		{
//			System.out.println(i);
//		}
		
			//arraycopy() demo
		
		int[] a= {10,20,30,40,50};
		int[] b= {11,22,33,44,55};
		
		System.out.print("Initially : ");
		System.out.print("\n\t a = ");
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n\t b = ");
		for(int i : b)
		{
			System.out.print(i + " ");
		}
		
		System.arraycopy(a, 3, b, 1, 2);
		
		System.out.print("\n After copying : ");
		System.out.print("\n\t a = ");
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n\t b = ");
		for(int i : b)
		{
			System.out.print(i + " ");
		}
	}

}






















